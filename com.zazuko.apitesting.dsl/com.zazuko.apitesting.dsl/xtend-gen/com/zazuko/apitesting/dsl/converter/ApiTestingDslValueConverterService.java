package com.zazuko.apitesting.dsl.converter;

import com.google.inject.Inject;
import com.zazuko.apitesting.dsl.converter.HatchValueConverter;
import org.eclipse.xtext.common.services.DefaultTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;

@SuppressWarnings("all")
public class ApiTestingDslValueConverterService extends DefaultTerminalConverters {
  @Inject
  private HatchValueConverter hatchValueConverter;
  
  @ValueConverter(rule = "com.zazuko.apitesting.dsl.ApiTestingDsl.HATCH")
  public IValueConverter<String> HATCH() {
    return this.hatchValueConverter;
  }
}
