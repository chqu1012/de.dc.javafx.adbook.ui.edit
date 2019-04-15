/**
 */
package de.dc.javafx.adbook.model.impl;

import de.dc.javafx.adbook.model.Adbook;
import de.dc.javafx.adbook.model.Contact;
import de.dc.javafx.adbook.model.Group;
import de.dc.javafx.adbook.model.ModelPackage;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Adbook</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.adbook.model.impl.AdbookImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.dc.javafx.adbook.model.impl.AdbookImpl#getCreatedOn <em>Created On</em>}</li>
 *   <li>{@link de.dc.javafx.adbook.model.impl.AdbookImpl#getContacts <em>Contacts</em>}</li>
 *   <li>{@link de.dc.javafx.adbook.model.impl.AdbookImpl#getGroups <em>Groups</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AdbookImpl extends MinimalEObjectImpl.Container implements Adbook {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

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
	 * The cached value of the '{@link #getContacts() <em>Contacts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContacts()
	 * @generated
	 * @ordered
	 */
	protected EList<Contact> contacts;

	/**
	 * The cached value of the '{@link #getGroups() <em>Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<Group> groups;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdbookImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.ADBOOK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ADBOOK__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ADBOOK__CREATED_ON, oldCreatedOn,
					createdOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Contact> getContacts() {
		if (contacts == null) {
			contacts = new EObjectContainmentEList<Contact>(Contact.class, this, ModelPackage.ADBOOK__CONTACTS);
		}
		return contacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Group> getGroups() {
		if (groups == null) {
			groups = new EObjectContainmentEList<Group>(Group.class, this, ModelPackage.ADBOOK__GROUPS);
		}
		return groups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ModelPackage.ADBOOK__CONTACTS:
			return ((InternalEList<?>) getContacts()).basicRemove(otherEnd, msgs);
		case ModelPackage.ADBOOK__GROUPS:
			return ((InternalEList<?>) getGroups()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModelPackage.ADBOOK__NAME:
			return getName();
		case ModelPackage.ADBOOK__CREATED_ON:
			return getCreatedOn();
		case ModelPackage.ADBOOK__CONTACTS:
			return getContacts();
		case ModelPackage.ADBOOK__GROUPS:
			return getGroups();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ModelPackage.ADBOOK__NAME:
			setName((String) newValue);
			return;
		case ModelPackage.ADBOOK__CREATED_ON:
			setCreatedOn((Date) newValue);
			return;
		case ModelPackage.ADBOOK__CONTACTS:
			getContacts().clear();
			getContacts().addAll((Collection<? extends Contact>) newValue);
			return;
		case ModelPackage.ADBOOK__GROUPS:
			getGroups().clear();
			getGroups().addAll((Collection<? extends Group>) newValue);
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
		case ModelPackage.ADBOOK__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ModelPackage.ADBOOK__CREATED_ON:
			setCreatedOn(CREATED_ON_EDEFAULT);
			return;
		case ModelPackage.ADBOOK__CONTACTS:
			getContacts().clear();
			return;
		case ModelPackage.ADBOOK__GROUPS:
			getGroups().clear();
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
		case ModelPackage.ADBOOK__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ModelPackage.ADBOOK__CREATED_ON:
			return CREATED_ON_EDEFAULT == null ? createdOn != null : !CREATED_ON_EDEFAULT.equals(createdOn);
		case ModelPackage.ADBOOK__CONTACTS:
			return contacts != null && !contacts.isEmpty();
		case ModelPackage.ADBOOK__GROUPS:
			return groups != null && !groups.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", createdOn: ");
		result.append(createdOn);
		result.append(')');
		return result.toString();
	}

} //AdbookImpl
