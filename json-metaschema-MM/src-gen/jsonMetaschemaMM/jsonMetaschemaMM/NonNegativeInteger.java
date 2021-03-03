/**
 */
package jsonMetaschemaMM.jsonMetaschemaMM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Non Negative Integer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jsonMetaschemaMM.jsonMetaschemaMM.NonNegativeInteger#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see jsonMetaschemaMM.jsonMetaschemaMM.JsonMetaschemaMMPackage#getNonNegativeInteger()
 * @model
 * @generated
 */
public interface NonNegativeInteger extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.JsonMetaschemaMMPackage#getNonNegativeInteger_Value()
	 * @model required="true"
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link jsonMetaschemaMM.jsonMetaschemaMM.NonNegativeInteger#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

} // NonNegativeInteger