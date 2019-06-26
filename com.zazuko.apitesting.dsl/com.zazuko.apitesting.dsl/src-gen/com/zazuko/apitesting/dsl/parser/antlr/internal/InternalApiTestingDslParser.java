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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'With'", "'Class'", "'{'", "'}'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
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
    // InternalApiTestingDsl.g:132:1: ruleClassBlock returns [EObject current=null] : (otherlv_0= 'With' otherlv_1= 'Class' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '{' otherlv_4= '}' ) ;
    public final EObject ruleClassBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalApiTestingDsl.g:138:2: ( (otherlv_0= 'With' otherlv_1= 'Class' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '{' otherlv_4= '}' ) )
            // InternalApiTestingDsl.g:139:2: (otherlv_0= 'With' otherlv_1= 'Class' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '{' otherlv_4= '}' )
            {
            // InternalApiTestingDsl.g:139:2: (otherlv_0= 'With' otherlv_1= 'Class' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '{' otherlv_4= '}' )
            // InternalApiTestingDsl.g:140:3: otherlv_0= 'With' otherlv_1= 'Class' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '{' otherlv_4= '}'
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
            		
            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getClassBlockAccess().getRightCurlyBracketKeyword_4());
            		

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});

}