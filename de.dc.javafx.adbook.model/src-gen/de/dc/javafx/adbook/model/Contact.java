/**
 */
package de.dc.javafx.adbook.model;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.adbook.model.Contact#getFirstname <em>Firstname</em>}</li>
 *   <li>{@link de.dc.javafx.adbook.model.Contact#getLastname <em>Lastname</em>}</li>
 *   <li>{@link de.dc.javafx.adbook.model.Contact#getAge <em>Age</em>}</li>
 *   <li>{@link de.dc.javafx.adbook.model.Contact#isGender <em>Gender</em>}</li>
 *   <li>{@link de.dc.javafx.adbook.model.Contact#getAddress <em>Address</em>}</li>
 *   <li>{@link de.dc.javafx.adbook.model.Contact#getPhone <em>Phone</em>}</li>
 *   <li>{@link de.dc.javafx.adbook.model.Contact#getMail <em>Mail</em>}</li>
 *   <li>{@link de.dc.javafx.adbook.model.Contact#getCreatedOn <em>Created On</em>}</li>
 * </ul>
 *
 * @see de.dc.javafx.adbook.model.ModelPackage#getContact()
 * @model
 * @generated
 */
public interface Contact extends EObject {
	/**
	 * Returns the value of the '<em><b>Firstname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Firstname</em>' attribute.
	 * @see #setFirstname(String)
	 * @see de.dc.javafx.adbook.model.ModelPackage#getContact_Firstname()
	 * @model unique="false"
	 * @generated
	 */
	String getFirstname();

	/**
	 * Sets the value of the '{@link de.dc.javafx.adbook.model.Contact#getFirstname <em>Firstname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Firstname</em>' attribute.
	 * @see #getFirstname()
	 * @generated
	 */
	void setFirstname(String value);

	/**
	 * Returns the value of the '<em><b>Lastname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lastname</em>' attribute.
	 * @see #setLastname(String)
	 * @see de.dc.javafx.adbook.model.ModelPackage#getContact_Lastname()
	 * @model unique="false"
	 * @generated
	 */
	String getLastname();

	/**
	 * Sets the value of the '{@link de.dc.javafx.adbook.model.Contact#getLastname <em>Lastname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lastname</em>' attribute.
	 * @see #getLastname()
	 * @generated
	 */
	void setLastname(String value);

	/**
	 * Returns the value of the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Age</em>' attribute.
	 * @see #setAge(int)
	 * @see de.dc.javafx.adbook.model.ModelPackage#getContact_Age()
	 * @model unique="false"
	 * @generated
	 */
	int getAge();

	/**
	 * Sets the value of the '{@link de.dc.javafx.adbook.model.Contact#getAge <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Age</em>' attribute.
	 * @see #getAge()
	 * @generated
	 */
	void setAge(int value);

	/**
	 * Returns the value of the '<em><b>Gender</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gender</em>' attribute.
	 * @see #setGender(boolean)
	 * @see de.dc.javafx.adbook.model.ModelPackage#getContact_Gender()
	 * @model unique="false"
	 * @generated
	 */
	boolean isGender();

	/**
	 * Sets the value of the '{@link de.dc.javafx.adbook.model.Contact#isGender <em>Gender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gender</em>' attribute.
	 * @see #isGender()
	 * @generated
	 */
	void setGender(boolean value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' attribute.
	 * @see #setAddress(String)
	 * @see de.dc.javafx.adbook.model.ModelPackage#getContact_Address()
	 * @model unique="false"
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link de.dc.javafx.adbook.model.Contact#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(String value);

	/**
	 * Returns the value of the '<em><b>Phone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phone</em>' attribute.
	 * @see #setPhone(String)
	 * @see de.dc.javafx.adbook.model.ModelPackage#getContact_Phone()
	 * @model unique="false"
	 * @generated
	 */
	String getPhone();

	/**
	 * Sets the value of the '{@link de.dc.javafx.adbook.model.Contact#getPhone <em>Phone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phone</em>' attribute.
	 * @see #getPhone()
	 * @generated
	 */
	void setPhone(String value);

	/**
	 * Returns the value of the '<em><b>Mail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mail</em>' attribute.
	 * @see #setMail(String)
	 * @see de.dc.javafx.adbook.model.ModelPackage#getContact_Mail()
	 * @model unique="false"
	 * @generated
	 */
	String getMail();

	/**
	 * Sets the value of the '{@link de.dc.javafx.adbook.model.Contact#getMail <em>Mail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mail</em>' attribute.
	 * @see #getMail()
	 * @generated
	 */
	void setMail(String value);

	/**
	 * Returns the value of the '<em><b>Created On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created On</em>' attribute.
	 * @see #setCreatedOn(Date)
	 * @see de.dc.javafx.adbook.model.ModelPackage#getContact_CreatedOn()
	 * @model unique="false"
	 * @generated
	 */
	Date getCreatedOn();

	/**
	 * Sets the value of the '{@link de.dc.javafx.adbook.model.Contact#getCreatedOn <em>Created On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created On</em>' attribute.
	 * @see #getCreatedOn()
	 * @generated
	 */
	void setCreatedOn(Date value);

} // Contact
