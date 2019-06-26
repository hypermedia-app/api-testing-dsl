package com.zazuko.apitesting.dsl.converter

import com.google.inject.Inject
import org.eclipse.xtext.common.services.DefaultTerminalConverters
import org.eclipse.xtext.conversion.IValueConverter
import org.eclipse.xtext.conversion.ValueConverter

class ApiTestingDslValueConverterService extends DefaultTerminalConverters {
	@Inject HatchValueConverter hatchValueConverter;

	@ValueConverter(rule = "com.zazuko.apitesting.dsl.ApiTestingDsl.HATCH")
	def IValueConverter<String> HATCH() {
		return hatchValueConverter;
	}

}
