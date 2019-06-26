package com.zazuko.apitesting.dsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.zazuko.apitesting.dsl.services.ApiTestingDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalApiTestingDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'With'", "'Class'", "'{'", "'}'", "'Expect'", "'Property'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int RULE_INT=6;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalApiTestingDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalApiTestingDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalApiTestingDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalApiTestingDsl.g"; }



     	private ApiTestingDslGrammarAccess grammarAccess;

        public InternalApiTestingDslParser(TokenStream input, ApiTestingDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected ApiTestingDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalApiTestingDsl.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalApiTestingDsl.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalApiTestingDsl.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalApiTestingDsl.g:71:1: ruleModel returns [EObject current=null] : ( (lv_elements_0_0= ruleElement ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalApiTestingDsl.g:77:2: ( ( (lv_elements_0_0= ruleElement ) )* )
            // InternalApiTestingDsl.g:78:2: ( (lv_elements_0_0= ruleElement ) )*
            {
            // InternalApiTestingDsl.g:78:2: ( (lv_elements_0_0= ruleElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalApiTestingDsl.g:79:3: (lv_elements_0_0= ruleElement )
            	    {
            	    // InternalApiTestingDsl.g:79:3: (lv_elements_0_0= ruleElement )
            	    // InternalApiTestingDsl.g:80:4: lv_elements_0_0= ruleElement
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getElementsElementParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_elements_0_0=ruleElement();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"elements",
            	    					lv_elements_0_0,
            	    					"com.zazuko.apitesting.dsl.ApiTestingDsl.Element");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleElement"
    // InternalApiTestingDsl.g:100:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalApiTestingDsl.g:100:48: (iv_ruleElement= ruleElement EOF )
            // InternalApiTestingDsl.g:101:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalApiTestingDsl.g:107:1: ruleElement returns [EObject current=null] : this_ClassBlock_0= ruleClassBlock ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_ClassBlock_0 = null;



        	enterRule();

        try {
            // InternalApiTestingDsl.g:113:2: (this_ClassBlock_0= ruleClassBlock )
            // InternalApiTestingDsl.g:114:2: this_ClassBlock_0= ruleClassBlock
            {

            		newCompositeNode(grammarAccess.getElementAccess().getClassBlockParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_ClassBlock_0=ruleClassBlock();

            state._fsp--;


            		current = this_ClassBlock_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleClassBlock"
    // InternalApiTestingDsl.g:125:1: entryRuleClassBlock returns [EObject current=null] : iv_ruleClassBlock= ruleClassBlock EOF ;
    public final EObject entryRuleClassBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassBlock = null;


        try {
            // InternalApiTestingDsl.g:125:51: (iv_ruleClassBlock= ruleClassBlock EOF )
            // InternalApiTestingDsl.g:126:2: iv_ruleClassBlock= ruleClassBlock EOF
            {
             newCompositeNode(grammarAccess.getClassBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClassBlock=ruleClassBlock();

            state._fsp--;

             current =iv_ruleClassBlock; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClassBlock"


    // $ANTLR start "ruleClassBlock"
    // InternalApiTestingDsl.g:132:1: ruleClassBlock returns [EObject current=null] : (otherlv_0= 'With' otherlv_1= 'Class' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_assertions_4_0= ruleClassLevelAssertion ) )* otherlv_5= '}' ) ;
    public final EObject ruleClassBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_assertions_4_0 = null;



        	enterRule();

        try {
            // InternalApiTestingDsl.g:138:2: ( (otherlv_0= 'With' otherlv_1= 'Class' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_assertions_4_0= ruleClassLevelAssertion ) )* otherlv_5= '}' ) )
            // InternalApiTestingDsl.g:139:2: (otherlv_0= 'With' otherlv_1= 'Class' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_assertions_4_0= ruleClassLevelAssertion ) )* otherlv_5= '}' )
            {
            // InternalApiTestingDsl.g:139:2: (otherlv_0= 'With' otherlv_1= 'Class' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_assertions_4_0= ruleClassLevelAssertion ) )* otherlv_5= '}' )
            // InternalApiTestingDsl.g:140:3: otherlv_0= 'With' otherlv_1= 'Class' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_assertions_4_0= ruleClassLevelAssertion ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getClassBlockAccess().getWithKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getClassBlockAccess().getClassKeyword_1());
            		
            // InternalApiTestingDsl.g:148:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalApiTestingDsl.g:149:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalApiTestingDsl.g:149:4: (lv_name_2_0= RULE_STRING )
            // InternalApiTestingDsl.g:150:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getClassBlockAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClassBlockRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getClassBlockAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalApiTestingDsl.g:170:3: ( (lv_assertions_4_0= ruleClassLevelAssertion ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalApiTestingDsl.g:171:4: (lv_assertions_4_0= ruleClassLevelAssertion )
            	    {
            	    // InternalApiTestingDsl.g:171:4: (lv_assertions_4_0= ruleClassLevelAssertion )
            	    // InternalApiTestingDsl.g:172:5: lv_assertions_4_0= ruleClassLevelAssertion
            	    {

            	    					newCompositeNode(grammarAccess.getClassBlockAccess().getAssertionsClassLevelAssertionParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_assertions_4_0=ruleClassLevelAssertion();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getClassBlockRule());
            	    					}
            	    					add(
            	    						current,
            	    						"assertions",
            	    						lv_assertions_4_0,
            	    						"com.zazuko.apitesting.dsl.ApiTestingDsl.ClassLevelAssertion");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getClassBlockAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClassBlock"


    // $ANTLR start "entryRuleClassLevelAssertion"
    // InternalApiTestingDsl.g:197:1: entryRuleClassLevelAssertion returns [EObject current=null] : iv_ruleClassLevelAssertion= ruleClassLevelAssertion EOF ;
    public final EObject entryRuleClassLevelAssertion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassLevelAssertion = null;


        try {
            // InternalApiTestingDsl.g:197:60: (iv_ruleClassLevelAssertion= ruleClassLevelAssertion EOF )
            // InternalApiTestingDsl.g:198:2: iv_ruleClassLevelAssertion= ruleClassLevelAssertion EOF
            {
             newCompositeNode(grammarAccess.getClassLevelAssertionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClassLevelAssertion=ruleClassLevelAssertion();

            state._fsp--;

             current =iv_ruleClassLevelAssertion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClassLevelAssertion"


    // $ANTLR start "ruleClassLevelAssertion"
    // InternalApiTestingDsl.g:204:1: ruleClassLevelAssertion returns [EObject current=null] : this_PropertyAssertion_0= rulePropertyAssertion ;
    public final EObject ruleClassLevelAssertion() throws RecognitionException {
        EObject current = null;

        EObject this_PropertyAssertion_0 = null;



        	enterRule();

        try {
            // InternalApiTestingDsl.g:210:2: (this_PropertyAssertion_0= rulePropertyAssertion )
            // InternalApiTestingDsl.g:211:2: this_PropertyAssertion_0= rulePropertyAssertion
            {

            		newCompositeNode(grammarAccess.getClassLevelAssertionAccess().getPropertyAssertionParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_PropertyAssertion_0=rulePropertyAssertion();

            state._fsp--;


            		current = this_PropertyAssertion_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClassLevelAssertion"


    // $ANTLR start "entryRulePropertyAssertion"
    // InternalApiTestingDsl.g:222:1: entryRulePropertyAssertion returns [EObject current=null] : iv_rulePropertyAssertion= rulePropertyAssertion EOF ;
    public final EObject entryRulePropertyAssertion() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyAssertion = null;


        try {
            // InternalApiTestingDsl.g:222:58: (iv_rulePropertyAssertion= rulePropertyAssertion EOF )
            // InternalApiTestingDsl.g:223:2: iv_rulePropertyAssertion= rulePropertyAssertion EOF
            {
             newCompositeNode(grammarAccess.getPropertyAssertionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePropertyAssertion=rulePropertyAssertion();

            state._fsp--;

             current =iv_rulePropertyAssertion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePropertyAssertion"


    // $ANTLR start "rulePropertyAssertion"
    // InternalApiTestingDsl.g:229:1: rulePropertyAssertion returns [EObject current=null] : (otherlv_0= 'Expect' otherlv_1= 'Property' ( (lv_name_2_0= RULE_STRING ) ) ) ;
    public final EObject rulePropertyAssertion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalApiTestingDsl.g:235:2: ( (otherlv_0= 'Expect' otherlv_1= 'Property' ( (lv_name_2_0= RULE_STRING ) ) ) )
            // InternalApiTestingDsl.g:236:2: (otherlv_0= 'Expect' otherlv_1= 'Property' ( (lv_name_2_0= RULE_STRING ) ) )
            {
            // InternalApiTestingDsl.g:236:2: (otherlv_0= 'Expect' otherlv_1= 'Property' ( (lv_name_2_0= RULE_STRING ) ) )
            // InternalApiTestingDsl.g:237:3: otherlv_0= 'Expect' otherlv_1= 'Property' ( (lv_name_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getPropertyAssertionAccess().getExpectKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getPropertyAssertionAccess().getPropertyKeyword_1());
            		
            // InternalApiTestingDsl.g:245:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalApiTestingDsl.g:246:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalApiTestingDsl.g:246:4: (lv_name_2_0= RULE_STRING )
            // InternalApiTestingDsl.g:247:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_name_2_0, grammarAccess.getPropertyAssertionAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPropertyAssertionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePropertyAssertion"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});

}