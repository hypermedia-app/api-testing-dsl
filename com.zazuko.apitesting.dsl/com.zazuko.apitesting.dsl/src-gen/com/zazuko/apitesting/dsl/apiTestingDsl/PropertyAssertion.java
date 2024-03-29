/**
 * generated by Xtext 2.17.0
 */
package com.zazuko.apitesting.dsl.apiTestingDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Assertion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.zazuko.apitesting.dsl.apiTestingDsl.PropertyAssertion#getName <em>Name</em>}</li>
 *   <li>{@link com.zazuko.apitesting.dsl.apiTestingDsl.PropertyAssertion#getAssertions <em>Assertions</em>}</li>
 *   <li>{@link com.zazuko.apitesting.dsl.apiTestingDsl.PropertyAssertion#getHatch <em>Hatch</em>}</li>
 * </ul>
 *
 * @see com.zazuko.apitesting.dsl.apiTestingDsl.ApiTestingDslPackage#getPropertyAssertion()
 * @model
 * @generated
 */
public interface PropertyAssertion extends ClassLevelAssertion
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.zazuko.apitesting.dsl.apiTestingDsl.ApiTestingDslPackage#getPropertyAssertion_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.zazuko.apitesting.dsl.apiTestingDsl.PropertyAssertion#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Assertions</b></em>' containment reference list.
   * The list contents are of type {@link com.zazuko.apitesting.dsl.apiTestingDsl.ClassLevelAssertion}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assertions</em>' containment reference list.
   * @see com.zazuko.apitesting.dsl.apiTestingDsl.ApiTestingDslPackage#getPropertyAssertion_Assertions()
   * @model containment="true"
   * @generated
   */
  EList<ClassLevelAssertion> getAssertions();

  /**
   * Returns the value of the '<em><b>Hatch</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hatch</em>' attribute.
   * @see #setHatch(String)
   * @see com.zazuko.apitesting.dsl.apiTestingDsl.ApiTestingDslPackage#getPropertyAssertion_Hatch()
   * @model
   * @generated
   */
  String getHatch();

  /**
   * Sets the value of the '{@link com.zazuko.apitesting.dsl.apiTestingDsl.PropertyAssertion#getHatch <em>Hatch</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Hatch</em>' attribute.
   * @see #getHatch()
   * @generated
   */
  void setHatch(String value);

} // PropertyAssertion
