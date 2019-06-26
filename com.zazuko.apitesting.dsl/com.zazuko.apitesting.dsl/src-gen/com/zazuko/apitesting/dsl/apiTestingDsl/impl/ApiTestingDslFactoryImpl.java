/**
 * generated by Xtext 2.17.0
 */
package com.zazuko.apitesting.dsl.apiTestingDsl.impl;

import com.zazuko.apitesting.dsl.apiTestingDsl.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApiTestingDslFactoryImpl extends EFactoryImpl implements ApiTestingDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ApiTestingDslFactory init()
  {
    try
    {
      ApiTestingDslFactory theApiTestingDslFactory = (ApiTestingDslFactory)EPackage.Registry.INSTANCE.getEFactory(ApiTestingDslPackage.eNS_URI);
      if (theApiTestingDslFactory != null)
      {
        return theApiTestingDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ApiTestingDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ApiTestingDslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case ApiTestingDslPackage.MODEL: return createModel();
      case ApiTestingDslPackage.ELEMENT: return createElement();
      case ApiTestingDslPackage.CLASS_BLOCK: return createClassBlock();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Element createElement()
  {
    ElementImpl element = new ElementImpl();
    return element;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ClassBlock createClassBlock()
  {
    ClassBlockImpl classBlock = new ClassBlockImpl();
    return classBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ApiTestingDslPackage getApiTestingDslPackage()
  {
    return (ApiTestingDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ApiTestingDslPackage getPackage()
  {
    return ApiTestingDslPackage.eINSTANCE;
  }

} //ApiTestingDslFactoryImpl