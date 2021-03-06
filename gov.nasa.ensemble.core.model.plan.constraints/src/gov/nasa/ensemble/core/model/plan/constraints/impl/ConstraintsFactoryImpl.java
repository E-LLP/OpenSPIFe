/*******************************************************************************
 * Copyright 2014 United States Government as represented by the
 * Administrator of the National Aeronautics and Space Administration.
 * All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gov.nasa.ensemble.core.model.plan.constraints.impl;

import gov.nasa.ensemble.core.model.plan.constraints.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConstraintsFactoryImpl extends EFactoryImpl implements ConstraintsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConstraintsFactory init() {
		try {
			ConstraintsFactory theConstraintsFactory = (ConstraintsFactory)EPackage.Registry.INSTANCE.getEFactory("platform:/resource/gov.nasa.ensemble.core.model.plan.constraints/model/ConstraintsPlanning.ecore"); 
			if (theConstraintsFactory != null) {
				return theConstraintsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ConstraintsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ConstraintsPackage.CONSTRAINTS_MEMBER: return createConstraintsMember();
			case ConstraintsPackage.CONSTRAINT_POINT: return createConstraintPoint();
			case ConstraintsPackage.BINARY_TEMPORAL_CONSTRAINT: return createBinaryTemporalConstraint();
			case ConstraintsPackage.PERIODIC_TEMPORAL_CONSTRAINT: return createPeriodicTemporalConstraint();
			case ConstraintsPackage.TEMPORAL_CHAIN: return createTemporalChain();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstraintsMember createConstraintsMember() {
		ConstraintsMemberImpl constraintsMember = new ConstraintsMemberImpl();
		return constraintsMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstraintPoint createConstraintPoint() {
		ConstraintPointImpl constraintPoint = new ConstraintPointImpl();
		return constraintPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BinaryTemporalConstraint createBinaryTemporalConstraint() {
		BinaryTemporalConstraintImpl binaryTemporalConstraint = new BinaryTemporalConstraintImpl();
		return binaryTemporalConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PeriodicTemporalConstraint createPeriodicTemporalConstraint() {
		PeriodicTemporalConstraintImpl periodicTemporalConstraint = new PeriodicTemporalConstraintImpl();
		return periodicTemporalConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TemporalChain createTemporalChain() {
		TemporalChainImpl temporalChain = new TemporalChainImpl();
		return temporalChain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstraintsPackage getConstraintsPackage() {
		return (ConstraintsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ConstraintsPackage getPackage() {
		return ConstraintsPackage.eINSTANCE;
	}

} //ConstraintsFactoryImpl
