/**
 */
package de.dc.javafx.adbook.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.adbook.model.Group#getName <em>Name</em>}</li>
 *   <li>{@link de.dc.javafx.adbook.model.Group#getContacts <em>Contacts</em>}</li>
 * </ul>
 *
 * @see de.dc.javafx.adbook.model.ModelPackage#getGroup()
 * @model
 * @generated
 */
public interface Group extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.dc.javafx.adbook.model.ModelPackage#getGroup_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.dc.javafx.adbook.model.Group#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Contacts</b></em>' reference list.
	 * The list contents are of type {@link de.dc.javafx.adbook.model.Contact}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contacts</em>' reference list.
	 * @see de.dc.javafx.adbook.model.ModelPackage#getGroup_Contacts()
	 * @model
	 * @generated
	 */
	EList<Contact> getContacts();

} // Group
