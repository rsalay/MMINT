/**
 * Copyright (c) 2012-2017 Marsha Chechik, Alessio Di Sandro, Michalis Famelis,
 * Rick Salay.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Alessio Di Sandro - Implementation.
 */
package edu.toronto.cs.se.mmint.operator.mid;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.jdt.annotation.NonNull;

import edu.toronto.cs.se.mmint.MIDTypeHierarchy;
import edu.toronto.cs.se.mmint.MIDTypeRegistry;
import edu.toronto.cs.se.mmint.MMINT;
import edu.toronto.cs.se.mmint.MMINTConstants;
import edu.toronto.cs.se.mmint.java.reasoning.IJavaOperatorConstraint;
import edu.toronto.cs.se.mmint.mid.GenericElement;
import edu.toronto.cs.se.mmint.mid.MID;
import edu.toronto.cs.se.mmint.mid.Model;
import edu.toronto.cs.se.mmint.mid.operator.GenericEndpoint;
import edu.toronto.cs.se.mmint.mid.operator.OperatorInput;
import edu.toronto.cs.se.mmint.mid.operator.impl.OperatorImpl;
import edu.toronto.cs.se.mmint.mid.reasoning.MIDConstraintChecker;
import edu.toronto.cs.se.mmint.mid.relationship.ModelRel;
import edu.toronto.cs.se.mmint.mid.utils.FileUtils;

public class Filter extends OperatorImpl {

    private Input input;
    private Output output;

    private static class Input {

        private final static @NonNull String IN_MID = "mid";
        private final static @NonNull String GENERIC_MODELTYPE = "TYPE";
        private final static @NonNull String IN_MODELREL = "criterion";
        private Model midModel;
        private Model filterType;
        private boolean isRelFilter;
        private boolean isUnaryRelFilter;

        public Input(Map<String, Model> inputsByName, Map<String, GenericElement> genericsByName) {

            this.midModel = inputsByName.get(IN_MID);
            this.filterType = (Model) genericsByName.get(GENERIC_MODELTYPE);
            this.isRelFilter = this.filterType instanceof ModelRel;
            this.isUnaryRelFilter = this.isRelFilter &&
                                    ((ModelRel) this.filterType).getModelEndpointRefs().size() == 1;
        }
    }

    private static class Output {

        private final static @NonNull String OUT_MID = "filteredMid";
        private final static @NonNull String FILTERED_MID_SUFFIX = "_filtered";
        private Model filteredMIDModel;
        private MID mid;

        public Output(@NonNull Map<String, MID> outputMIDsByName) {

            this.mid = outputMIDsByName.get(OUT_MID);
        }

        public @NonNull Map<String, Model> packed() {

            Map<String, Model> outputsByName = new HashMap<>();
            outputsByName.put(OUT_MID, this.filteredMIDModel);

            return outputsByName;
        }
    }

    public static class Constraint implements IJavaOperatorConstraint {

        @Override
        public boolean isAllowedGeneric(GenericEndpoint genericTypeEndpoint, GenericElement genericType,
                                        List<OperatorInput> inputs) {

            final String FILTER_URI = "http://se.cs.toronto.edu/mmint/Operator_Filter";
            final String FILTERNOT_URI = "http://se.cs.toronto.edu/mmint/Operator_FilterNot";
            final String MAP_URI = "http://se.cs.toronto.edu/mmint/Operator_Map";
            final String REDUCE_URI = "http://se.cs.toronto.edu/mmint/Operator_Reduce";
            String genericTypeUri = genericType.getUri();
            if (
                genericTypeUri.equals(FILTER_URI) || genericTypeUri.equals(FILTERNOT_URI) ||
                genericTypeUri.equals(MAP_URI) || genericTypeUri.equals(REDUCE_URI)
            ) {
                return false;
            }

            return true;
        }
    }

    private void init(@NonNull Map<String, Model> inputsByName, Map<String, GenericElement> genericsByName,
                      @NonNull Map<String, MID> outputMIDsByName) {

        this.input = new Input(inputsByName, genericsByName);
        this.output = new Output(outputMIDsByName);
    }

    protected boolean isFiltered(@NonNull Model model) {

        EList<Model> polyFilterTypes = (Boolean.parseBoolean(MMINT.getPreference(MMINTConstants.PREFERENCE_MENU_POLYMORPHISM_MULTIPLEDISPATCH_ENABLED))) ?
            ECollections.asEList(MIDTypeHierarchy.getSubtypes(this.input.filterType)) :
            ECollections.emptyEList();
        polyFilterTypes.add(this.input.filterType);
        Iterator<Model> polyIter = MIDTypeHierarchy.getInverseTypeHierarchyIterator(polyFilterTypes);
        while (polyIter.hasNext()) { // start from the most specialized filter backwards
            Model polyFilterType = polyIter.next();
            String filterTypeUri = (this.input.isUnaryRelFilter) ?
                ((ModelRel) polyFilterType).getModelEndpointRefs().get(0).getTargetUri() :
                polyFilterType.getUri();
            if (!MIDTypeHierarchy.instanceOf(model, filterTypeUri, false)) {
                continue;
            }
            if (MIDConstraintChecker.checkModelConstraint(model, polyFilterType.getConstraint())) {
                return true;
            }
            else {
                return false;
            }
        }

        return false;
    }

    // filter mid models based on property attached to type
    protected void filter() throws Exception {

        MID filteredMID = (MID) this.input.midModel.getEMFInstanceRoot();
        Set<Model> modelsToDelete = new HashSet<>();
        for (Model model : filteredMID.getModels()) {
            // check constraint only if types are: Model and Model, Model and unary ModelRel, ModelRel and ModelRel
            boolean isRel = model instanceof ModelRel;
            if (
                (!isRel && this.input.isRelFilter && !this.input.isUnaryRelFilter) ||
                (isRel && this.input.isRelFilter && this.input.isUnaryRelFilter) ||
                (isRel && !this.input.isRelFilter)
            ) {
                continue;
            }
            if (this.isFiltered(model)) {
                continue;
            }
            modelsToDelete.add(model);
        }
        for (Model modelToDelete : modelsToDelete) {
            if (modelToDelete.getMIDContainer() == null) {
                // already deleted as side effect of another deletion e.g. model delete that triggers model rel delete
                continue;
            }
            modelToDelete.deleteInstance();
        }

        String filteredMIDModelPath = FileUtils.getUniquePath(
            FileUtils.addFileNameSuffixInPath(this.input.midModel.getUri(), Output.FILTERED_MID_SUFFIX), true, false);
        this.output.filteredMIDModel = MIDTypeRegistry.getMIDModelType()
            .createInstanceAndEditor(filteredMID, filteredMIDModelPath, this.output.mid);
    }

    @Override
    public Map<String, Model> run(Map<String, Model> inputsByName, Map<String, GenericElement> genericsByName,
                                  Map<String, MID> outputMIDsByName) throws Exception {

        init(inputsByName, genericsByName, outputMIDsByName);
        filter();

        return this.output.packed();
    }

}
