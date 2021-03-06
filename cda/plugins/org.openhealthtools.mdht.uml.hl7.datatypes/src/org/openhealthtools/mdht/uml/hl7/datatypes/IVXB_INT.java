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
package org.openhealthtools.mdht.uml.hl7.datatypes;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IVXB INT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.IVXB_INT#getInclusive <em>Inclusive</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage#getIVXB_INT()
 * @model
 * @generated
 */
public interface IVXB_INT extends INT {
	/**
	 * Returns the value of the '<em><b>Inclusive</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inclusive</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inclusive</em>' attribute.
	 * @see #setInclusive(Boolean)
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage#getIVXB_INT_Inclusive()
	 * @model default="true" ordered="false"
	 * @generated
	 */
	Boolean getInclusive();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.IVXB_INT#getInclusive <em>Inclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inclusive</em>' attribute.
	 * @see #getInclusive()
	 * @generated
	 */
	void setInclusive(Boolean value);

} // IVXB_INT
