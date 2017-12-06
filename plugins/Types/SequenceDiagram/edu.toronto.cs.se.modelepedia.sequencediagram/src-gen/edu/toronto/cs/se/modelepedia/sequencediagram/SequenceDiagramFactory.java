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
package edu.toronto.cs.se.modelepedia.sequencediagram;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see edu.toronto.cs.se.modelepedia.sequencediagram.SequenceDiagramPackage
 * @generated
 */
public interface SequenceDiagramFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    SequenceDiagramFactory eINSTANCE = edu.toronto.cs.se.modelepedia.sequencediagram.impl.SequenceDiagramFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Sequence Diagram</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Sequence Diagram</em>'.
     * @generated
     */
    SequenceDiagram createSequenceDiagram();

    /**
     * Returns a new object of class '<em>Named Element</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Named Element</em>'.
     * @generated
     */
    NamedElement createNamedElement();

    /**
     * Returns a new object of class '<em>Object</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Object</em>'.
     * @generated
     */
    Object createObject();

    /**
     * Returns a new object of class '<em>Lifeline</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Lifeline</em>'.
     * @generated
     */
    Lifeline createLifeline();

    /**
     * Returns a new object of class '<em>Synchronous Message</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Synchronous Message</em>'.
     * @generated
     */
    SynchronousMessage createSynchronousMessage();

    /**
     * Returns a new object of class '<em>Asynchronous Message</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Asynchronous Message</em>'.
     * @generated
     */
    AsynchronousMessage createAsynchronousMessage();

    /**
     * Returns a new object of class '<em>Return Message</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Return Message</em>'.
     * @generated
     */
    ReturnMessage createReturnMessage();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    SequenceDiagramPackage getSequenceDiagramPackage();

} //SequenceDiagramFactory