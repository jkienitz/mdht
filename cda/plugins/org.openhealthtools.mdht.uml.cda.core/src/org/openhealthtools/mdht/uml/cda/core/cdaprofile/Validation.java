/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.core.cdaprofile;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Validation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.Validation#getMessage <em>Message</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.Validation#getSeverity <em>Severity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.Validation#getRuleId <em>Rule Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.CDAPackage#getValidation()
 * @model abstract="true"
 * @generated
 */
public interface Validation extends EObject {
	/**
	 * Returns the value of the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' attribute.
	 * @see #setMessage(String)
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.CDAPackage#getValidation_Message()
	 * @model ordered="false"
	 * @generated
	 */
	String getMessage();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.Validation#getMessage <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' attribute.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(String value);

	/**
	 * Returns the value of the '<em><b>Severity</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.SeverityKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Severity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Severity</em>' attribute.
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.SeverityKind
	 * @see #setSeverity(SeverityKind)
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.CDAPackage#getValidation_Severity()
	 * @model ordered="false"
	 * @generated
	 */
	SeverityKind getSeverity();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.Validation#getSeverity <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Severity</em>' attribute.
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.SeverityKind
	 * @see #getSeverity()
	 * @generated
	 */
	void setSeverity(SeverityKind value);

	/**
	 * Returns the value of the '<em><b>Rule Id</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule Id</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Id</em>' attribute list.
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.CDAPackage#getValidation_RuleId()
	 * @model ordered="false"
	 * @generated
	 */
	EList<String> getRuleId();

} // Validation
