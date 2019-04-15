/**
 */
package de.dc.javafx.adbook.model;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Adbook</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.adbook.model.Adbook#getName <em>Name</em>}</li>
 *   <li>{@link de.dc.javafx.adbook.model.Adbook#getCreatedOn <em>Created On</em>}</li>
 *   <li>{@link de.dc.javafx.adbook.model.Adbook#getContacts <em>Contacts</em>}</li>
 *   <li>{@link de.dc.javafx.adbook.model.Adbook#getGroups <em>Groups</em>}</li>
 * </ul>
 *
 * @see de.dc.javafx.adbook.model.ModelPackage#getAdbook()
 * @model
 * @generated
 */
public interface Adbook extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.dc.javafx.adbook.model.ModelPackage#getAdbook_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.dc.javafx.adbook.model.Adbook#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Created On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created On</em>' attribute.
	 * @see #setCreatedOn(Date)
	 * @see de.dc.javafx.adbook.model.ModelPackage#getAdbook_CreatedOn()
	 * @model unique="false"
	 * @generated
	 */
	Date getCreatedOn();

	/**
	 * Sets the value of the '{@link de.dc.javafx.adbook.model.Adbook#getCreatedOn <em>Created On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created On</em>' attribute.
	 * @see #getCreatedOn()
	 * @generated
	 */
	void setCreatedOn(Date value);

	/**
	 * Returns the value of the '<em><b>Contacts</b></em>' containment reference list.
	 * The list contents are of type {@link de.dc.javafx.adbook.model.Contact}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contacts</em>' containment reference list.
	 * @see de.dc.javafx.adbook.model.ModelPackage#getAdbook_Contacts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Contact> getContacts();

	/**
	 * Returns the value of the '<em><b>Groups</b></em>' containment reference list.
	 * The list contents are of type {@link de.dc.javafx.adbook.model.Group}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Groups</em>' containment reference list.
	 * @see de.dc.javafx.adbook.model.ModelPackage#getAdbook_Groups()
	 * @model containment="true"
	 * @generated
	 */
	EList<Group> getGroups();

} // Adbook
