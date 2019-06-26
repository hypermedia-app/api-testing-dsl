package com.zazuko.apitesting.dsl.converter

import org.eclipse.xtext.conversion.ValueConverterException
import org.eclipse.xtext.conversion.impl.AbstractLexerBasedConverter
import org.eclipse.xtext.nodemodel.INode

class MarkupStringConverter extends AbstractLexerBasedConverter<String> {

	val String startTag;
	val String endTag;

	new(String startTag, String endTag) {
		this.startTag = startTag;
		this.endTag = endTag;
	}

	def String getStartTag() {
		return startTag;
	}

	def String getEndTag() {
		return endTag;
	}

	override String toEscapedString(String value) {
		return String.format("%s %s %s", startTag, value, endTag);
	}

	override String toValue(String string, INode node) {
		if (string === null)
			return null;
		try {
			val value = string.substring(startTag.length(), string.length() - endTag.length());
			return value.trim();
		} catch (Exception e) {
			throw new ValueConverterException(e.getMessage(), node, e);
		}
	}

}
