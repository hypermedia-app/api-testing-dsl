/*
 * generated by Xtext 2.17.0
 */
package com.zazuko.apitesting.dsl.ui.tests;

import com.google.inject.Injector;
import com.zazuko.apitesting.dsl.ui.internal.DslActivator;
import org.eclipse.xtext.testing.IInjectorProvider;

public class ApiTestingDslUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return DslActivator.getInstance().getInjector("com.zazuko.apitesting.dsl.ApiTestingDsl");
	}

}