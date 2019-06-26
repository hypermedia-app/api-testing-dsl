package com.zazuko.apitesting.dsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import com.zazuko.apitesting.dsl.services.ApiTestingDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalApiTestingDslParser extends AbstractInternalContentAssistParser {
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

    	public void setGrammarAccess(ApiTestingDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalApiTestingDsl.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalApiTestingDsl.g:54:1: ( ruleModel EOF )
            // InternalApiTestingDsl.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalApiTestingDsl.g:62:1: ruleModel : ( ( rule__Model__ElementsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApiTestingDsl.g:66:2: ( ( ( rule__Model__ElementsAssignment )* ) )
            // InternalApiTestingDsl.g:67:2: ( ( rule__Model__ElementsAssignment )* )
            {
            // InternalApiTestingDsl.g:67:2: ( ( rule__Model__ElementsAssignment )* )
            // InternalApiTestingDsl.g:68:3: ( rule__Model__ElementsAssignment )*
            {
             before(grammarAccess.getModelAccess().getElementsAssignment()); 
            // InternalApiTestingDsl.g:69:3: ( rule__Model__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalApiTestingDsl.g:69:4: rule__Model__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__ElementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getElementsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleElement"
    // InternalApiTestingDsl.g:78:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // InternalApiTestingDsl.g:79:1: ( ruleElement EOF )
            // InternalApiTestingDsl.g:80:1: ruleElement EOF
            {
             before(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalApiTestingDsl.g:87:1: ruleElement : ( ruleClassBlock ) ;
    public final void ruleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApiTestingDsl.g:91:2: ( ( ruleClassBlock ) )
            // InternalApiTestingDsl.g:92:2: ( ruleClassBlock )
            {
            // InternalApiTestingDsl.g:92:2: ( ruleClassBlock )
            // InternalApiTestingDsl.g:93:3: ruleClassBlock
            {
             before(grammarAccess.getElementAccess().getClassBlockParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleClassBlock();

            state._fsp--;

             after(grammarAccess.getElementAccess().getClassBlockParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleClassBlock"
    // InternalApiTestingDsl.g:103:1: entryRuleClassBlock : ruleClassBlock EOF ;
    public final void entryRuleClassBlock() throws RecognitionException {
        try {
            // InternalApiTestingDsl.g:104:1: ( ruleClassBlock EOF )
            // InternalApiTestingDsl.g:105:1: ruleClassBlock EOF
            {
             before(grammarAccess.getClassBlockRule()); 
            pushFollow(FOLLOW_1);
            ruleClassBlock();

            state._fsp--;

             after(grammarAccess.getClassBlockRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleClassBlock"


    // $ANTLR start "ruleClassBlock"
    // InternalApiTestingDsl.g:112:1: ruleClassBlock : ( ( rule__ClassBlock__Group__0 ) ) ;
    public final void ruleClassBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApiTestingDsl.g:116:2: ( ( ( rule__ClassBlock__Group__0 ) ) )
            // InternalApiTestingDsl.g:117:2: ( ( rule__ClassBlock__Group__0 ) )
            {
            // InternalApiTestingDsl.g:117:2: ( ( rule__ClassBlock__Group__0 ) )
            // InternalApiTestingDsl.g:118:3: ( rule__ClassBlock__Group__0 )
            {
             before(grammarAccess.getClassBlockAccess().getGroup()); 
            // InternalApiTestingDsl.g:119:3: ( rule__ClassBlock__Group__0 )
            // InternalApiTestingDsl.g:119:4: rule__ClassBlock__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ClassBlock__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClassBlockAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClassBlock"


    // $ANTLR start "rule__ClassBlock__Group__0"
    // InternalApiTestingDsl.g:127:1: rule__ClassBlock__Group__0 : rule__ClassBlock__Group__0__Impl rule__ClassBlock__Group__1 ;
    public final void rule__ClassBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApiTestingDsl.g:131:1: ( rule__ClassBlock__Group__0__Impl rule__ClassBlock__Group__1 )
            // InternalApiTestingDsl.g:132:2: rule__ClassBlock__Group__0__Impl rule__ClassBlock__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ClassBlock__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassBlock__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassBlock__Group__0"


    // $ANTLR start "rule__ClassBlock__Group__0__Impl"
    // InternalApiTestingDsl.g:139:1: rule__ClassBlock__Group__0__Impl : ( 'With' ) ;
    public final void rule__ClassBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApiTestingDsl.g:143:1: ( ( 'With' ) )
            // InternalApiTestingDsl.g:144:1: ( 'With' )
            {
            // InternalApiTestingDsl.g:144:1: ( 'With' )
            // InternalApiTestingDsl.g:145:2: 'With'
            {
             before(grammarAccess.getClassBlockAccess().getWithKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getClassBlockAccess().getWithKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassBlock__Group__0__Impl"


    // $ANTLR start "rule__ClassBlock__Group__1"
    // InternalApiTestingDsl.g:154:1: rule__ClassBlock__Group__1 : rule__ClassBlock__Group__1__Impl rule__ClassBlock__Group__2 ;
    public final void rule__ClassBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApiTestingDsl.g:158:1: ( rule__ClassBlock__Group__1__Impl rule__ClassBlock__Group__2 )
            // InternalApiTestingDsl.g:159:2: rule__ClassBlock__Group__1__Impl rule__ClassBlock__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__ClassBlock__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassBlock__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassBlock__Group__1"


    // $ANTLR start "rule__ClassBlock__Group__1__Impl"
    // InternalApiTestingDsl.g:166:1: rule__ClassBlock__Group__1__Impl : ( 'Class' ) ;
    public final void rule__ClassBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApiTestingDsl.g:170:1: ( ( 'Class' ) )
            // InternalApiTestingDsl.g:171:1: ( 'Class' )
            {
            // InternalApiTestingDsl.g:171:1: ( 'Class' )
            // InternalApiTestingDsl.g:172:2: 'Class'
            {
             before(grammarAccess.getClassBlockAccess().getClassKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getClassBlockAccess().getClassKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassBlock__Group__1__Impl"


    // $ANTLR start "rule__ClassBlock__Group__2"
    // InternalApiTestingDsl.g:181:1: rule__ClassBlock__Group__2 : rule__ClassBlock__Group__2__Impl rule__ClassBlock__Group__3 ;
    public final void rule__ClassBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApiTestingDsl.g:185:1: ( rule__ClassBlock__Group__2__Impl rule__ClassBlock__Group__3 )
            // InternalApiTestingDsl.g:186:2: rule__ClassBlock__Group__2__Impl rule__ClassBlock__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__ClassBlock__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassBlock__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassBlock__Group__2"


    // $ANTLR start "rule__ClassBlock__Group__2__Impl"
    // InternalApiTestingDsl.g:193:1: rule__ClassBlock__Group__2__Impl : ( ( rule__ClassBlock__NameAssignment_2 ) ) ;
    public final void rule__ClassBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApiTestingDsl.g:197:1: ( ( ( rule__ClassBlock__NameAssignment_2 ) ) )
            // InternalApiTestingDsl.g:198:1: ( ( rule__ClassBlock__NameAssignment_2 ) )
            {
            // InternalApiTestingDsl.g:198:1: ( ( rule__ClassBlock__NameAssignment_2 ) )
            // InternalApiTestingDsl.g:199:2: ( rule__ClassBlock__NameAssignment_2 )
            {
             before(grammarAccess.getClassBlockAccess().getNameAssignment_2()); 
            // InternalApiTestingDsl.g:200:2: ( rule__ClassBlock__NameAssignment_2 )
            // InternalApiTestingDsl.g:200:3: rule__ClassBlock__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ClassBlock__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getClassBlockAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassBlock__Group__2__Impl"


    // $ANTLR start "rule__ClassBlock__Group__3"
    // InternalApiTestingDsl.g:208:1: rule__ClassBlock__Group__3 : rule__ClassBlock__Group__3__Impl rule__ClassBlock__Group__4 ;
    public final void rule__ClassBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApiTestingDsl.g:212:1: ( rule__ClassBlock__Group__3__Impl rule__ClassBlock__Group__4 )
            // InternalApiTestingDsl.g:213:2: rule__ClassBlock__Group__3__Impl rule__ClassBlock__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__ClassBlock__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassBlock__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassBlock__Group__3"


    // $ANTLR start "rule__ClassBlock__Group__3__Impl"
    // InternalApiTestingDsl.g:220:1: rule__ClassBlock__Group__3__Impl : ( '{' ) ;
    public final void rule__ClassBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApiTestingDsl.g:224:1: ( ( '{' ) )
            // InternalApiTestingDsl.g:225:1: ( '{' )
            {
            // InternalApiTestingDsl.g:225:1: ( '{' )
            // InternalApiTestingDsl.g:226:2: '{'
            {
             before(grammarAccess.getClassBlockAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getClassBlockAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassBlock__Group__3__Impl"


    // $ANTLR start "rule__ClassBlock__Group__4"
    // InternalApiTestingDsl.g:235:1: rule__ClassBlock__Group__4 : rule__ClassBlock__Group__4__Impl ;
    public final void rule__ClassBlock__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApiTestingDsl.g:239:1: ( rule__ClassBlock__Group__4__Impl )
            // InternalApiTestingDsl.g:240:2: rule__ClassBlock__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassBlock__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassBlock__Group__4"


    // $ANTLR start "rule__ClassBlock__Group__4__Impl"
    // InternalApiTestingDsl.g:246:1: rule__ClassBlock__Group__4__Impl : ( '}' ) ;
    public final void rule__ClassBlock__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApiTestingDsl.g:250:1: ( ( '}' ) )
            // InternalApiTestingDsl.g:251:1: ( '}' )
            {
            // InternalApiTestingDsl.g:251:1: ( '}' )
            // InternalApiTestingDsl.g:252:2: '}'
            {
             before(grammarAccess.getClassBlockAccess().getRightCurlyBracketKeyword_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getClassBlockAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassBlock__Group__4__Impl"


    // $ANTLR start "rule__Model__ElementsAssignment"
    // InternalApiTestingDsl.g:262:1: rule__Model__ElementsAssignment : ( ruleElement ) ;
    public final void rule__Model__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApiTestingDsl.g:266:1: ( ( ruleElement ) )
            // InternalApiTestingDsl.g:267:2: ( ruleElement )
            {
            // InternalApiTestingDsl.g:267:2: ( ruleElement )
            // InternalApiTestingDsl.g:268:3: ruleElement
            {
             before(grammarAccess.getModelAccess().getElementsElementParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getModelAccess().getElementsElementParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ElementsAssignment"


    // $ANTLR start "rule__ClassBlock__NameAssignment_2"
    // InternalApiTestingDsl.g:277:1: rule__ClassBlock__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ClassBlock__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApiTestingDsl.g:281:1: ( ( RULE_STRING ) )
            // InternalApiTestingDsl.g:282:2: ( RULE_STRING )
            {
            // InternalApiTestingDsl.g:282:2: ( RULE_STRING )
            // InternalApiTestingDsl.g:283:3: RULE_STRING
            {
             before(grammarAccess.getClassBlockAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getClassBlockAccess().getNameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassBlock__NameAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});

}