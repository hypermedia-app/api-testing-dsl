/*
 * generated by Xtext 2.17.0
 */
package com.zazuko.apitesting.dsl.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractApiTestingDslValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(com.zazuko.apitesting.dsl.apiTestingDsl.ApiTestingDslPackage.eINSTANCE);
		return result;
	}
}
