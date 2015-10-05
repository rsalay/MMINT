/**
 * Copyright (c) 2012-2015 Marsha Chechik, Alessio Di Sandro, Michalis Famelis,
 * Rick Salay.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Alessio Di Sandro - Implementation.
 */
package edu.toronto.cs.se.mmint.mavo.mavomid;

import edu.toronto.cs.se.mmint.MMINTException;

import edu.toronto.cs.se.mmint.mid.MID;
import edu.toronto.cs.se.mmint.mid.Model;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MAVO Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * MAVO version. {@inheritDoc}
 * <!-- end-model-doc -->
 *
 *
 * @see edu.toronto.cs.se.mmint.mavo.mavomid.MAVOMIDPackage#getMAVOModel()
 * @model
 * @generated
 */
public interface MAVOModel extends Model {
	/**
	 * <!-- begin-user-doc -->
	 * MAVO version. {@inheritDoc}
	 * <!-- end-user-doc -->
	 * @model required="true" exceptions="edu.toronto.cs.se.mmint.mid.MMINTException" newModelTypeNameRequired="true" isMetamodelExtensionRequired="true"
	 * @generated
	 */
	Model createSubtype(String newModelTypeName, String constraintLanguage, String constraintImplementation, boolean isMetamodelExtension) throws MMINTException;

	/**
	 * <!-- begin-user-doc -->
	 * MAVO version. {@inheritDoc}
	 * <!-- end-user-doc -->
	 * @model required="true" exceptions="edu.toronto.cs.se.mmint.mid.MMINTException" newModelUriRequired="true"
	 * @generated
	 */
	Model createInstance(String newModelUri, MID instanceMID) throws MMINTException;

	/**
	 * <!-- begin-user-doc -->
	 * MAVO version. {@inheritDoc}
	 * <!-- end-user-doc -->
	 * @model required="true" exceptions="edu.toronto.cs.se.mmint.mid.MMINTException" newModelUriRequired="true"
	 * @generated
	 */
	Model createInstanceAndEditor(String newModelUri, MID instanceMID) throws MMINTException;

	/**
	 * <!-- begin-user-doc -->
	 * MAVO version. {@inheritDoc}
	 * <!-- end-user-doc -->
	 * @model required="true" exceptions="edu.toronto.cs.se.mmint.mid.MMINTException" modelUriRequired="true"
	 * @generated
	 */
	Model importInstance(String modelUri, MID instanceMID) throws MMINTException;

	/**
	 * <!-- begin-user-doc -->
	 * MAVO version. {@inheritDoc}
	 * <!-- end-user-doc -->
	 * @model required="true" exceptions="edu.toronto.cs.se.mmint.mid.MMINTException" modelUriRequired="true"
	 * @generated
	 */
	Model importInstanceAndEditor(String modelUri, MID instanceMID) throws MMINTException;

} // MAVOModel