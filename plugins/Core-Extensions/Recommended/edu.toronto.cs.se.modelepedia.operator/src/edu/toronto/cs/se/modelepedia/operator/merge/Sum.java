/**
 * Copyright (c) 2012-2016 Marsha Chechik, Alessio Di Sandro, Michalis Famelis,
 * Rick Salay.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Alessio Di Sandro - Implementation.
 */
package edu.toronto.cs.se.modelepedia.operator.merge;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.jdt.annotation.NonNull;

import edu.toronto.cs.se.mmint.MMINTException;
import edu.toronto.cs.se.mmint.java.reasoning.IJavaOperatorInputConstraint;
import edu.toronto.cs.se.mmint.mid.GenericElement;
import edu.toronto.cs.se.mmint.mid.MID;
import edu.toronto.cs.se.mmint.mid.Model;
import edu.toronto.cs.se.mmint.mid.operator.impl.OperatorImpl;
import edu.toronto.cs.se.mmint.mid.utils.FileUtils;
import edu.toronto.cs.se.modelepedia.primitive.int_.Int;
import edu.toronto.cs.se.modelepedia.primitive.int_.IntFactory;

public class Sum extends OperatorImpl {

	public static class InputConstraint implements IJavaOperatorInputConstraint {

		@Override
		public boolean isAllowedInput(Map<String, Model> inputsByName) {

			Model intModel1 = inputsByName.get(IN_INT1);
			Model intModel2 = inputsByName.get(IN_INT2);
			if (intModel1 == intModel2) {
				return false;
			}

			return true;
		}
	}

	// input-output
	private final static @NonNull String IN_INT1 = "int1";
	private final static @NonNull String IN_INT2 = "int2";
	private final static @NonNull String OUT_INT = "sum";
	// constants
	private final static @NonNull String SUM_SEPARATOR = "+";

	private @NonNull Int sum(@NonNull Model intModel1, @NonNull Model intModel2) throws MMINTException {

		int sum = ((Int) intModel1.getEMFInstanceRoot()).getValue() + ((Int) intModel2.getEMFInstanceRoot()).getValue();
		Int sumModelObj = IntFactory.eINSTANCE.createInt();
		sumModelObj.setValue(sum);

		return sumModelObj;
	}

	@Override
	public java.util.Map<String, Model> run(
			java.util.Map<String, Model> inputsByName, java.util.Map<String, GenericElement> genericsByName,
			java.util.Map<String, MID> outputMIDsByName) throws Exception {

		// input
		Model intModel1 = inputsByName.get(IN_INT1);
		Model intModel2 = inputsByName.get(IN_INT2);

		// sum the inputs
		Int sumModelObj = sum(intModel1, intModel2);

		// output
		String sumModelUri = FileUtils.replaceFileNameInUri(
			intModel1.getUri(),
			intModel1.getName() + SUM_SEPARATOR + intModel2.getName());
		FileUtils.writeModelFile(sumModelObj, sumModelUri, true);
		Model sumModel = intModel1.getMetatype().createInstanceAndEditor(sumModelUri, outputMIDsByName.get(OUT_INT));
		Map<String, Model> outputsByName = new HashMap<>();
		outputsByName.put(OUT_INT, sumModel);

		return outputsByName;
	}

}
