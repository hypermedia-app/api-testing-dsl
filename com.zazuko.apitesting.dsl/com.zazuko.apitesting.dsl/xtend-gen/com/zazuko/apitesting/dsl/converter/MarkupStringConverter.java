package com.zazuko.apitesting.dsl.converter;

import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.conversion.impl.AbstractLexerBasedConverter;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class MarkupStringConverter extends AbstractLexerBasedConverter<String> {
  private final String startTag;
  
  private final String endTag;
  
  public MarkupStringConverter(final String startTag, final String endTag) {
    this.startTag = startTag;
    this.endTag = endTag;
  }
  
  public String getStartTag() {
    return this.startTag;
  }
  
  public String getEndTag() {
    return this.endTag;
  }
  
  @Override
  public String toEscapedString(final String value) {
    return String.format("%s %s %s", this.startTag, value, this.endTag);
  }
  
  @Override
  public String toValue(final String string, final INode node) {
    if ((string == null)) {
      return null;
    }
    try {
      int _length = this.startTag.length();
      int _length_1 = string.length();
      int _length_2 = this.endTag.length();
      int _minus = (_length_1 - _length_2);
      final String value = string.substring(_length, _minus);
      return value.trim();
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        final Exception e = (Exception)_t;
        String _message = e.getMessage();
        throw new ValueConverterException(_message, node, e);
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
}
