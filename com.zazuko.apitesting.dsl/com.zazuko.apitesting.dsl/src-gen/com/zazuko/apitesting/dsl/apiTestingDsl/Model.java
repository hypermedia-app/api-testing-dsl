/**
 * generated by Xtext 2.17.0
 */
package com.zazuko.apitesting.dsl.apiTestingDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.zazuko.apitesting.dsl.apiTestingDsl.Model#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see com.zazuko.apitesting.dsl.apiTestingDsl.ApiTestingDslPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link com.zazuko.apitesting.dsl.apiTestingDsl.Element}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see com.zazuko.apitesting.dsl.apiTestingDsl.ApiTestingDslPackage#getModel_Elements()
   * @model containment="true"
   * @generated
   */
  EList<Element> getElements();

} // Model