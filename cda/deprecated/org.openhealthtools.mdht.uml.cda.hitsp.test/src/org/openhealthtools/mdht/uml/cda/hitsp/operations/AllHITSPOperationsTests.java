/*******************************************************************************
 * Copyright (c) 2010, 2011 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.hitsp.operations;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * This class represents a suite of Junit 4 test cases for CDA document
 * processing.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
		AdmissionMedicationHistorySectionOperationsTest.class, AdvanceDirectivesSectionOperationsTest.class,
		AllergiesReactionsSectionOperationsTest.class, AllergyDrugSensitivityOperationsTest.class,
		AssessmentAndPlanSectionOperationsTest.class, ChiefComplaintSectionOperationsTest.class,
		CommentOperationsTest.class, ConditionEntryOperationsTest.class, ConditionOperationsTest.class,
		DiagnosticResultsSectionOperationsTest.class, DischargeDiagnosisSectionOperationsTest.class,
		EncounterOperationsTest.class, EncountersSectionOperationsTest.class, FamilyHistorySectionOperationsTest.class,
		FunctionalStatusSectionOperationsTest.class, HealthcareProviderOperationsTest.class,
		HistoryOfPastIllnessSectionOperationsTest.class, HistoryOfPresentIllnessOperationsTest.class,
		HITSPRegistryDelegateOperationsTest.class, HospitalAdmissionDiagnosisSectionOperationsTest.class,
		HospitalCourseSectionOperationsTest.class, HospitalDischargeMedicationsSectionOperationsTest.class,
		ImmunizationOperationsTest.class, ImmunizationsSectionOperationsTest.class,
		InsuranceProviderOperationsTest.class, LanguageSpokenOperationsTest.class,
		MedicalEquipmentSectionOperationsTest.class, MedicationOperationsTest.class,
		MedicationsAdministeredSectionOperationsTest.class, MedicationsSectionOperationsTest.class,
		MedicationTaperedDoseOperationsTest.class, PatientSummaryOperationsTest.class,
		PayersSectionOperationsTest.class, PhysicalExamSectionOperationsTest.class,
		PlanOfCareSectionOperationsTest.class, ProblemListSectionOperationsTest.class, ProcedureOperationsTest.class,
		ReasonForReferralSectionOperationsTest.class, ResultOperationsTest.class,
		ReviewOfSystemsSectionOperationsTest.class, SocialHistorySectionOperationsTest.class,
		SurgeriesSectionOperationsTest.class, VitalSignOperationsTest.class, VitalSignsSectionOperationsTest.class

})
public class AllHITSPOperationsTests {
	// Nothing
} // AllHITSPOperationsTests
