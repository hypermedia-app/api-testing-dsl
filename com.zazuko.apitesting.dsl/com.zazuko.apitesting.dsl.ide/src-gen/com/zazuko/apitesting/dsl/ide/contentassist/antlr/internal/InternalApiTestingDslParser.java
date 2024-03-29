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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_HATCH", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'With'", "'Class'", "'{'", "'}'", "'Expect'", "'Property'"
    };
    public static final int RULE_ID=6;
    public static final int RULE_HATCH=5;
    public static final int RULE_WS=10;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=7;
    public static final int RULE_ML_COMMENT=8;
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

                if ( (LA1_0==12) ) {
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


    // $ANTLR start "entryRuleClassLevelAssertion"
    // InternalApiTestingDsl.g:103:1: entryRuleClassLevelAssertion : ruleClassLevelAssertion EOF ;
    public final void entryRuleClassLevelAssertion() throws RecognitionException {
        try {
            // InternalApiTestingDsl.g:104:1: ( ruleClassLevelAssertion EOF )
            // InternalApiTestingDsl.g:105:1: ruleClassLevelAssertion EOF
            {
             before(grammarAccess.getClassLevelAssertionRule()); 
            pushFollow(FOLLOW_1);
            ruleClassLevelAssertion();

            state._fsp--;

             after(grammarAccess.getClassLevelAssertionRule()); 
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
    // $ANTLR end "entryRuleClassLevelAssertion"


    // $ANTLR start "ruleClassLevelAssertion"
    // InternalApiTestingDsl.g:112:1: ruleClassLevelAssertion : ( rulePropertyAssertion ) ;
    public final void ruleClassLevelAssertion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApiTestingDsl.g:116:2: ( ( rulePropertyAssertion ) )
            // InternalApiTestingDsl.g:117:2: ( rulePropertyAssertion )
            {
            // InternalApiTestingDsl.g:117:2: ( rulePropertyAssertion )
            // InternalApiTestingDsl.g:118:3: rulePropertyAssertion
            {
             before(grammarAccess.getClassLevelAssertionAccess().getPropertyAssertionParserRuleCall()); 
            pushFollow(FOLLOW_2);
            rulePropertyAssertion();

            state._fsp--;

             after(grammarAccess.getClassLevelAssertionAccess().getPropertyAssertionParserRuleCall()); 

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
    // $ANTLR end "ruleClassLevelAssertion"


    // $ANTLR start "entryRuleClassBlock"
    // InternalApiTestingDsl.g:128:1: entryRuleClassBlock : ruleClassBlock EOF ;
    public final void entryRuleClassBlock() throws RecognitionException {
        try {
            // InternalApiTestingDsl.g:129:1: ( ruleClassBlock EOF )
            // InternalApiTestingDsl.g:130:1: ruleClassBlock EOF
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
    // InternalApiTestingDsl.g:137:1: ruleClassBlock : ( ( rule__ClassBlock__Group__0 ) ) ;
    public final void ruleClassBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApiTestingDsl.g:141:2: ( ( ( rule__ClassBlock__Group__0 ) ) )
            // InternalApiTestingDsl.g:142:2: ( ( rule__ClassBlock__Group__0 ) )
            {
            // InternalApiTestingDsl.g:142:2: ( ( rule__ClassBlock__Group__0 ) )
            // InternalApiTestingDsl.g:143:3: ( rule__ClassBlock__Group__0 )
            {
             before(grammarAccess.getClassBlockAccess().getGroup()); 
            // InternalApiTestingDsl.g:144:3: ( rule__ClassBlock__Group__0 )
            // InternalApiTestingDsl.g:144:4: rule__ClassBlock__Group__0
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


    // $ANTLR start "entryRulePropertyAssertion"
    // InternalApiTestingDsl.g:153:1: entryRulePropertyAssertion : rulePropertyAssertion EOF ;
    public final void entryRulePropertyAssertion() throws RecognitionException {
        try {
            // InternalApiTestingDsl.g:154:1: ( rulePropertyAssertion EOF )
            // InternalApiTestingDsl.g:155:1: rulePropertyAssertion EOF
            {
             before(grammarAccess.getPropertyAssertionRule()); 
            pushFollow(FOLLOW_1);
            rulePropertyAssertion();

            state._fsp--;

             after(grammarAccess.getPropertyAssertionRule()); 
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
    // $ANTLR end "entryRulePropertyAssertion"


    // $ANTLR start "rulePropertyAssertion"
    // InternalApiTestingDsl.g:162:1: rulePropertyAssertion : ( ( rule__PropertyAssertion__Group__0 ) ) ;
    public final void rulePropertyAssertion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApiTestingDsl.g:166:2: ( ( ( rule__PropertyAssertion__Group__0 ) ) )
            // InternalApiTestingDsl.g:167:2: ( ( rule__PropertyAssertion__Group__0 ) )
            {
            // InternalApiTestingDsl.g:167:2: ( ( rule__PropertyAssertion__Group__0 ) )
            // InternalApiTestingDsl.g:168:3: ( rule__PropertyAssertion__Group__0 )
            {
             before(grammarAccess.getPropertyAssertionAccess().getGroup()); 
            // InternalApiTestingDsl.g:169:3: ( rule__PropertyAssertion__Group__0 )
            // InternalApiTestingDsl.g:169:4: rule__PropertyAssertion__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PropertyAssertion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAssertionAccess().getGroup()); 

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
    // $ANTLR end "rulePropertyAssertion"


    // $ANTLR start "rule__ClassBlock__Group__0"
    // InternalApiTestingDsl.g:177:1: rule__ClassBlock__Group__0 : rule__ClassBlock__Group__0__Impl rule__ClassBlock__Group__1 ;
    public final void rule__ClassBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApiTestingDsl.g:181:1: ( rule__ClassBlock__Group__0__Impl rule__ClassBlock__Group__1 )
            // InternalApiTestingDsl.g:182:2: rule__ClassBlock__Group__0__Impl rule__ClassBlock__Group__1
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
    // InternalApiTestingDsl.g:189:1: rule__ClassBlock__Group__0__Impl : ( 'With' ) ;
    public final void rule__ClassBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApiTestingDsl.g:193:1: ( ( 'With' ) )
            // InternalApiTestingDsl.g:194:1: ( 'With' )
            {
            // InternalApiTestingDsl.g:194:1: ( 'With' )
            // InternalApiTestingDsl.g:195:2: 'With'
            {
             before(grammarAccess.getClassBlockAccess().getWithKeyword_0()); 
            match(input,12,FOLLOW_2); 
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
    // InternalApiTestingDsl.g:204:1: rule__ClassBlock__Group__1 : rule__ClassBlock__Group__1__Impl rule__ClassBlock__Group__2 ;
    public final void rule__ClassBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApiTestingDsl.g:208:1: ( rule__ClassBlock__Group__1__Impl rule__ClassBlock__Group__2 )
            // InternalApiTestingDsl.g:209:2: rule__ClassBlock__Group__1__Impl rule__ClassBlock__Group__2
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
    // InternalApiTestingDsl.g:216:1: rule__ClassBlock__Group__1__Impl : ( 'Class' ) ;
    public final void rule__ClassBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApiTestingDsl.g:220:1: ( ( 'Class' ) )
            // InternalApiTestingDsl.g:221:1: ( 'Class' )
            {
            // InternalApiTestingDsl.g:221:1: ( 'Class' )
            // InternalApiTestingDsl.g:222:2: 'Class'
            {
             before(grammarAccess.getClassBlockAccess().getClassKeyword_1()); 
            match(input,13,FOLLOW_2); 
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
    // InternalApiTestingDsl.g:231:1: rule__ClassBlock__Group__2 : rule__ClassBlock__Group__2__Impl rule__ClassBlock__Group__3 ;
    public final void rule__ClassBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApiTestingDsl.g:235:1: ( rule__ClassBlock__Group__2__Impl rule__ClassBlock__Group__3 )
            // InternalApiTestingDsl.g:236:2: rule__ClassBlock__Group__2__Impl rule__ClassBlock__Group__3
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
    // InternalApiTestingDsl.g:243:1: rule__ClassBlock__Group__2__Impl : ( ( rule__ClassBlock__NameAssignment_2 ) ) ;
    public final void rule__ClassBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApiTestingDsl.g:247:1: ( ( ( rule__ClassBlock__NameAssignment_2 ) ) )
            // InternalApiTestingDsl.g:248:1: ( ( rule__ClassBlock__NameAssignment_2 ) )
            {
            // InternalApiTestingDsl.g:248:1: ( ( rule__ClassBlock__NameAssignment_2 ) )
            // InternalApiTestingDsl.g:249:2: ( rule__ClassBlock__NameAssignment_2 )
            {
             before(grammarAccess.getClassBlockAccess().getNameAssignment_2()); 
            // InternalApiTestingDsl.g:250:2: ( rule__ClassBlock__NameAssignment_2 )
            // InternalApiTestingDsl.g:250:3: rule__ClassBlock__NameAssignment_2
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
    // InternalApiTestingDsl.g:258:1: rule__ClassBlock__Group__3 : rule__ClassBlock__Group__3__Impl rule__ClassBlock__Group__4 ;
    public final void rule__ClassBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApiTestingDsl.g:262:1: ( rule__ClassBlock__Group__3__Impl rule__ClassBlock__Group__4 )
            // InternalApiTestingDsl.g:263:2: rule__ClassBlock__Group__3__Impl rule__ClassBlock__Group__4
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
    // InternalApiTestingDsl.g:270:1: rule__ClassBlock__Group__3__Impl : ( '{' ) ;
    public final void rule__ClassBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApiTestingDsl.g:274:1: ( ( '{' ) )
            // InternalApiTestingDsl.g:275:1: ( '{' )
            {
            // InternalApiTestingDsl.g:275:1: ( '{' )
            // InternalApiTestingDsl.g:276:2: '{'
            {
             before(grammarAccess.getClassBlockAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,14,FOLLOW_2); 
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
    // InternalApiTestingDsl.g:285:1: rule__ClassBlock__Group__4 : rule__ClassBlock__Group__4__Impl rule__ClassBlock__Group__5 ;
    public final void rule__ClassBlock__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApiTestingDsl.g:289:1: ( rule__ClassBlock__Group__4__Impl rule__ClassBlock__Group__5 )
            // InternalApiTestingDsl.g:290:2: rule__ClassBlock__Group__4__Impl rule__ClassBlock__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__ClassBlock__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassBlock__Group__5();

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
    // InternalApiTestingDsl.g:297:1: rule__ClassBlock__Group__4__Impl : ( ( rule__ClassBlock__AssertionsAssignment_4 )* ) ;
    public final void rule__ClassBlock__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApiTestingDsl.g:301:1: ( ( ( rule__ClassBlock__AssertionsAssignment_4 )* ) )
            // InternalApiTestingDsl.g:302:1: ( ( rule__ClassBlock__AssertionsAssignment_4 )* )
            {
            // InternalApiTestingDsl.g:302:1: ( ( rule__ClassBlock__AssertionsAssignment_4 )* )
            // InternalApiTestingDsl.g:303:2: ( rule__ClassBlock__AssertionsAssignment_4 )*
            {
             before(grammarAccess.getClassBlockAccess().getAssertionsAssignment_4()); 
            // InternalApiTestingDsl.g:304:2: ( rule__ClassBlock__AssertionsAssignment_4 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalApiTestingDsl.g:304:3: rule__ClassBlock__AssertionsAssignment_4
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__ClassBlock__AssertionsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getClassBlockAccess().getAssertionsAssignment_4()); 

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


    // $ANTLR start "rule__ClassBlock__Group__5"
    // InternalApiTestingDsl.g:312:1: rule__ClassBlock__Group__5 : rule__ClassBlock__Group__5__Impl rule__ClassBlock__Group__6 ;
    public final void rule__ClassBlock__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApiTestingDsl.g:316:1: ( rule__ClassBlock__Group__5__Impl rule__ClassBlock__Group__6 )
            // InternalApiTestingDsl.g:317:2: rule__ClassBlock__Group__5__Impl rule__ClassBlock__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__ClassBlock__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassBlock__Group__6();

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
    // $ANTLR end "rule__ClassBlock__Group__5"


    // $ANTLR start "rule__ClassBlock__Group__5__Impl"
    // InternalApiTestingDsl.g:324:1: rule__ClassBlock__Group__5__Impl : ( ( rule__ClassBlock__HatchAssignment_5 )? ) ;
    public final void rule__ClassBlock__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApiTestingDsl.g:328:1: ( ( ( rule__ClassBlock__HatchAssignment_5 )? ) )
            // InternalApiTestingDsl.g:329:1: ( ( rule__ClassBlock__HatchAssignment_5 )? )
            {
            // InternalApiTestingDsl.g:329:1: ( ( rule__ClassBlock__HatchAssignment_5 )? )
            // InternalApiTestingDsl.g:330:2: ( rule__ClassBlock__HatchAssignment_5 )?
            {
             before(grammarAccess.getClassBlockAccess().getHatchAssignment_5()); 
            // InternalApiTestingDsl.g:331:2: ( rule__ClassBlock__HatchAssignment_5 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_HATCH) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalApiTestingDsl.g:331:3: rule__ClassBlock__HatchAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__ClassBlock__HatchAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassBlockAccess().getHatchAssignment_5()); 

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
    // $ANTLR end "rule__ClassBlock__Group__5__Impl"


    // $ANTLR start "rule__ClassBlock__Group__6"
    // InternalApiTestingDsl.g:339:1: rule__ClassBlock__Group__6 : rule__ClassBlock__Group__6__Impl ;
    public final void rule__ClassBlock__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApiTestingDsl.g:343:1: ( rule__ClassBlock__Group__6__Impl )
            // InternalApiTestingDsl.g:344:2: rule__ClassBlock__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassBlock__Group__6__Impl();

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
    // $ANTLR end "rule__ClassBlock__Group__6"


    // $ANTLR start "rule__ClassBlock__Group__6__Impl"
    // InternalApiTestingDsl.g:350:1: rule__ClassBlock__Group__6__Impl : ( '}' ) ;
    public final void rule__ClassBlock__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApiTestingDsl.g:354:1: ( ( '}' ) )
            // InternalApiTestingDsl.g:355:1: ( '}' )
            {
            // InternalApiTestingDsl.g:355:1: ( '}' )
            // InternalApiTestingDsl.g:356:2: '}'
            {
             before(grammarAccess.getClassBlockAccess().getRightCurlyBracketKeyword_6()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getClassBlockAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__ClassBlock__Group__6__Impl"


    // $ANTLR start "rule__PropertyAssertion__Group__0"
    // InternalApiTestingDsl.g:366:1: rule__PropertyAssertion__Group__0 : rule__PropertyAssertion__Group__0__Impl rule__PropertyAssertion__Group__1 ;
    public final void rule__PropertyAssertion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApiTestingDsl.g:370:1: ( rule__PropertyAssertion__Group__0__Impl rule__PropertyAssertion__Group__1 )
            // InternalApiTestingDsl.g:371:2: rule__PropertyAssertion__Group__0__Impl rule__PropertyAssertion__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__PropertyAssertion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyAssertion__Group__1();

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
    // $ANTLR end "rule__PropertyAssertion__Group__0"


    // $ANTLR start "rule__PropertyAssertion__Group__0__Impl"
    // InternalApiTestingDsl.g:378:1: rule__PropertyAssertion__Group__0__Impl : ( 'Expect' ) ;
    public final void rule__PropertyAssertion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApiTestingDsl.g:382:1: ( ( 'Expect' ) )
            // InternalApiTestingDsl.g:383:1: ( 'Expect' )
            {
            // InternalApiTestingDsl.g:383:1: ( 'Expect' )
            // InternalApiTestingDsl.g:384:2: 'Expect'
            {
             before(grammarAccess.getPropertyAssertionAccess().getExpectKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getPropertyAssertionAccess().getExpectKeyword_0()); 

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
    // $ANTLR end "rule__PropertyAssertion__Group__0__Impl"


    // $ANTLR start "rule__PropertyAssertion__Group__1"
    // InternalApiTestingDsl.g:393:1: rule__PropertyAssertion__Group__1 : rule__PropertyAssertion__Group__1__Impl rule__PropertyAssertion__Group__2 ;
    public final void rule__PropertyAssertion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApiTestingDsl.g:397:1: ( rule__PropertyAssertion__Group__1__Impl rule__PropertyAssertion__Group__2 )
            // InternalApiTestingDsl.g:398:2: rule__PropertyAssertion__Group__1__Impl rule__PropertyAssertion__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__PropertyAssertion__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyAssertion__Group__2();

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
    // $ANTLR end "rule__PropertyAssertion__Group__1"


    // $ANTLR start "rule__PropertyAssertion__Group__1__Impl"
    // InternalApiTestingDsl.g:405:1: rule__PropertyAssertion__Group__1__Impl : ( 'Property' ) ;
    public final void rule__PropertyAssertion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApiTestingDsl.g:409:1: ( ( 'Property' ) )
            // InternalApiTestingDsl.g:410:1: ( 'Property' )
            {
            // InternalApiTestingDsl.g:410:1: ( 'Property' )
            // InternalApiTestingDsl.g:411:2: 'Property'
            {
             before(grammarAccess.getPropertyAssertionAccess().getPropertyKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getPropertyAssertionAccess().getPropertyKeyword_1()); 

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
    // $ANTLR end "rule__PropertyAssertion__Group__1__Impl"


    // $ANTLR start "rule__PropertyAssertion__Group__2"
    // InternalApiTestingDsl.g:420:1: rule__PropertyAssertion__Group__2 : rule__PropertyAssertion__Group__2__Impl rule__PropertyAssertion__Group__3 ;
    public final void rule__PropertyAssertion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApiTestingDsl.g:424:1: ( rule__PropertyAssertion__Group__2__Impl rule__PropertyAssertion__Group__3 )
            // InternalApiTestingDsl.g:425:2: rule__PropertyAssertion__Group__2__Impl rule__PropertyAssertion__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__PropertyAssertion__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyAssertion__Group__3();

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
    // $ANTLR end "rule__PropertyAssertion__Group__2"


    // $ANTLR start "rule__PropertyAssertion__Group__2__Impl"
    // InternalApiTestingDsl.g:432:1: rule__PropertyAssertion__Group__2__Impl : ( ( rule__PropertyAssertion__NameAssignment_2 ) ) ;
    public final void rule__PropertyAssertion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApiTestingDsl.g:436:1: ( ( ( rule__PropertyAssertion__NameAssignment_2 ) ) )
            // InternalApiTestingDsl.g:437:1: ( ( rule__PropertyAssertion__NameAssignment_2 ) )
            {
            // InternalApiTestingDsl.g:437:1: ( ( rule__PropertyAssertion__NameAssignment_2 ) )
            // InternalApiTestingDsl.g:438:2: ( rule__PropertyAssertion__NameAssignment_2 )
            {
             before(grammarAccess.getPropertyAssertionAccess().getNameAssignment_2()); 
            // InternalApiTestingDsl.g:439:2: ( rule__PropertyAssertion__NameAssignment_2 )
            // InternalApiTestingDsl.g:439:3: rule__PropertyAssertion__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__PropertyAssertion__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAssertionAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__PropertyAssertion__Group__2__Impl"


    // $ANTLR start "rule__PropertyAssertion__Group__3"
    // InternalApiTestingDsl.g:447:1: rule__PropertyAssertion__Group__3 : rule__PropertyAssertion__Group__3__Impl ;
    public final void rule__PropertyAssertion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApiTestingDsl.g:451:1: ( rule__PropertyAssertion__Group__3__Impl )
            // InternalApiTestingDsl.g:452:2: rule__PropertyAssertion__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PropertyAssertion__Group__3__Impl();

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
    // $ANTLR end "rule__PropertyAssertion__Group__3"


    // $ANTLR start "rule__PropertyAssertion__Group__3__Impl"
    // InternalApiTestingDsl.g:458:1: rule__PropertyAssertion__Group__3__Impl : ( ( rule__PropertyAssertion__Group_3__0 )? ) ;
    public final void rule__PropertyAssertion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApiTestingDsl.g:462:1: ( ( ( rule__PropertyAssertion__Group_3__0 )? ) )
            // InternalApiTestingDsl.g:463:1: ( ( rule__PropertyAssertion__Group_3__0 )? )
            {
            // InternalApiTestingDsl.g:463:1: ( ( rule__PropertyAssertion__Group_3__0 )? )
            // InternalApiTestingDsl.g:464:2: ( rule__PropertyAssertion__Group_3__0 )?
            {
             before(grammarAccess.getPropertyAssertionAccess().getGroup_3()); 
            // InternalApiTestingDsl.g:465:2: ( rule__PropertyAssertion__Group_3__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalApiTestingDsl.g:465:3: rule__PropertyAssertion__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PropertyAssertion__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPropertyAssertionAccess().getGroup_3()); 

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
    // $ANTLR end "rule__PropertyAssertion__Group__3__Impl"


    // $ANTLR start "rule__PropertyAssertion__Group_3__0"
    // InternalApiTestingDsl.g:474:1: rule__PropertyAssertion__Group_3__0 : rule__PropertyAssertion__Group_3__0__Impl rule__PropertyAssertion__Group_3__1 ;
    public final void rule__PropertyAssertion__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApiTestingDsl.g:478:1: ( rule__PropertyAssertion__Group_3__0__Impl rule__PropertyAssertion__Group_3__1 )
            // InternalApiTestingDsl.g:479:2: rule__PropertyAssertion__Group_3__0__Impl rule__PropertyAssertion__Group_3__1
            {
            pushFollow(FOLLOW_7);
            rule__PropertyAssertion__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyAssertion__Group_3__1();

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
    // $ANTLR end "rule__PropertyAssertion__Group_3__0"


    // $ANTLR start "rule__PropertyAssertion__Group_3__0__Impl"
    // InternalApiTestingDsl.g:486:1: rule__PropertyAssertion__Group_3__0__Impl : ( '{' ) ;
    public final void rule__PropertyAssertion__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApiTestingDsl.g:490:1: ( ( '{' ) )
            // InternalApiTestingDsl.g:491:1: ( '{' )
            {
            // InternalApiTestingDsl.g:491:1: ( '{' )
            // InternalApiTestingDsl.g:492:2: '{'
            {
             before(grammarAccess.getPropertyAssertionAccess().getLeftCurlyBracketKeyword_3_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getPropertyAssertionAccess().getLeftCurlyBracketKeyword_3_0()); 

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
    // $ANTLR end "rule__PropertyAssertion__Group_3__0__Impl"


    // $ANTLR start "rule__PropertyAssertion__Group_3__1"
    // InternalApiTestingDsl.g:501:1: rule__PropertyAssertion__Group_3__1 : rule__PropertyAssertion__Group_3__1__Impl rule__PropertyAssertion__Group_3__2 ;
    public final void rule__PropertyAssertion__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApiTestingDsl.g:505:1: ( rule__PropertyAssertion__Group_3__1__Impl rule__PropertyAssertion__Group_3__2 )
            // InternalApiTestingDsl.g:506:2: rule__PropertyAssertion__Group_3__1__Impl rule__PropertyAssertion__Group_3__2
            {
            pushFollow(FOLLOW_7);
            rule__PropertyAssertion__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyAssertion__Group_3__2();

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
    // $ANTLR end "rule__PropertyAssertion__Group_3__1"


    // $ANTLR start "rule__PropertyAssertion__Group_3__1__Impl"
    // InternalApiTestingDsl.g:513:1: rule__PropertyAssertion__Group_3__1__Impl : ( ( rule__PropertyAssertion__AssertionsAssignment_3_1 )* ) ;
    public final void rule__PropertyAssertion__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApiTestingDsl.g:517:1: ( ( ( rule__PropertyAssertion__AssertionsAssignment_3_1 )* ) )
            // InternalApiTestingDsl.g:518:1: ( ( rule__PropertyAssertion__AssertionsAssignment_3_1 )* )
            {
            // InternalApiTestingDsl.g:518:1: ( ( rule__PropertyAssertion__AssertionsAssignment_3_1 )* )
            // InternalApiTestingDsl.g:519:2: ( rule__PropertyAssertion__AssertionsAssignment_3_1 )*
            {
             before(grammarAccess.getPropertyAssertionAccess().getAssertionsAssignment_3_1()); 
            // InternalApiTestingDsl.g:520:2: ( rule__PropertyAssertion__AssertionsAssignment_3_1 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==16) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalApiTestingDsl.g:520:3: rule__PropertyAssertion__AssertionsAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__PropertyAssertion__AssertionsAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getPropertyAssertionAccess().getAssertionsAssignment_3_1()); 

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
    // $ANTLR end "rule__PropertyAssertion__Group_3__1__Impl"


    // $ANTLR start "rule__PropertyAssertion__Group_3__2"
    // InternalApiTestingDsl.g:528:1: rule__PropertyAssertion__Group_3__2 : rule__PropertyAssertion__Group_3__2__Impl rule__PropertyAssertion__Group_3__3 ;
    public final void rule__PropertyAssertion__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApiTestingDsl.g:532:1: ( rule__PropertyAssertion__Group_3__2__Impl rule__PropertyAssertion__Group_3__3 )
            // InternalApiTestingDsl.g:533:2: rule__PropertyAssertion__Group_3__2__Impl rule__PropertyAssertion__Group_3__3
            {
            pushFollow(FOLLOW_7);
            rule__PropertyAssertion__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyAssertion__Group_3__3();

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
    // $ANTLR end "rule__PropertyAssertion__Group_3__2"


    // $ANTLR start "rule__PropertyAssertion__Group_3__2__Impl"
    // InternalApiTestingDsl.g:540:1: rule__PropertyAssertion__Group_3__2__Impl : ( ( rule__PropertyAssertion__HatchAssignment_3_2 )? ) ;
    public final void rule__PropertyAssertion__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApiTestingDsl.g:544:1: ( ( ( rule__PropertyAssertion__HatchAssignment_3_2 )? ) )
            // InternalApiTestingDsl.g:545:1: ( ( rule__PropertyAssertion__HatchAssignment_3_2 )? )
            {
            // InternalApiTestingDsl.g:545:1: ( ( rule__PropertyAssertion__HatchAssignment_3_2 )? )
            // InternalApiTestingDsl.g:546:2: ( rule__PropertyAssertion__HatchAssignment_3_2 )?
            {
             before(grammarAccess.getPropertyAssertionAccess().getHatchAssignment_3_2()); 
            // InternalApiTestingDsl.g:547:2: ( rule__PropertyAssertion__HatchAssignment_3_2 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_HATCH) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalApiTestingDsl.g:547:3: rule__PropertyAssertion__HatchAssignment_3_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__PropertyAssertion__HatchAssignment_3_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPropertyAssertionAccess().getHatchAssignment_3_2()); 

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
    // $ANTLR end "rule__PropertyAssertion__Group_3__2__Impl"


    // $ANTLR start "rule__PropertyAssertion__Group_3__3"
    // InternalApiTestingDsl.g:555:1: rule__PropertyAssertion__Group_3__3 : rule__PropertyAssertion__Group_3__3__Impl ;
    public final void rule__PropertyAssertion__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApiTestingDsl.g:559:1: ( rule__PropertyAssertion__Group_3__3__Impl )
            // InternalApiTestingDsl.g:560:2: rule__PropertyAssertion__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PropertyAssertion__Group_3__3__Impl();

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
    // $ANTLR end "rule__PropertyAssertion__Group_3__3"


    // $ANTLR start "rule__PropertyAssertion__Group_3__3__Impl"
    // InternalApiTestingDsl.g:566:1: rule__PropertyAssertion__Group_3__3__Impl : ( '}' ) ;
    public final void rule__PropertyAssertion__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApiTestingDsl.g:570:1: ( ( '}' ) )
            // InternalApiTestingDsl.g:571:1: ( '}' )
            {
            // InternalApiTestingDsl.g:571:1: ( '}' )
            // InternalApiTestingDsl.g:572:2: '}'
            {
             before(grammarAccess.getPropertyAssertionAccess().getRightCurlyBracketKeyword_3_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getPropertyAssertionAccess().getRightCurlyBracketKeyword_3_3()); 

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
    // $ANTLR end "rule__PropertyAssertion__Group_3__3__Impl"


    // $ANTLR start "rule__Model__ElementsAssignment"
    // InternalApiTestingDsl.g:582:1: rule__Model__ElementsAssignment : ( ruleElement ) ;
    public final void rule__Model__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApiTestingDsl.g:586:1: ( ( ruleElement ) )
            // InternalApiTestingDsl.g:587:2: ( ruleElement )
            {
            // InternalApiTestingDsl.g:587:2: ( ruleElement )
            // InternalApiTestingDsl.g:588:3: ruleElement
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
    // InternalApiTestingDsl.g:597:1: rule__ClassBlock__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ClassBlock__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApiTestingDsl.g:601:1: ( ( RULE_STRING ) )
            // InternalApiTestingDsl.g:602:2: ( RULE_STRING )
            {
            // InternalApiTestingDsl.g:602:2: ( RULE_STRING )
            // InternalApiTestingDsl.g:603:3: RULE_STRING
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


    // $ANTLR start "rule__ClassBlock__AssertionsAssignment_4"
    // InternalApiTestingDsl.g:612:1: rule__ClassBlock__AssertionsAssignment_4 : ( ruleClassLevelAssertion ) ;
    public final void rule__ClassBlock__AssertionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApiTestingDsl.g:616:1: ( ( ruleClassLevelAssertion ) )
            // InternalApiTestingDsl.g:617:2: ( ruleClassLevelAssertion )
            {
            // InternalApiTestingDsl.g:617:2: ( ruleClassLevelAssertion )
            // InternalApiTestingDsl.g:618:3: ruleClassLevelAssertion
            {
             before(grammarAccess.getClassBlockAccess().getAssertionsClassLevelAssertionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleClassLevelAssertion();

            state._fsp--;

             after(grammarAccess.getClassBlockAccess().getAssertionsClassLevelAssertionParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__ClassBlock__AssertionsAssignment_4"


    // $ANTLR start "rule__ClassBlock__HatchAssignment_5"
    // InternalApiTestingDsl.g:627:1: rule__ClassBlock__HatchAssignment_5 : ( RULE_HATCH ) ;
    public final void rule__ClassBlock__HatchAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApiTestingDsl.g:631:1: ( ( RULE_HATCH ) )
            // InternalApiTestingDsl.g:632:2: ( RULE_HATCH )
            {
            // InternalApiTestingDsl.g:632:2: ( RULE_HATCH )
            // InternalApiTestingDsl.g:633:3: RULE_HATCH
            {
             before(grammarAccess.getClassBlockAccess().getHatchHATCHTerminalRuleCall_5_0()); 
            match(input,RULE_HATCH,FOLLOW_2); 
             after(grammarAccess.getClassBlockAccess().getHatchHATCHTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__ClassBlock__HatchAssignment_5"


    // $ANTLR start "rule__PropertyAssertion__NameAssignment_2"
    // InternalApiTestingDsl.g:642:1: rule__PropertyAssertion__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__PropertyAssertion__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApiTestingDsl.g:646:1: ( ( RULE_STRING ) )
            // InternalApiTestingDsl.g:647:2: ( RULE_STRING )
            {
            // InternalApiTestingDsl.g:647:2: ( RULE_STRING )
            // InternalApiTestingDsl.g:648:3: RULE_STRING
            {
             before(grammarAccess.getPropertyAssertionAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPropertyAssertionAccess().getNameSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__PropertyAssertion__NameAssignment_2"


    // $ANTLR start "rule__PropertyAssertion__AssertionsAssignment_3_1"
    // InternalApiTestingDsl.g:657:1: rule__PropertyAssertion__AssertionsAssignment_3_1 : ( ruleClassLevelAssertion ) ;
    public final void rule__PropertyAssertion__AssertionsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApiTestingDsl.g:661:1: ( ( ruleClassLevelAssertion ) )
            // InternalApiTestingDsl.g:662:2: ( ruleClassLevelAssertion )
            {
            // InternalApiTestingDsl.g:662:2: ( ruleClassLevelAssertion )
            // InternalApiTestingDsl.g:663:3: ruleClassLevelAssertion
            {
             before(grammarAccess.getPropertyAssertionAccess().getAssertionsClassLevelAssertionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleClassLevelAssertion();

            state._fsp--;

             after(grammarAccess.getPropertyAssertionAccess().getAssertionsClassLevelAssertionParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__PropertyAssertion__AssertionsAssignment_3_1"


    // $ANTLR start "rule__PropertyAssertion__HatchAssignment_3_2"
    // InternalApiTestingDsl.g:672:1: rule__PropertyAssertion__HatchAssignment_3_2 : ( RULE_HATCH ) ;
    public final void rule__PropertyAssertion__HatchAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApiTestingDsl.g:676:1: ( ( RULE_HATCH ) )
            // InternalApiTestingDsl.g:677:2: ( RULE_HATCH )
            {
            // InternalApiTestingDsl.g:677:2: ( RULE_HATCH )
            // InternalApiTestingDsl.g:678:3: RULE_HATCH
            {
             before(grammarAccess.getPropertyAssertionAccess().getHatchHATCHTerminalRuleCall_3_2_0()); 
            match(input,RULE_HATCH,FOLLOW_2); 
             after(grammarAccess.getPropertyAssertionAccess().getHatchHATCHTerminalRuleCall_3_2_0()); 

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
    // $ANTLR end "rule__PropertyAssertion__HatchAssignment_3_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000018020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});

}