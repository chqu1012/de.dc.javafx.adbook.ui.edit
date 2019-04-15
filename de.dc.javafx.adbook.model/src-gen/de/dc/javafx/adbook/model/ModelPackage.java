/**
 */
package de.dc.javafx.adbook.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see de.dc.javafx.adbook.model.ModelFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel multipleEditorPages='false' creationIcons='false' editDirectory='/de.dc.javafx.adbook.model.edit/src-gen' editorDirectory='/de.dc.javafx.adbook.model.editor/src-gen' richClientPlatform='true' codeFormatting='true' importerID='org.eclipse.emf.importer.ecore' runtimePlatform='RCP' basePackage='de.dc.javafx.adbook'"
 * @generated
 */
public interface ModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.frateranatis.org/adbook";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelPackage eINSTANCE = de.dc.javafx.adbook.model.impl.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.dc.javafx.adbook.model.impl.AdbookImpl <em>Adbook</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.adbook.model.impl.AdbookImpl
	 * @see de.dc.javafx.adbook.model.impl.ModelPackageImpl#getAdbook()
	 * @generated
	 */
	int ADBOOK = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADBOOK__NAME = 0;

	/**
	 * The feature id for the '<em><b>Created On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADBOOK__CREATED_ON = 1;

	/**
	 * The feature id for the '<em><b>Contacts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADBOOK__CONTACTS = 2;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADBOOK__GROUPS = 3;

	/**
	 * The number of structural features of the '<em>Adbook</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADBOOK_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Adbook</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADBOOK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.adbook.model.impl.ContactImpl <em>Contact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.adbook.model.impl.ContactImpl
	 * @see de.dc.javafx.adbook.model.impl.ModelPackageImpl#getContact()
	 * @generated
	 */
	int CONTACT = 1;

	/**
	 * The feature id for the '<em><b>Firstname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT__FIRSTNAME = 0;

	/**
	 * The feature id for the '<em><b>Lastname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT__LASTNAME = 1;

	/**
	 * The feature id for the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT__AGE = 2;

	/**
	 * The feature id for the '<em><b>Gender</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT__GENDER = 3;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT__ADDRESS = 4;

	/**
	 * The feature id for the '<em><b>Phone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT__PHONE = 5;

	/**
	 * The feature id for the '<em><b>Mail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT__MAIL = 6;

	/**
	 * The feature id for the '<em><b>Created On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT__CREATED_ON = 7;

	/**
	 * The number of structural features of the '<em>Contact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Contact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.adbook.model.impl.GroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.adbook.model.impl.GroupImpl
	 * @see de.dc.javafx.adbook.model.impl.ModelPackageImpl#getGroup()
	 * @generated
	 */
	int GROUP = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__NAME = 0;

	/**
	 * The feature id for the '<em><b>Contacts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__CONTACTS = 1;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.adbook.model.Adbook <em>Adbook</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adbook</em>'.
	 * @see de.dc.javafx.adbook.model.Adbook
	 * @generated
	 */
	EClass getAdbook();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.adbook.model.Adbook#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.dc.javafx.adbook.model.Adbook#getName()
	 * @see #getAdbook()
	 * @generated
	 */
	EAttribute getAdbook_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.adbook.model.Adbook#getCreatedOn <em>Created On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created On</em>'.
	 * @see de.dc.javafx.adbook.model.Adbook#getCreatedOn()
	 * @see #getAdbook()
	 * @generated
	 */
	EAttribute getAdbook_CreatedOn();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dc.javafx.adbook.model.Adbook#getContacts <em>Contacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contacts</em>'.
	 * @see de.dc.javafx.adbook.model.Adbook#getContacts()
	 * @see #getAdbook()
	 * @generated
	 */
	EReference getAdbook_Contacts();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dc.javafx.adbook.model.Adbook#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Groups</em>'.
	 * @see de.dc.javafx.adbook.model.Adbook#getGroups()
	 * @see #getAdbook()
	 * @generated
	 */
	EReference getAdbook_Groups();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.adbook.model.Contact <em>Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contact</em>'.
	 * @see de.dc.javafx.adbook.model.Contact
	 * @generated
	 */
	EClass getContact();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.adbook.model.Contact#getFirstname <em>Firstname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Firstname</em>'.
	 * @see de.dc.javafx.adbook.model.Contact#getFirstname()
	 * @see #getContact()
	 * @generated
	 */
	EAttribute getContact_Firstname();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.adbook.model.Contact#getLastname <em>Lastname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lastname</em>'.
	 * @see de.dc.javafx.adbook.model.Contact#getLastname()
	 * @see #getContact()
	 * @generated
	 */
	EAttribute getContact_Lastname();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.adbook.model.Contact#getAge <em>Age</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Age</em>'.
	 * @see de.dc.javafx.adbook.model.Contact#getAge()
	 * @see #getContact()
	 * @generated
	 */
	EAttribute getContact_Age();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.adbook.model.Contact#isGender <em>Gender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gender</em>'.
	 * @see de.dc.javafx.adbook.model.Contact#isGender()
	 * @see #getContact()
	 * @generated
	 */
	EAttribute getContact_Gender();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.adbook.model.Contact#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see de.dc.javafx.adbook.model.Contact#getAddress()
	 * @see #getContact()
	 * @generated
	 */
	EAttribute getContact_Address();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.adbook.model.Contact#getPhone <em>Phone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phone</em>'.
	 * @see de.dc.javafx.adbook.model.Contact#getPhone()
	 * @see #getContact()
	 * @generated
	 */
	EAttribute getContact_Phone();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.adbook.model.Contact#getMail <em>Mail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mail</em>'.
	 * @see de.dc.javafx.adbook.model.Contact#getMail()
	 * @see #getContact()
	 * @generated
	 */
	EAttribute getContact_Mail();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.adbook.model.Contact#getCreatedOn <em>Created On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created On</em>'.
	 * @see de.dc.javafx.adbook.model.Contact#getCreatedOn()
	 * @see #getContact()
	 * @generated
	 */
	EAttribute getContact_CreatedOn();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.adbook.model.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see de.dc.javafx.adbook.model.Group
	 * @generated
	 */
	EClass getGroup();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.adbook.model.Group#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.dc.javafx.adbook.model.Group#getName()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_Name();

	/**
	 * Returns the meta object for the reference list '{@link de.dc.javafx.adbook.model.Group#getContacts <em>Contacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contacts</em>'.
	 * @see de.dc.javafx.adbook.model.Group#getContacts()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_Contacts();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelFactory getModelFactory();

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
		 * The meta object literal for the '{@link de.dc.javafx.adbook.model.impl.AdbookImpl <em>Adbook</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.adbook.model.impl.AdbookImpl
		 * @see de.dc.javafx.adbook.model.impl.ModelPackageImpl#getAdbook()
		 * @generated
		 */
		EClass ADBOOK = eINSTANCE.getAdbook();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADBOOK__NAME = eINSTANCE.getAdbook_Name();

		/**
		 * The meta object literal for the '<em><b>Created On</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADBOOK__CREATED_ON = eINSTANCE.getAdbook_CreatedOn();

		/**
		 * The meta object literal for the '<em><b>Contacts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADBOOK__CONTACTS = eINSTANCE.getAdbook_Contacts();

		/**
		 * The meta object literal for the '<em><b>Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADBOOK__GROUPS = eINSTANCE.getAdbook_Groups();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.adbook.model.impl.ContactImpl <em>Contact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.adbook.model.impl.ContactImpl
		 * @see de.dc.javafx.adbook.model.impl.ModelPackageImpl#getContact()
		 * @generated
		 */
		EClass CONTACT = eINSTANCE.getContact();

		/**
		 * The meta object literal for the '<em><b>Firstname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT__FIRSTNAME = eINSTANCE.getContact_Firstname();

		/**
		 * The meta object literal for the '<em><b>Lastname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT__LASTNAME = eINSTANCE.getContact_Lastname();

		/**
		 * The meta object literal for the '<em><b>Age</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT__AGE = eINSTANCE.getContact_Age();

		/**
		 * The meta object literal for the '<em><b>Gender</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT__GENDER = eINSTANCE.getContact_Gender();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT__ADDRESS = eINSTANCE.getContact_Address();

		/**
		 * The meta object literal for the '<em><b>Phone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT__PHONE = eINSTANCE.getContact_Phone();

		/**
		 * The meta object literal for the '<em><b>Mail</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT__MAIL = eINSTANCE.getContact_Mail();

		/**
		 * The meta object literal for the '<em><b>Created On</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT__CREATED_ON = eINSTANCE.getContact_CreatedOn();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.adbook.model.impl.GroupImpl <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.adbook.model.impl.GroupImpl
		 * @see de.dc.javafx.adbook.model.impl.ModelPackageImpl#getGroup()
		 * @generated
		 */
		EClass GROUP = eINSTANCE.getGroup();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__NAME = eINSTANCE.getGroup_Name();

		/**
		 * The meta object literal for the '<em><b>Contacts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__CONTACTS = eINSTANCE.getGroup_Contacts();

	}

} //ModelPackage
