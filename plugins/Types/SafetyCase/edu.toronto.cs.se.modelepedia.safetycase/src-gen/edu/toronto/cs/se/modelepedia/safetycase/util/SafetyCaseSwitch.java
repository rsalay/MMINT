/**
 * Copyright (c) 2012-2017 Marsha Chechik, Alessio Di Sandro, Michalis Famelis,
 * Rick Salay, Nick Fung.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Alessio Di Sandro - Implementation.
 *    Nick Fung - Implementation.
 */
package edu.toronto.cs.se.modelepedia.safetycase.util;

import edu.toronto.cs.se.modelepedia.safetycase.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see edu.toronto.cs.se.modelepedia.safetycase.SafetyCasePackage
 * @generated
 */
public class SafetyCaseSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SafetyCasePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SafetyCaseSwitch() {
		if (modelPackage == null) {
			modelPackage = SafetyCasePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case SafetyCasePackage.SAFETY_CASE: {
				SafetyCase safetyCase = (SafetyCase)theEObject;
				T result = caseSafetyCase(safetyCase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SafetyCasePackage.ARGUMENT_ELEMENT: {
				ArgumentElement argumentElement = (ArgumentElement)theEObject;
				T result = caseArgumentElement(argumentElement);
				if (result == null) result = caseContentfulElement(argumentElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SafetyCasePackage.STATEFUL_ELEMENT: {
				StatefulElement statefulElement = (StatefulElement)theEObject;
				T result = caseStatefulElement(statefulElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SafetyCasePackage.CONTENTFUL_ELEMENT: {
				ContentfulElement contentfulElement = (ContentfulElement)theEObject;
				T result = caseContentfulElement(contentfulElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SafetyCasePackage.ASI_LFUL_ELEMENT: {
				ASILfulElement asiLfulElement = (ASILfulElement)theEObject;
				T result = caseASILfulElement(asiLfulElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SafetyCasePackage.CORE_ELEMENT: {
				CoreElement coreElement = (CoreElement)theEObject;
				T result = caseCoreElement(coreElement);
				if (result == null) result = caseArgumentElement(coreElement);
				if (result == null) result = caseContentfulElement(coreElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SafetyCasePackage.DECOMPOSABLE_CORE_ELEMENT: {
				DecomposableCoreElement decomposableCoreElement = (DecomposableCoreElement)theEObject;
				T result = caseDecomposableCoreElement(decomposableCoreElement);
				if (result == null) result = caseCoreElement(decomposableCoreElement);
				if (result == null) result = caseArgumentElement(decomposableCoreElement);
				if (result == null) result = caseContentfulElement(decomposableCoreElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SafetyCasePackage.CONTEXTUAL_ELEMENT: {
				ContextualElement contextualElement = (ContextualElement)theEObject;
				T result = caseContextualElement(contextualElement);
				if (result == null) result = caseArgumentElement(contextualElement);
				if (result == null) result = caseContentfulElement(contextualElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SafetyCasePackage.SUPPORTED_BY: {
				SupportedBy supportedBy = (SupportedBy)theEObject;
				T result = caseSupportedBy(supportedBy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SafetyCasePackage.IN_CONTEXT_OF: {
				InContextOf inContextOf = (InContextOf)theEObject;
				T result = caseInContextOf(inContextOf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SafetyCasePackage.GOAL: {
				Goal goal = (Goal)theEObject;
				T result = caseGoal(goal);
				if (result == null) result = caseDecomposableCoreElement(goal);
				if (result == null) result = caseStatefulElement(goal);
				if (result == null) result = caseASILfulElement(goal);
				if (result == null) result = caseCoreElement(goal);
				if (result == null) result = caseArgumentElement(goal);
				if (result == null) result = caseContentfulElement(goal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SafetyCasePackage.STRATEGY: {
				Strategy strategy = (Strategy)theEObject;
				T result = caseStrategy(strategy);
				if (result == null) result = caseDecomposableCoreElement(strategy);
				if (result == null) result = caseCoreElement(strategy);
				if (result == null) result = caseArgumentElement(strategy);
				if (result == null) result = caseContentfulElement(strategy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SafetyCasePackage.BASIC_STRATEGY: {
				BasicStrategy basicStrategy = (BasicStrategy)theEObject;
				T result = caseBasicStrategy(basicStrategy);
				if (result == null) result = caseStrategy(basicStrategy);
				if (result == null) result = caseDecomposableCoreElement(basicStrategy);
				if (result == null) result = caseCoreElement(basicStrategy);
				if (result == null) result = caseArgumentElement(basicStrategy);
				if (result == null) result = caseContentfulElement(basicStrategy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SafetyCasePackage.ASIL_DECOMPOSITION_STRATEGY: {
				ASILDecompositionStrategy asilDecompositionStrategy = (ASILDecompositionStrategy)theEObject;
				T result = caseASILDecompositionStrategy(asilDecompositionStrategy);
				if (result == null) result = caseStrategy(asilDecompositionStrategy);
				if (result == null) result = caseDecomposableCoreElement(asilDecompositionStrategy);
				if (result == null) result = caseCoreElement(asilDecompositionStrategy);
				if (result == null) result = caseArgumentElement(asilDecompositionStrategy);
				if (result == null) result = caseContentfulElement(asilDecompositionStrategy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SafetyCasePackage.SOLUTION: {
				Solution solution = (Solution)theEObject;
				T result = caseSolution(solution);
				if (result == null) result = caseCoreElement(solution);
				if (result == null) result = caseStatefulElement(solution);
				if (result == null) result = caseArgumentElement(solution);
				if (result == null) result = caseContentfulElement(solution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SafetyCasePackage.CONTEXT: {
				Context context = (Context)theEObject;
				T result = caseContext(context);
				if (result == null) result = caseContextualElement(context);
				if (result == null) result = caseArgumentElement(context);
				if (result == null) result = caseContentfulElement(context);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SafetyCasePackage.JUSTIFICATION: {
				Justification justification = (Justification)theEObject;
				T result = caseJustification(justification);
				if (result == null) result = caseContextualElement(justification);
				if (result == null) result = caseArgumentElement(justification);
				if (result == null) result = caseContentfulElement(justification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SafetyCasePackage.ASIL: {
				ASIL asil = (ASIL)theEObject;
				T result = caseASIL(asil);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SafetyCasePackage.CONTENT_IMPACT_ANNOTATION: {
				ContentImpactAnnotation contentImpactAnnotation = (ContentImpactAnnotation)theEObject;
				T result = caseContentImpactAnnotation(contentImpactAnnotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SafetyCasePackage.STATE_IMPACT_ANNOTATION: {
				StateImpactAnnotation stateImpactAnnotation = (StateImpactAnnotation)theEObject;
				T result = caseStateImpactAnnotation(stateImpactAnnotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SafetyCasePackage.ASIL_IMPACT_ANNOTATION: {
				ASILImpactAnnotation asilImpactAnnotation = (ASILImpactAnnotation)theEObject;
				T result = caseASILImpactAnnotation(asilImpactAnnotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Safety Case</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Safety Case</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSafetyCase(SafetyCase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Argument Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Argument Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArgumentElement(ArgumentElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stateful Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stateful Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatefulElement(StatefulElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contentful Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contentful Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContentfulElement(ContentfulElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ASI Lful Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ASI Lful Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseASILfulElement(ASILfulElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Core Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Core Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoreElement(CoreElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decomposable Core Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decomposable Core Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecomposableCoreElement(DecomposableCoreElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contextual Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contextual Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContextualElement(ContextualElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Supported By</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Supported By</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSupportedBy(SupportedBy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>In Context Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>In Context Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInContextOf(InContextOf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Goal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Goal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGoal(Goal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Strategy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStrategy(Strategy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basic Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic Strategy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasicStrategy(BasicStrategy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ASIL Decomposition Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ASIL Decomposition Strategy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseASILDecompositionStrategy(ASILDecompositionStrategy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Solution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Solution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSolution(Solution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContext(Context object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Justification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Justification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJustification(Justification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ASIL</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ASIL</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseASIL(ASIL object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Content Impact Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Content Impact Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContentImpactAnnotation(ContentImpactAnnotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State Impact Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State Impact Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStateImpactAnnotation(StateImpactAnnotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ASIL Impact Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ASIL Impact Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseASILImpactAnnotation(ASILImpactAnnotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //SafetyCaseSwitch
