/**
 * Copyright (c) 2013 Marsha Chechik, Alessio Di Sandro, Michalis Famelis,
 * Rick Salay.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Alessio Di Sandro - Implementation.
 */
package edu.toronto.cs.se.modelepedia.kleisli;

import edu.toronto.cs.se.mmtf.mid.MidPackage;

import edu.toronto.cs.se.mmtf.mid.relationship.RelationshipPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see edu.toronto.cs.se.modelepedia.kleisli.KleisliFactory
 * @model kind="package"
 * @generated
 */
public interface KleisliPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "kleisli";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://se.cs.toronto.edu/modelepedia/KleisliModelRel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "kleisli";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	KleisliPackage eINSTANCE = edu.toronto.cs.se.modelepedia.kleisli.impl.KleisliPackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.toronto.cs.se.modelepedia.kleisli.impl.KleisliModelRelImpl <em>Model Rel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.toronto.cs.se.modelepedia.kleisli.impl.KleisliModelRelImpl
	 * @see edu.toronto.cs.se.modelepedia.kleisli.impl.KleisliPackageImpl#getKleisliModelRel()
	 * @generated
	 */
	int KLEISLI_MODEL_REL = 0;

	/**
	 * The feature id for the '<em><b>May</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KLEISLI_MODEL_REL__MAY = RelationshipPackage.MODEL_REL__MAY;

	/**
	 * The feature id for the '<em><b>Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KLEISLI_MODEL_REL__SET = RelationshipPackage.MODEL_REL__SET;

	/**
	 * The feature id for the '<em><b>Var</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KLEISLI_MODEL_REL__VAR = RelationshipPackage.MODEL_REL__VAR;

	/**
	 * The feature id for the '<em><b>Formula Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KLEISLI_MODEL_REL__FORMULA_ID = RelationshipPackage.MODEL_REL__FORMULA_ID;

	/**
	 * The feature id for the '<em><b>Supertype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KLEISLI_MODEL_REL__SUPERTYPE = RelationshipPackage.MODEL_REL__SUPERTYPE;

	/**
	 * The feature id for the '<em><b>Metatype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KLEISLI_MODEL_REL__METATYPE = RelationshipPackage.MODEL_REL__METATYPE;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KLEISLI_MODEL_REL__URI = RelationshipPackage.MODEL_REL__URI;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KLEISLI_MODEL_REL__NAME = RelationshipPackage.MODEL_REL__NAME;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KLEISLI_MODEL_REL__LEVEL = RelationshipPackage.MODEL_REL__LEVEL;

	/**
	 * The feature id for the '<em><b>Metatype Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KLEISLI_MODEL_REL__METATYPE_URI = RelationshipPackage.MODEL_REL__METATYPE_URI;

	/**
	 * The feature id for the '<em><b>Dynamic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KLEISLI_MODEL_REL__DYNAMIC = RelationshipPackage.MODEL_REL__DYNAMIC;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KLEISLI_MODEL_REL__CONSTRAINT = RelationshipPackage.MODEL_REL__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Inc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KLEISLI_MODEL_REL__INC = RelationshipPackage.MODEL_REL__INC;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KLEISLI_MODEL_REL__ORIGIN = RelationshipPackage.MODEL_REL__ORIGIN;

	/**
	 * The feature id for the '<em><b>File Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KLEISLI_MODEL_REL__FILE_EXTENSION = RelationshipPackage.MODEL_REL__FILE_EXTENSION;

	/**
	 * The feature id for the '<em><b>Editors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KLEISLI_MODEL_REL__EDITORS = RelationshipPackage.MODEL_REL__EDITORS;

	/**
	 * The feature id for the '<em><b>Model Elems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KLEISLI_MODEL_REL__MODEL_ELEMS = RelationshipPackage.MODEL_REL__MODEL_ELEMS;

	/**
	 * The feature id for the '<em><b>Conversion Operators</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KLEISLI_MODEL_REL__CONVERSION_OPERATORS = RelationshipPackage.MODEL_REL__CONVERSION_OPERATORS;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KLEISLI_MODEL_REL__ABSTRACT = RelationshipPackage.MODEL_REL__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Model Endpoints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KLEISLI_MODEL_REL__MODEL_ENDPOINTS = RelationshipPackage.MODEL_REL__MODEL_ENDPOINTS;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KLEISLI_MODEL_REL__LINKS = RelationshipPackage.MODEL_REL__LINKS;

	/**
	 * The feature id for the '<em><b>Model Endpoint Refs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KLEISLI_MODEL_REL__MODEL_ENDPOINT_REFS = RelationshipPackage.MODEL_REL__MODEL_ENDPOINT_REFS;

	/**
	 * The feature id for the '<em><b>Link Refs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KLEISLI_MODEL_REL__LINK_REFS = RelationshipPackage.MODEL_REL__LINK_REFS;

	/**
	 * The number of structural features of the '<em>Model Rel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KLEISLI_MODEL_REL_FEATURE_COUNT = RelationshipPackage.MODEL_REL_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Metatype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KLEISLI_MODEL_REL___GET_METATYPE = RelationshipPackage.MODEL_REL___GET_METATYPE;

	/**
	 * The operation id for the '<em>Get Supertype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KLEISLI_MODEL_REL___GET_SUPERTYPE = RelationshipPackage.MODEL_REL___GET_SUPERTYPE;

	/**
	 * The operation id for the '<em>Create Subtype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KLEISLI_MODEL_REL___CREATE_SUBTYPE__STRING_BOOLEAN_STRING_STRING = RelationshipPackage.MODEL_REL_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Delete Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KLEISLI_MODEL_REL___DELETE_TYPE = RelationshipPackage.MODEL_REL_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Create Instance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KLEISLI_MODEL_REL___CREATE_INSTANCE__STRING_BOOLEAN_MODELORIGIN_MULTIMODEL = RelationshipPackage.MODEL_REL_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Delete Instance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KLEISLI_MODEL_REL___DELETE_INSTANCE = RelationshipPackage.MODEL_REL_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Model Rel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KLEISLI_MODEL_REL_OPERATION_COUNT = RelationshipPackage.MODEL_REL_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link edu.toronto.cs.se.modelepedia.kleisli.impl.KleisliModelEndpointImpl <em>Model Endpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.toronto.cs.se.modelepedia.kleisli.impl.KleisliModelEndpointImpl
	 * @see edu.toronto.cs.se.modelepedia.kleisli.impl.KleisliPackageImpl#getKleisliModelEndpoint()
	 * @generated
	 */
	int KLEISLI_MODEL_ENDPOINT = 1;

	/**
	 * The feature id for the '<em><b>May</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KLEISLI_MODEL_ENDPOINT__MAY = MidPackage.MODEL_ENDPOINT__MAY;

	/**
	 * The feature id for the '<em><b>Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KLEISLI_MODEL_ENDPOINT__SET = MidPackage.MODEL_ENDPOINT__SET;

	/**
	 * The feature id for the '<em><b>Var</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KLEISLI_MODEL_ENDPOINT__VAR = MidPackage.MODEL_ENDPOINT__VAR;

	/**
	 * The feature id for the '<em><b>Formula Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KLEISLI_MODEL_ENDPOINT__FORMULA_ID = MidPackage.MODEL_ENDPOINT__FORMULA_ID;

	/**
	 * The feature id for the '<em><b>Supertype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KLEISLI_MODEL_ENDPOINT__SUPERTYPE = MidPackage.MODEL_ENDPOINT__SUPERTYPE;

	/**
	 * The feature id for the '<em><b>Metatype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KLEISLI_MODEL_ENDPOINT__METATYPE = MidPackage.MODEL_ENDPOINT__METATYPE;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KLEISLI_MODEL_ENDPOINT__URI = MidPackage.MODEL_ENDPOINT__URI;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KLEISLI_MODEL_ENDPOINT__NAME = MidPackage.MODEL_ENDPOINT__NAME;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KLEISLI_MODEL_ENDPOINT__LEVEL = MidPackage.MODEL_ENDPOINT__LEVEL;

	/**
	 * The feature id for the '<em><b>Metatype Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KLEISLI_MODEL_ENDPOINT__METATYPE_URI = MidPackage.MODEL_ENDPOINT__METATYPE_URI;

	/**
	 * The feature id for the '<em><b>Dynamic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KLEISLI_MODEL_ENDPOINT__DYNAMIC = MidPackage.MODEL_ENDPOINT__DYNAMIC;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KLEISLI_MODEL_ENDPOINT__CONSTRAINT = MidPackage.MODEL_ENDPOINT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KLEISLI_MODEL_ENDPOINT__LOWER_BOUND = MidPackage.MODEL_ENDPOINT__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KLEISLI_MODEL_ENDPOINT__UPPER_BOUND = MidPackage.MODEL_ENDPOINT__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KLEISLI_MODEL_ENDPOINT__TARGET = MidPackage.MODEL_ENDPOINT__TARGET;

	/**
	 * The feature id for the '<em><b>Target Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KLEISLI_MODEL_ENDPOINT__TARGET_URI = MidPackage.MODEL_ENDPOINT__TARGET_URI;

	/**
	 * The number of structural features of the '<em>Model Endpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KLEISLI_MODEL_ENDPOINT_FEATURE_COUNT = MidPackage.MODEL_ENDPOINT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Supertype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KLEISLI_MODEL_ENDPOINT___GET_SUPERTYPE = MidPackage.MODEL_ENDPOINT___GET_SUPERTYPE;

	/**
	 * The operation id for the '<em>Get Target</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KLEISLI_MODEL_ENDPOINT___GET_TARGET = MidPackage.MODEL_ENDPOINT___GET_TARGET;

	/**
	 * The operation id for the '<em>Get Metatype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KLEISLI_MODEL_ENDPOINT___GET_METATYPE = MidPackage.MODEL_ENDPOINT___GET_METATYPE;

	/**
	 * The operation id for the '<em>Create Subtype And Reference</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KLEISLI_MODEL_ENDPOINT___CREATE_SUBTYPE_AND_REFERENCE__MODELENDPOINTREFERENCE_STRING_MODEL_BOOLEAN_MODELREL = MidPackage.MODEL_ENDPOINT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Replace Subtype And Reference</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KLEISLI_MODEL_ENDPOINT___REPLACE_SUBTYPE_AND_REFERENCE__MODELENDPOINT_MODELENDPOINTREFERENCE_STRING_MODEL_MODELREL = MidPackage.MODEL_ENDPOINT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Delete Type And Reference</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KLEISLI_MODEL_ENDPOINT___DELETE_TYPE_AND_REFERENCE__BOOLEAN = MidPackage.MODEL_ENDPOINT_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Model Endpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KLEISLI_MODEL_ENDPOINT_OPERATION_COUNT = MidPackage.MODEL_ENDPOINT_OPERATION_COUNT + 3;


	/**
	 * The meta object id for the '{@link edu.toronto.cs.se.modelepedia.kleisli.impl.KleisliBinaryModelRelImpl <em>Binary Model Rel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.toronto.cs.se.modelepedia.kleisli.impl.KleisliBinaryModelRelImpl
	 * @see edu.toronto.cs.se.modelepedia.kleisli.impl.KleisliPackageImpl#getKleisliBinaryModelRel()
	 * @generated
	 */
	int KLEISLI_BINARY_MODEL_REL = 2;

	/**
	 * The feature id for the '<em><b>May</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KLEISLI_BINARY_MODEL_REL__MAY = RelationshipPackage.BINARY_MODEL_REL__MAY;

	/**
	 * The feature id for the '<em><b>Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KLEISLI_BINARY_MODEL_REL__SET = RelationshipPackage.BINARY_MODEL_REL__SET;

	/**
	 * The feature id for the '<em><b>Var</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KLEISLI_BINARY_MODEL_REL__VAR = RelationshipPackage.BINARY_MODEL_REL__VAR;

	/**
	 * The feature id for the '<em><b>Formula Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KLEISLI_BINARY_MODEL_REL__FORMULA_ID = RelationshipPackage.BINARY_MODEL_REL__FORMULA_ID;

	/**
	 * The feature id for the '<em><b>Supertype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KLEISLI_BINARY_MODEL_REL__SUPERTYPE = RelationshipPackage.BINARY_MODEL_REL__SUPERTYPE;

	/**
	 * The feature id for the '<em><b>Metatype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KLEISLI_BINARY_MODEL_REL__METATYPE = RelationshipPackage.BINARY_MODEL_REL__METATYPE;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KLEISLI_BINARY_MODEL_REL__URI = RelationshipPackage.BINARY_MODEL_REL__URI;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KLEISLI_BINARY_MODEL_REL__NAME = RelationshipPackage.BINARY_MODEL_REL__NAME;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KLEISLI_BINARY_MODEL_REL__LEVEL = RelationshipPackage.BINARY_MODEL_REL__LEVEL;

	/**
	 * The feature id for the '<em><b>Metatype Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KLEISLI_BINARY_MODEL_REL__METATYPE_URI = RelationshipPackage.BINARY_MODEL_REL__METATYPE_URI;

	/**
	 * The feature id for the '<em><b>Dynamic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KLEISLI_BINARY_MODEL_REL__DYNAMIC = RelationshipPackage.BINARY_MODEL_REL__DYNAMIC;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KLEISLI_BINARY_MODEL_REL__CONSTRAINT = RelationshipPackage.BINARY_MODEL_REL__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Inc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KLEISLI_BINARY_MODEL_REL__INC = RelationshipPackage.BINARY_MODEL_REL__INC;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KLEISLI_BINARY_MODEL_REL__ORIGIN = RelationshipPackage.BINARY_MODEL_REL__ORIGIN;

	/**
	 * The feature id for the '<em><b>File Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KLEISLI_BINARY_MODEL_REL__FILE_EXTENSION = RelationshipPackage.BINARY_MODEL_REL__FILE_EXTENSION;

	/**
	 * The feature id for the '<em><b>Editors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KLEISLI_BINARY_MODEL_REL__EDITORS = RelationshipPackage.BINARY_MODEL_REL__EDITORS;

	/**
	 * The feature id for the '<em><b>Model Elems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KLEISLI_BINARY_MODEL_REL__MODEL_ELEMS = RelationshipPackage.BINARY_MODEL_REL__MODEL_ELEMS;

	/**
	 * The feature id for the '<em><b>Conversion Operators</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KLEISLI_BINARY_MODEL_REL__CONVERSION_OPERATORS = RelationshipPackage.BINARY_MODEL_REL__CONVERSION_OPERATORS;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KLEISLI_BINARY_MODEL_REL__ABSTRACT = RelationshipPackage.BINARY_MODEL_REL__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Model Endpoints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KLEISLI_BINARY_MODEL_REL__MODEL_ENDPOINTS = RelationshipPackage.BINARY_MODEL_REL__MODEL_ENDPOINTS;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KLEISLI_BINARY_MODEL_REL__LINKS = RelationshipPackage.BINARY_MODEL_REL__LINKS;

	/**
	 * The feature id for the '<em><b>Model Endpoint Refs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KLEISLI_BINARY_MODEL_REL__MODEL_ENDPOINT_REFS = RelationshipPackage.BINARY_MODEL_REL__MODEL_ENDPOINT_REFS;

	/**
	 * The feature id for the '<em><b>Link Refs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KLEISLI_BINARY_MODEL_REL__LINK_REFS = RelationshipPackage.BINARY_MODEL_REL__LINK_REFS;

	/**
	 * The feature id for the '<em><b>Source Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KLEISLI_BINARY_MODEL_REL__SOURCE_MODEL = RelationshipPackage.BINARY_MODEL_REL__SOURCE_MODEL;

	/**
	 * The feature id for the '<em><b>Target Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KLEISLI_BINARY_MODEL_REL__TARGET_MODEL = RelationshipPackage.BINARY_MODEL_REL__TARGET_MODEL;

	/**
	 * The number of structural features of the '<em>Binary Model Rel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KLEISLI_BINARY_MODEL_REL_FEATURE_COUNT = RelationshipPackage.BINARY_MODEL_REL_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Metatype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KLEISLI_BINARY_MODEL_REL___GET_METATYPE = RelationshipPackage.BINARY_MODEL_REL___GET_METATYPE;

	/**
	 * The operation id for the '<em>Get Supertype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KLEISLI_BINARY_MODEL_REL___GET_SUPERTYPE = RelationshipPackage.BINARY_MODEL_REL___GET_SUPERTYPE;

	/**
	 * The operation id for the '<em>Create Subtype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KLEISLI_BINARY_MODEL_REL___CREATE_SUBTYPE__STRING_BOOLEAN_STRING_STRING = RelationshipPackage.BINARY_MODEL_REL_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Delete Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KLEISLI_BINARY_MODEL_REL___DELETE_TYPE = RelationshipPackage.BINARY_MODEL_REL_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Create Instance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KLEISLI_BINARY_MODEL_REL___CREATE_INSTANCE__STRING_BOOLEAN_MODELORIGIN_MULTIMODEL = RelationshipPackage.BINARY_MODEL_REL_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Delete Instance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KLEISLI_BINARY_MODEL_REL___DELETE_INSTANCE = RelationshipPackage.BINARY_MODEL_REL_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Binary Model Rel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KLEISLI_BINARY_MODEL_REL_OPERATION_COUNT = RelationshipPackage.BINARY_MODEL_REL_OPERATION_COUNT + 4;


	/**
	 * Returns the meta object for class '{@link edu.toronto.cs.se.modelepedia.kleisli.KleisliModelRel <em>Model Rel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Rel</em>'.
	 * @see edu.toronto.cs.se.modelepedia.kleisli.KleisliModelRel
	 * @generated
	 */
	EClass getKleisliModelRel();

	/**
	 * Returns the meta object for the '{@link edu.toronto.cs.se.modelepedia.kleisli.KleisliModelRel#createSubtype(java.lang.String, boolean, java.lang.String, java.lang.String) <em>Create Subtype</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Subtype</em>' operation.
	 * @see edu.toronto.cs.se.modelepedia.kleisli.KleisliModelRel#createSubtype(java.lang.String, boolean, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getKleisliModelRel__CreateSubtype__String_boolean_String_String();

	/**
	 * Returns the meta object for the '{@link edu.toronto.cs.se.modelepedia.kleisli.KleisliModelRel#deleteType() <em>Delete Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Delete Type</em>' operation.
	 * @see edu.toronto.cs.se.modelepedia.kleisli.KleisliModelRel#deleteType()
	 * @generated
	 */
	EOperation getKleisliModelRel__DeleteType();

	/**
	 * Returns the meta object for the '{@link edu.toronto.cs.se.modelepedia.kleisli.KleisliModelRel#createInstance(java.lang.String, boolean, edu.toronto.cs.se.mmtf.mid.ModelOrigin, edu.toronto.cs.se.mmtf.mid.MultiModel) <em>Create Instance</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Instance</em>' operation.
	 * @see edu.toronto.cs.se.modelepedia.kleisli.KleisliModelRel#createInstance(java.lang.String, boolean, edu.toronto.cs.se.mmtf.mid.ModelOrigin, edu.toronto.cs.se.mmtf.mid.MultiModel)
	 * @generated
	 */
	EOperation getKleisliModelRel__CreateInstance__String_boolean_ModelOrigin_MultiModel();

	/**
	 * Returns the meta object for the '{@link edu.toronto.cs.se.modelepedia.kleisli.KleisliModelRel#deleteInstance() <em>Delete Instance</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Delete Instance</em>' operation.
	 * @see edu.toronto.cs.se.modelepedia.kleisli.KleisliModelRel#deleteInstance()
	 * @generated
	 */
	EOperation getKleisliModelRel__DeleteInstance();

	/**
	 * Returns the meta object for class '{@link edu.toronto.cs.se.modelepedia.kleisli.KleisliModelEndpoint <em>Model Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Endpoint</em>'.
	 * @see edu.toronto.cs.se.modelepedia.kleisli.KleisliModelEndpoint
	 * @generated
	 */
	EClass getKleisliModelEndpoint();

	/**
	 * Returns the meta object for the '{@link edu.toronto.cs.se.modelepedia.kleisli.KleisliModelEndpoint#createSubtypeAndReference(edu.toronto.cs.se.mmtf.mid.relationship.ModelEndpointReference, java.lang.String, edu.toronto.cs.se.mmtf.mid.Model, boolean, edu.toronto.cs.se.mmtf.mid.relationship.ModelRel) <em>Create Subtype And Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Subtype And Reference</em>' operation.
	 * @see edu.toronto.cs.se.modelepedia.kleisli.KleisliModelEndpoint#createSubtypeAndReference(edu.toronto.cs.se.mmtf.mid.relationship.ModelEndpointReference, java.lang.String, edu.toronto.cs.se.mmtf.mid.Model, boolean, edu.toronto.cs.se.mmtf.mid.relationship.ModelRel)
	 * @generated
	 */
	EOperation getKleisliModelEndpoint__CreateSubtypeAndReference__ModelEndpointReference_String_Model_boolean_ModelRel();

	/**
	 * Returns the meta object for the '{@link edu.toronto.cs.se.modelepedia.kleisli.KleisliModelEndpoint#replaceSubtypeAndReference(edu.toronto.cs.se.mmtf.mid.ModelEndpoint, edu.toronto.cs.se.mmtf.mid.relationship.ModelEndpointReference, java.lang.String, edu.toronto.cs.se.mmtf.mid.Model, edu.toronto.cs.se.mmtf.mid.relationship.ModelRel) <em>Replace Subtype And Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Replace Subtype And Reference</em>' operation.
	 * @see edu.toronto.cs.se.modelepedia.kleisli.KleisliModelEndpoint#replaceSubtypeAndReference(edu.toronto.cs.se.mmtf.mid.ModelEndpoint, edu.toronto.cs.se.mmtf.mid.relationship.ModelEndpointReference, java.lang.String, edu.toronto.cs.se.mmtf.mid.Model, edu.toronto.cs.se.mmtf.mid.relationship.ModelRel)
	 * @generated
	 */
	EOperation getKleisliModelEndpoint__ReplaceSubtypeAndReference__ModelEndpoint_ModelEndpointReference_String_Model_ModelRel();

	/**
	 * Returns the meta object for the '{@link edu.toronto.cs.se.modelepedia.kleisli.KleisliModelEndpoint#deleteTypeAndReference(boolean) <em>Delete Type And Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Delete Type And Reference</em>' operation.
	 * @see edu.toronto.cs.se.modelepedia.kleisli.KleisliModelEndpoint#deleteTypeAndReference(boolean)
	 * @generated
	 */
	EOperation getKleisliModelEndpoint__DeleteTypeAndReference__boolean();

	/**
	 * Returns the meta object for class '{@link edu.toronto.cs.se.modelepedia.kleisli.KleisliBinaryModelRel <em>Binary Model Rel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Model Rel</em>'.
	 * @see edu.toronto.cs.se.modelepedia.kleisli.KleisliBinaryModelRel
	 * @generated
	 */
	EClass getKleisliBinaryModelRel();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	KleisliFactory getKleisliFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link edu.toronto.cs.se.modelepedia.kleisli.impl.KleisliModelRelImpl <em>Model Rel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.toronto.cs.se.modelepedia.kleisli.impl.KleisliModelRelImpl
		 * @see edu.toronto.cs.se.modelepedia.kleisli.impl.KleisliPackageImpl#getKleisliModelRel()
		 * @generated
		 */
		EClass KLEISLI_MODEL_REL = eINSTANCE.getKleisliModelRel();

		/**
		 * The meta object literal for the '<em><b>Create Subtype</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation KLEISLI_MODEL_REL___CREATE_SUBTYPE__STRING_BOOLEAN_STRING_STRING = eINSTANCE.getKleisliModelRel__CreateSubtype__String_boolean_String_String();

		/**
		 * The meta object literal for the '<em><b>Delete Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation KLEISLI_MODEL_REL___DELETE_TYPE = eINSTANCE.getKleisliModelRel__DeleteType();

		/**
		 * The meta object literal for the '<em><b>Create Instance</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation KLEISLI_MODEL_REL___CREATE_INSTANCE__STRING_BOOLEAN_MODELORIGIN_MULTIMODEL = eINSTANCE.getKleisliModelRel__CreateInstance__String_boolean_ModelOrigin_MultiModel();

		/**
		 * The meta object literal for the '<em><b>Delete Instance</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation KLEISLI_MODEL_REL___DELETE_INSTANCE = eINSTANCE.getKleisliModelRel__DeleteInstance();

		/**
		 * The meta object literal for the '{@link edu.toronto.cs.se.modelepedia.kleisli.impl.KleisliModelEndpointImpl <em>Model Endpoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.toronto.cs.se.modelepedia.kleisli.impl.KleisliModelEndpointImpl
		 * @see edu.toronto.cs.se.modelepedia.kleisli.impl.KleisliPackageImpl#getKleisliModelEndpoint()
		 * @generated
		 */
		EClass KLEISLI_MODEL_ENDPOINT = eINSTANCE.getKleisliModelEndpoint();

		/**
		 * The meta object literal for the '<em><b>Create Subtype And Reference</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation KLEISLI_MODEL_ENDPOINT___CREATE_SUBTYPE_AND_REFERENCE__MODELENDPOINTREFERENCE_STRING_MODEL_BOOLEAN_MODELREL = eINSTANCE.getKleisliModelEndpoint__CreateSubtypeAndReference__ModelEndpointReference_String_Model_boolean_ModelRel();

		/**
		 * The meta object literal for the '<em><b>Replace Subtype And Reference</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation KLEISLI_MODEL_ENDPOINT___REPLACE_SUBTYPE_AND_REFERENCE__MODELENDPOINT_MODELENDPOINTREFERENCE_STRING_MODEL_MODELREL = eINSTANCE.getKleisliModelEndpoint__ReplaceSubtypeAndReference__ModelEndpoint_ModelEndpointReference_String_Model_ModelRel();

		/**
		 * The meta object literal for the '<em><b>Delete Type And Reference</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation KLEISLI_MODEL_ENDPOINT___DELETE_TYPE_AND_REFERENCE__BOOLEAN = eINSTANCE.getKleisliModelEndpoint__DeleteTypeAndReference__boolean();

		/**
		 * The meta object literal for the '{@link edu.toronto.cs.se.modelepedia.kleisli.impl.KleisliBinaryModelRelImpl <em>Binary Model Rel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.toronto.cs.se.modelepedia.kleisli.impl.KleisliBinaryModelRelImpl
		 * @see edu.toronto.cs.se.modelepedia.kleisli.impl.KleisliPackageImpl#getKleisliBinaryModelRel()
		 * @generated
		 */
		EClass KLEISLI_BINARY_MODEL_REL = eINSTANCE.getKleisliBinaryModelRel();

	}

} //KleisliPackage