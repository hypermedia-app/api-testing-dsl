/*
 * generated by Xtext 2.17.0
 */
package com.zazuko.apitesting.dsl.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class ApiTestingDslGrammarAccess extends AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.zazuko.apitesting.dsl.ApiTestingDsl.Model");
		private final Assignment cElementsAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cElementsElementParserRuleCall_0 = (RuleCall)cElementsAssignment.eContents().get(0);
		
		//Model:
		//	elements+=Element*;
		@Override public ParserRule getRule() { return rule; }
		
		//elements+=Element*
		public Assignment getElementsAssignment() { return cElementsAssignment; }
		
		//Element
		public RuleCall getElementsElementParserRuleCall_0() { return cElementsElementParserRuleCall_0; }
	}
	public class ElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.zazuko.apitesting.dsl.ApiTestingDsl.Element");
		private final RuleCall cClassBlockParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//Element:
		//	ClassBlock;
		@Override public ParserRule getRule() { return rule; }
		
		//ClassBlock
		public RuleCall getClassBlockParserRuleCall() { return cClassBlockParserRuleCall; }
	}
	public class ClassLevelAssertionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.zazuko.apitesting.dsl.ApiTestingDsl.ClassLevelAssertion");
		private final RuleCall cPropertyAssertionParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//ClassLevelAssertion:
		//	PropertyAssertion;
		@Override public ParserRule getRule() { return rule; }
		
		//PropertyAssertion
		public RuleCall getPropertyAssertionParserRuleCall() { return cPropertyAssertionParserRuleCall; }
	}
	public class ClassBlockElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.zazuko.apitesting.dsl.ApiTestingDsl.ClassBlock");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cWithKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cClassKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameSTRINGTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cAssertionsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cAssertionsClassLevelAssertionParserRuleCall_4_0 = (RuleCall)cAssertionsAssignment_4.eContents().get(0);
		private final Assignment cHatchAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cHatchHATCHTerminalRuleCall_5_0 = (RuleCall)cHatchAssignment_5.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//ClassBlock:
		//	'With' 'Class' name=STRING '{'
		//	assertions+=ClassLevelAssertion*
		//	hatch=HATCH?
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'With' 'Class' name=STRING '{' assertions+=ClassLevelAssertion* hatch=HATCH? '}'
		public Group getGroup() { return cGroup; }
		
		//'With'
		public Keyword getWithKeyword_0() { return cWithKeyword_0; }
		
		//'Class'
		public Keyword getClassKeyword_1() { return cClassKeyword_1; }
		
		//name=STRING
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_2_0() { return cNameSTRINGTerminalRuleCall_2_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//assertions+=ClassLevelAssertion*
		public Assignment getAssertionsAssignment_4() { return cAssertionsAssignment_4; }
		
		//ClassLevelAssertion
		public RuleCall getAssertionsClassLevelAssertionParserRuleCall_4_0() { return cAssertionsClassLevelAssertionParserRuleCall_4_0; }
		
		//hatch=HATCH?
		public Assignment getHatchAssignment_5() { return cHatchAssignment_5; }
		
		//HATCH
		public RuleCall getHatchHATCHTerminalRuleCall_5_0() { return cHatchHATCHTerminalRuleCall_5_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}
	public class PropertyAssertionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.zazuko.apitesting.dsl.ApiTestingDsl.PropertyAssertion");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cExpectKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cPropertyKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameSTRINGTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cLeftCurlyBracketKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cAssertionsAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cAssertionsClassLevelAssertionParserRuleCall_3_1_0 = (RuleCall)cAssertionsAssignment_3_1.eContents().get(0);
		private final Assignment cHatchAssignment_3_2 = (Assignment)cGroup_3.eContents().get(2);
		private final RuleCall cHatchHATCHTerminalRuleCall_3_2_0 = (RuleCall)cHatchAssignment_3_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3_3 = (Keyword)cGroup_3.eContents().get(3);
		
		//PropertyAssertion:
		//	'Expect' 'Property' name=STRING ('{'
		//	assertions+=ClassLevelAssertion*
		//	hatch=HATCH?
		//	'}')?;
		@Override public ParserRule getRule() { return rule; }
		
		//'Expect' 'Property' name=STRING ('{' assertions+=ClassLevelAssertion* hatch=HATCH? '}')?
		public Group getGroup() { return cGroup; }
		
		//'Expect'
		public Keyword getExpectKeyword_0() { return cExpectKeyword_0; }
		
		//'Property'
		public Keyword getPropertyKeyword_1() { return cPropertyKeyword_1; }
		
		//name=STRING
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_2_0() { return cNameSTRINGTerminalRuleCall_2_0; }
		
		//('{' assertions+=ClassLevelAssertion* hatch=HATCH? '}')?
		public Group getGroup_3() { return cGroup_3; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3_0() { return cLeftCurlyBracketKeyword_3_0; }
		
		//assertions+=ClassLevelAssertion*
		public Assignment getAssertionsAssignment_3_1() { return cAssertionsAssignment_3_1; }
		
		//ClassLevelAssertion
		public RuleCall getAssertionsClassLevelAssertionParserRuleCall_3_1_0() { return cAssertionsClassLevelAssertionParserRuleCall_3_1_0; }
		
		//hatch=HATCH?
		public Assignment getHatchAssignment_3_2() { return cHatchAssignment_3_2; }
		
		//HATCH
		public RuleCall getHatchHATCHTerminalRuleCall_3_2_0() { return cHatchHATCHTerminalRuleCall_3_2_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_3_3() { return cRightCurlyBracketKeyword_3_3; }
	}
	
	
	private final ModelElements pModel;
	private final ElementElements pElement;
	private final ClassLevelAssertionElements pClassLevelAssertion;
	private final ClassBlockElements pClassBlock;
	private final PropertyAssertionElements pPropertyAssertion;
	private final TerminalRule tHATCH;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public ApiTestingDslGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pElement = new ElementElements();
		this.pClassLevelAssertion = new ClassLevelAssertionElements();
		this.pClassBlock = new ClassBlockElements();
		this.pPropertyAssertion = new PropertyAssertionElements();
		this.tHATCH = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.zazuko.apitesting.dsl.ApiTestingDsl.HATCH");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("com.zazuko.apitesting.dsl.ApiTestingDsl".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//	elements+=Element*;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//Element:
	//	ClassBlock;
	public ElementElements getElementAccess() {
		return pElement;
	}
	
	public ParserRule getElementRule() {
		return getElementAccess().getRule();
	}
	
	//ClassLevelAssertion:
	//	PropertyAssertion;
	public ClassLevelAssertionElements getClassLevelAssertionAccess() {
		return pClassLevelAssertion;
	}
	
	public ParserRule getClassLevelAssertionRule() {
		return getClassLevelAssertionAccess().getRule();
	}
	
	//ClassBlock:
	//	'With' 'Class' name=STRING '{'
	//	assertions+=ClassLevelAssertion*
	//	hatch=HATCH?
	//	'}';
	public ClassBlockElements getClassBlockAccess() {
		return pClassBlock;
	}
	
	public ParserRule getClassBlockRule() {
		return getClassBlockAccess().getRule();
	}
	
	//PropertyAssertion:
	//	'Expect' 'Property' name=STRING ('{'
	//	assertions+=ClassLevelAssertion*
	//	hatch=HATCH?
	//	'}')?;
	public PropertyAssertionElements getPropertyAssertionAccess() {
		return pPropertyAssertion;
	}
	
	public ParserRule getPropertyAssertionRule() {
		return getPropertyAssertionAccess().getRule();
	}
	
	//terminal HATCH:
	//	'++'->'++';
	public TerminalRule getHATCHRule() {
		return tHATCH;
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
