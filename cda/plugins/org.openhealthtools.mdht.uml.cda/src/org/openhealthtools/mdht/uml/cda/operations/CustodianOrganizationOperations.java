/*******************************************************************************
 * Copyright (c) 2009, 2011 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.CDAPackage;
import org.openhealthtools.mdht.uml.cda.CustodianOrganization;
import org.openhealthtools.mdht.uml.cda.util.CDAValidator;
import org.openhealthtools.mdht.uml.hl7.datatypes.AD;
import org.openhealthtools.mdht.uml.hl7.datatypes.EN;
import org.openhealthtools.mdht.uml.hl7.datatypes.TEL;
import org.openhealthtools.mdht.uml.hl7.rim.operations.EntityOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Custodian Organization</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.CustodianOrganization#validateClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.CustodianOrganization#validateDeterminerCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Determiner Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.CustodianOrganization#getNames() <em>Get Names</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.CustodianOrganization#getTelecoms() <em>Get Telecoms</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.CustodianOrganization#getAddrs() <em>Get Addrs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CustodianOrganizationOperations extends EntityOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustodianOrganizationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateClassCode(CustodianOrganization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateClassCode(CustodianOrganization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.isClassCodeDefined() implies self.classCode=vocab::EntityClassOrganization::ORG";

	/**
	 * The cached OCL invariant for the '{@link #validateClassCode(CustodianOrganization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateClassCode(CustodianOrganization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param custodianOrganization The receiving '<em><b>Custodian Organization</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateClassCode(CustodianOrganization custodianOrganization, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDAPackage.Literals.CUSTODIAN_ORGANIZATION);
			try {
				VALIDATE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(custodianOrganization)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, CDAValidator.DIAGNOSTIC_SOURCE, CDAValidator.CUSTODIAN_ORGANIZATION__CLASS_CODE,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"validateClassCode",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									custodianOrganization, context) }), new Object[] { custodianOrganization }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDeterminerCode(CustodianOrganization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Determiner Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDeterminerCode(CustodianOrganization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DETERMINER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.isDeterminerCodeDefined() implies self.determinerCode=vocab::EntityDeterminer::INSTANCE";

	/**
	 * The cached OCL invariant for the '{@link #validateDeterminerCode(CustodianOrganization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Determiner Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDeterminerCode(CustodianOrganization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_DETERMINER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param custodianOrganization The receiving '<em><b>Custodian Organization</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDeterminerCode(CustodianOrganization custodianOrganization,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_DETERMINER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDAPackage.Literals.CUSTODIAN_ORGANIZATION);
			try {
				VALIDATE_DETERMINER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DETERMINER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DETERMINER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(custodianOrganization)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, CDAValidator.DIAGNOSTIC_SOURCE,
					CDAValidator.CUSTODIAN_ORGANIZATION__DETERMINER_CODE,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"validateDeterminerCode",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									custodianOrganization, context) }), new Object[] { custodianOrganization }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getNames(CustodianOrganization) <em>Get Names</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNames(CustodianOrganization)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_NAMES__EOCL_EXP = "Bag { self.name }";

	/**
	 * The cached OCL query for the '{@link #getNames(CustodianOrganization) <em>Get Names</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNames(CustodianOrganization)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_NAMES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EList<EN> getNames(CustodianOrganization custodianOrganization) {
		if (GET_NAMES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				CDAPackage.Literals.CUSTODIAN_ORGANIZATION,
				CDAPackage.Literals.CUSTODIAN_ORGANIZATION.getEAllOperations().get(16));
			try {
				GET_NAMES__EOCL_QRY = helper.createQuery(GET_NAMES__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_NAMES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<EN> result = (Collection<EN>) query.evaluate(custodianOrganization);
		return new BasicEList.UnmodifiableEList<EN>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getTelecoms(CustodianOrganization) <em>Get Telecoms</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelecoms(CustodianOrganization)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_TELECOMS__EOCL_EXP = "Bag { self.telecom }";

	/**
	 * The cached OCL query for the '{@link #getTelecoms(CustodianOrganization) <em>Get Telecoms</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelecoms(CustodianOrganization)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_TELECOMS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EList<TEL> getTelecoms(CustodianOrganization custodianOrganization) {
		if (GET_TELECOMS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				CDAPackage.Literals.CUSTODIAN_ORGANIZATION,
				CDAPackage.Literals.CUSTODIAN_ORGANIZATION.getEAllOperations().get(17));
			try {
				GET_TELECOMS__EOCL_QRY = helper.createQuery(GET_TELECOMS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_TELECOMS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<TEL> result = (Collection<TEL>) query.evaluate(custodianOrganization);
		return new BasicEList.UnmodifiableEList<TEL>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getAddrs(CustodianOrganization) <em>Get Addrs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddrs(CustodianOrganization)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ADDRS__EOCL_EXP = "Bag { self.addr }";

	/**
	 * The cached OCL query for the '{@link #getAddrs(CustodianOrganization) <em>Get Addrs</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddrs(CustodianOrganization)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ADDRS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EList<AD> getAddrs(CustodianOrganization custodianOrganization) {
		if (GET_ADDRS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				CDAPackage.Literals.CUSTODIAN_ORGANIZATION,
				CDAPackage.Literals.CUSTODIAN_ORGANIZATION.getEAllOperations().get(18));
			try {
				GET_ADDRS__EOCL_QRY = helper.createQuery(GET_ADDRS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ADDRS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<AD> result = (Collection<AD>) query.evaluate(custodianOrganization);
		return new BasicEList.UnmodifiableEList<AD>(result.size(), result.toArray());
	}

} // CustodianOrganizationOperations
