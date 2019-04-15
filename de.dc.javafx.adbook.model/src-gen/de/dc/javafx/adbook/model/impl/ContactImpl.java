/**
 */
package de.dc.javafx.adbook.model.impl;

import de.dc.javafx.adbook.model.Contact;
import de.dc.javafx.adbook.model.ModelPackage;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.adbook.model.impl.ContactImpl#getFirstname <em>Firstname</em>}</li>
 *   <li>{@link de.dc.javafx.adbook.model.impl.ContactImpl#getLastname <em>Lastname</em>}</li>
 *   <li>{@link de.dc.javafx.adbook.model.impl.ContactImpl#getAge <em>Age</em>}</li>
 *   <li>{@link de.dc.javafx.adbook.model.impl.ContactImpl#isGender <em>Gender</em>}</li>
 *   <li>{@link de.dc.javafx.adbook.model.impl.ContactImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link de.dc.javafx.adbook.model.impl.ContactImpl#getPhone <em>Phone</em>}</li>
 *   <li>{@link de.dc.javafx.adbook.model.impl.ContactImpl#getMail <em>Mail</em>}</li>
 *   <li>{@link de.dc.javafx.adbook.model.impl.ContactImpl#getCreatedOn <em>Created On</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContactImpl extends MinimalEObjectImpl.Container implements Contact {
	/**
	 * The default value of the '{@link #getFirstname() <em>Firstname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstname()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRSTNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirstname() <em>Firstname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstname()
	 * @generated
	 * @ordered
	 */
	protected String firstname = FIRSTNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastname() <em>Lastname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastname()
	 * @generated
	 * @ordered
	 */
	protected static final String LASTNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastname() <em>Lastname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastname()
	 * @generated
	 * @ordered
	 */
	protected String lastname = LASTNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAge() <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAge()
	 * @generated
	 * @ordered
	 */
	protected static final int AGE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAge() <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAge()
	 * @generated
	 * @ordered
	 */
	protected int age = AGE_EDEFAULT;

	/**
	 * The default value of the '{@link #isGender() <em>Gender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGender()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GENDER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGender() <em>Gender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGender()
	 * @generated
	 * @ordered
	 */
	protected boolean gender = GENDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected String address = ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhone() <em>Phone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhone()
	 * @generated
	 * @ordered
	 */
	protected static final String PHONE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhone() <em>Phone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhone()
	 * @generated
	 * @ordered
	 */
	protected String phone = PHONE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMail() <em>Mail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMail()
	 * @generated
	 * @ordered
	 */
	protected static final String MAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMail() <em>Mail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMail()
	 * @generated
	 * @ordered
	 */
	protected String mail = MAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreatedOn() <em>Created On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedOn()
	 * @generated
	 * @ordered
	 */
	protected static final Date CREATED_ON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreatedOn() <em>Created On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedOn()
	 * @generated
	 * @ordered
	 */
	protected Date createdOn = CREATED_ON_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContactImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.CONTACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFirstname() {
		return firstname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFirstname(String newFirstname) {
		String oldFirstname = firstname;
		firstname = newFirstname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CONTACT__FIRSTNAME, oldFirstname,
					firstname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLastname() {
		return lastname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastname(String newLastname) {
		String oldLastname = lastname;
		lastname = newLastname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CONTACT__LASTNAME, oldLastname,
					lastname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getAge() {
		return age;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAge(int newAge) {
		int oldAge = age;
		age = newAge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CONTACT__AGE, oldAge, age));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isGender() {
		return gender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGender(boolean newGender) {
		boolean oldGender = gender;
		gender = newGender;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CONTACT__GENDER, oldGender, gender));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAddress(String newAddress) {
		String oldAddress = address;
		address = newAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CONTACT__ADDRESS, oldAddress, address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPhone() {
		return phone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPhone(String newPhone) {
		String oldPhone = phone;
		phone = newPhone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CONTACT__PHONE, oldPhone, phone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMail() {
		return mail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMail(String newMail) {
		String oldMail = mail;
		mail = newMail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CONTACT__MAIL, oldMail, mail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getCreatedOn() {
		return createdOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedOn(Date newCreatedOn) {
		Date oldCreatedOn = createdOn;
		createdOn = newCreatedOn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CONTACT__CREATED_ON, oldCreatedOn,
					createdOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModelPackage.CONTACT__FIRSTNAME:
			return getFirstname();
		case ModelPackage.CONTACT__LASTNAME:
			return getLastname();
		case ModelPackage.CONTACT__AGE:
			return getAge();
		case ModelPackage.CONTACT__GENDER:
			return isGender();
		case ModelPackage.CONTACT__ADDRESS:
			return getAddress();
		case ModelPackage.CONTACT__PHONE:
			return getPhone();
		case ModelPackage.CONTACT__MAIL:
			return getMail();
		case ModelPackage.CONTACT__CREATED_ON:
			return getCreatedOn();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ModelPackage.CONTACT__FIRSTNAME:
			setFirstname((String) newValue);
			return;
		case ModelPackage.CONTACT__LASTNAME:
			setLastname((String) newValue);
			return;
		case ModelPackage.CONTACT__AGE:
			setAge((Integer) newValue);
			return;
		case ModelPackage.CONTACT__GENDER:
			setGender((Boolean) newValue);
			return;
		case ModelPackage.CONTACT__ADDRESS:
			setAddress((String) newValue);
			return;
		case ModelPackage.CONTACT__PHONE:
			setPhone((String) newValue);
			return;
		case ModelPackage.CONTACT__MAIL:
			setMail((String) newValue);
			return;
		case ModelPackage.CONTACT__CREATED_ON:
			setCreatedOn((Date) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ModelPackage.CONTACT__FIRSTNAME:
			setFirstname(FIRSTNAME_EDEFAULT);
			return;
		case ModelPackage.CONTACT__LASTNAME:
			setLastname(LASTNAME_EDEFAULT);
			return;
		case ModelPackage.CONTACT__AGE:
			setAge(AGE_EDEFAULT);
			return;
		case ModelPackage.CONTACT__GENDER:
			setGender(GENDER_EDEFAULT);
			return;
		case ModelPackage.CONTACT__ADDRESS:
			setAddress(ADDRESS_EDEFAULT);
			return;
		case ModelPackage.CONTACT__PHONE:
			setPhone(PHONE_EDEFAULT);
			return;
		case ModelPackage.CONTACT__MAIL:
			setMail(MAIL_EDEFAULT);
			return;
		case ModelPackage.CONTACT__CREATED_ON:
			setCreatedOn(CREATED_ON_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ModelPackage.CONTACT__FIRSTNAME:
			return FIRSTNAME_EDEFAULT == null ? firstname != null : !FIRSTNAME_EDEFAULT.equals(firstname);
		case ModelPackage.CONTACT__LASTNAME:
			return LASTNAME_EDEFAULT == null ? lastname != null : !LASTNAME_EDEFAULT.equals(lastname);
		case ModelPackage.CONTACT__AGE:
			return age != AGE_EDEFAULT;
		case ModelPackage.CONTACT__GENDER:
			return gender != GENDER_EDEFAULT;
		case ModelPackage.CONTACT__ADDRESS:
			return ADDRESS_EDEFAULT == null ? address != null : !ADDRESS_EDEFAULT.equals(address);
		case ModelPackage.CONTACT__PHONE:
			return PHONE_EDEFAULT == null ? phone != null : !PHONE_EDEFAULT.equals(phone);
		case ModelPackage.CONTACT__MAIL:
			return MAIL_EDEFAULT == null ? mail != null : !MAIL_EDEFAULT.equals(mail);
		case ModelPackage.CONTACT__CREATED_ON:
			return CREATED_ON_EDEFAULT == null ? createdOn != null : !CREATED_ON_EDEFAULT.equals(createdOn);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (firstname: ");
		result.append(firstname);
		result.append(", lastname: ");
		result.append(lastname);
		result.append(", age: ");
		result.append(age);
		result.append(", gender: ");
		result.append(gender);
		result.append(", address: ");
		result.append(address);
		result.append(", phone: ");
		result.append(phone);
		result.append(", mail: ");
		result.append(mail);
		result.append(", createdOn: ");
		result.append(createdOn);
		result.append(')');
		return result.toString();
	}

} //ContactImpl
