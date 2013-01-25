/*
 * Copyright (c) 2012 Marsha Chechik, Alessio Di Sandro, Michalis Famelis,
 * Rick Salay, Vivien Suen.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Alessio Di Sandro - Implementation.
 */
package edu.toronto.cs.se.mmtf.mid.relationship.diagram.edit.commands;

import java.util.List;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import edu.toronto.cs.se.mmtf.MMTFException;
import edu.toronto.cs.se.mmtf.MultiModelLightTypeFactory;
import edu.toronto.cs.se.mmtf.MultiModelTypeFactory;
import edu.toronto.cs.se.mmtf.mid.relationship.BinaryLinkReference;
import edu.toronto.cs.se.mmtf.mid.relationship.ModelElementEndpoint;
import edu.toronto.cs.se.mmtf.mid.relationship.ModelElementEndpointReference;
import edu.toronto.cs.se.mmtf.mid.relationship.ModelElementReference;
import edu.toronto.cs.se.mmtf.mid.relationship.diagram.trait.RelationshipDiagramTrait;
import edu.toronto.cs.se.mmtf.mid.trait.MultiModelConstraintChecker;
import edu.toronto.cs.se.mmtf.mid.trait.MultiModelInstanceFactory;

/**
 * The command to change a model element reference of a binary mapping link.
 * 
 * @author Alessio Di Sandro
 * 
 */
public class BinaryLinkReferenceChangeModelElementReferenceCommand extends BinaryLinkReferenceReorientCommand {

	private List<String> modelElemTypeEndpointUris;

	/**
	 * Constructor: initialises the superclass.
	 * 
	 * @param request
	 *            The request.
	 */
	public BinaryLinkReferenceChangeModelElementReferenceCommand(ReorientRelationshipRequest request) {

		super(request);
		modelElemTypeEndpointUris = null;
	}

	/**
	 * Checks if a model element reference can be changed.
	 * 
	 * @return True if a model element reference can be changed, false
	 *         otherwise.
	 */
	@Override
	public boolean canExecute() {

		return
			super.canExecute() && (
				MultiModelConstraintChecker.isInstancesLevel(getLink()) ||
				!MultiModelConstraintChecker.isRootType(getLink())
			);
	}

	/**
	 * Checks if the source model element reference can be reoriented.
	 * 
	 * @return True if the source model element reference can be reoriented,
	 *         false otherwise.
	 */
	@Override
	protected boolean canReorientSource() {

		boolean instance = MultiModelConstraintChecker.isInstancesLevel(getLink());

		return
			super.canReorientSource() && ((
				instance &&
				(modelElemTypeEndpointUris = MultiModelConstraintChecker.getAllowedModelElementEndpointReferences(getLink(), getNewSource())) != null
			) || (
				!instance &&
				MultiModelConstraintChecker.isAllowedModelElementTypeEndpointReference(getLink(), getNewSource(), null)
			));
	}

	/**
	 * Checks if the target model element reference can be reoriented.
	 * 
	 * @return True if the target model element reference can be reoriented,
	 *         false otherwise.
	 */
	@Override
	protected boolean canReorientTarget() {

		boolean instance = MultiModelConstraintChecker.isInstancesLevel(getLink());

		return
			super.canReorientTarget() && ((
				instance &&
				(modelElemTypeEndpointUris = MultiModelConstraintChecker.getAllowedModelElementEndpointReferences(getLink(), getNewTarget())) != null
			) || (
				!instance &&
				MultiModelConstraintChecker.isAllowedModelElementTypeEndpointReference(getLink(), null, getNewTarget())
			));
	}

	protected void doExecuteInstancesLevel(BinaryLinkReference linkRef, ModelElementReference modelElemRef, boolean isBinarySrc) throws Exception {

		ModelElementEndpointReference oldModelElemEndpointRef = (isBinarySrc) ?
			linkRef.getModelElemEndpointRefs().get(0) :
			linkRef.getModelElemEndpointRefs().get(1);
		MultiModelInstanceFactory.removeModelElementEndpointAndModelElementEndpointReference(oldModelElemEndpointRef, false);
		ModelElementEndpointReference modelElemTypeEndpointRef = RelationshipDiagramTrait.selectModelElementTypeEndpointToCreate(linkRef, modelElemTypeEndpointUris);
		MultiModelInstanceFactory.replaceModelElementEndpointAndModelElementEndpointReference(
			oldModelElemEndpointRef,
			modelElemTypeEndpointRef.getObject(),
			linkRef,
			modelElemRef
		);
	}

	protected void doExecuteTypesLevel(BinaryLinkReference linkTypeRef, ModelElementReference modelElemTypeRef, boolean isBinarySrc) throws MMTFException {

		ModelElementEndpointReference oldModelElemTypeEndpointRef = (isBinarySrc) ?
			linkTypeRef.getModelElemEndpointRefs().get(0) :
			linkTypeRef.getModelElemEndpointRefs().get(1);
		MultiModelTypeFactory.removeModelElementTypeEndpointAndModelElementTypeEndpointReference(oldModelElemTypeEndpointRef, false);
		String newModelElemTypeEndpointName = oldModelElemTypeEndpointRef.getObject().getName();
		//TODO MMTF: search for override (only if we're not inheriting from a root type)
		ModelElementEndpointReference modelElemTypeEndpointRef = null;
		ModelElementEndpoint modelElemTypeEndpoint = (modelElemTypeEndpointRef == null) ? null : modelElemTypeEndpointRef.getObject();
		MultiModelLightTypeFactory.replaceLightModelElementTypeEndpointAndModelElementTypeEndpointReference(
			oldModelElemTypeEndpointRef,
			linkTypeRef,
			modelElemTypeEndpoint,
			modelElemTypeEndpointRef,
			modelElemTypeRef,
			newModelElemTypeEndpointName
		);
		// no need to init type hierarchy, no need for undo/redo
	}

	/**
	 * Changes the source model element reference of a binary link.
	 * 
	 * @return The ok result.
	 * @throws ExecutionException
	 *             Never thrown.
	 */
	@Override
	protected CommandResult reorientSource() throws ExecutionException {

		try {
			if (MultiModelConstraintChecker.isInstancesLevel(getLink())) {
				doExecuteInstancesLevel(getLink(), getNewSource(), true);
			}
			else {
				doExecuteTypesLevel(getLink(), getNewSource(), true);
			}

			return CommandResult.newOKCommandResult(getLink());
		}
		catch (ExecutionException ee) {
			throw ee;
		}
		catch (Exception e) {
			MMTFException.print(MMTFException.Type.WARNING, "No model element endpoint changed", e);
			return CommandResult.newErrorCommandResult("No model element endpoint changed");
		}
	}

	/**
	 * Changes the target model element reference of a binary link.
	 * 
	 * @return The ok result.
	 * @throws ExecutionException
	 *             Never thrown.
	 */
	@Override
	protected CommandResult reorientTarget() throws ExecutionException {

		try {
			if (MultiModelConstraintChecker.isInstancesLevel(getLink())) {
				doExecuteInstancesLevel(getLink(), getNewTarget(), false);
			}
			else {
				doExecuteTypesLevel(getLink(), getNewTarget(), false);
			}

			return CommandResult.newOKCommandResult(getLink());
		}
		catch (ExecutionException ee) {
			throw ee;
		}
		catch (Exception e) {
			MMTFException.print(MMTFException.Type.WARNING, "No model element endpoint changed", e);
			return CommandResult.newErrorCommandResult("No model element endpoint changed");
		}
	}

}