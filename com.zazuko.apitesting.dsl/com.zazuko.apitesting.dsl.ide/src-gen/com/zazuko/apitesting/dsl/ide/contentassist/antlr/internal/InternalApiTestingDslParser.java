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


    // $ANTLR start "entryRuleClassLevelAssertion"
    // InternalApiTestingDsl.g:128:1: entryRuleClassLevelAssertion : ruleClassLevelAssertion EOF ;
    public final void entryRuleClassLevelAssertion() throws RecognitionException {
        try {
            // InternalApiTestingDsl.g:129:1: ( ruleClassLevelAssertion EOF )
            // InternalApiTestingDsl.g:130:1: ruleClassLevelAssertion EOF
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
    // InternalApiTestingDsl.g:137:1: ruleClassLevelAssertion : ( rulePropertyAssertion ) ;
    public final void ruleClassLevelAssertion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApiTestingDsl.g:141:2: ( ( rulePropertyAssertion ) )
            // InternalApiTestingDsl.g:142:2: ( rulePropertyAssertion )
            {
            // InternalApiTestingDsl.g:142:2: ( rulePropertyAssertion )
            // InternalApiTestingDsl.g:143:3: rulePropertyAssertion
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

                if ( (LA2_0==15) ) {
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
    // InternalApiTestingDsl.g:312:1: rule__ClassBlock__Group__5 : rule__ClassBlock__Group__5__Impl ;
    public final void rule__ClassBlock__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApiTestingDsl.g:316:1: ( rule__ClassBlock__Group__5__Impl )
            // InternalApiTestingDsl.g:317:2: rule__ClassBlock__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassBlock__Group__5__Impl();

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
    // InternalApiTestingDsl.g:323:1: rule__ClassBlock__Group__5__Impl : ( '}' ) ;
    public final void rule__ClassBlock__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApiTestingDsl.g:327:1: ( ( '}' ) )
            // InternalApiTestingDsl.g:328:1: ( '}' )
            {
            // InternalApiTestingDsl.g:328:1: ( '}' )
            // InternalApiTestingDsl.g:329:2: '}'
            {
             before(grammarAccess.getClassBlockAccess().getRightCurlyBracketKeyword_5()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getClassBlockAccess().getRightCurlyBracketKeyword_5()); 

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


    // $ANTLR start "rule__PropertyAssertion__Group__0"
    // InternalApiTestingDsl.g:339:1: rule__PropertyAssertion__Group__0 : rule__PropertyAssertion__Group__0__Impl rule__PropertyAssertion__Group__1 ;
    public final void rule__PropertyAssertion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApiTestingDsl.g:343:1: ( rule__PropertyAssertion__Group__0__Impl rule__PropertyAssertion__Group__1 )
            // InternalApiTestingDsl.g:344:2: rule__PropertyAssertion__Group__0__Impl rule__PropertyAssertion__Group__1
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
    // InternalApiTestingDsl.g:351:1: rule__PropertyAssertion__Group__0__Impl : ( 'Expect' ) ;
    public final void rule__PropertyAssertion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApiTestingDsl.g:355:1: ( ( 'Expect' ) )
            // InternalApiTestingDsl.g:356:1: ( 'Expect' )
            {
            // InternalApiTestingDsl.g:356:1: ( 'Expect' )
            // InternalApiTestingDsl.g:357:2: 'Expect'
            {
             before(grammarAccess.getPropertyAssertionAccess().getExpectKeyword_0()); 
            match(input,15,FOLLOW_2); 
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
    // InternalApiTestingDsl.g:366:1: rule__PropertyAssertion__Group__1 : rule__PropertyAssertion__Group__1__Impl rule__PropertyAssertion__Group__2 ;
    public final void rule__PropertyAssertion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApiTestingDsl.g:370:1: ( rule__PropertyAssertion__Group__1__Impl rule__PropertyAssertion__Group__2 )
            // InternalApiTestingDsl.g:371:2: rule__PropertyAssertion__Group__1__Impl rule__PropertyAssertion__Group__2
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
    // InternalApiTestingDsl.g:378:1: rule__PropertyAssertion__Group__1__Impl : ( 'Property' ) ;
    public final void rule__PropertyAssertion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApiTestingDsl.g:382:1: ( ( 'Property' ) )
            // InternalApiTestingDsl.g:383:1: ( 'Property' )
            {
            // InternalApiTestingDsl.g:383:1: ( 'Property' )
            // InternalApiTestingDsl.g:384:2: 'Property'
            {
             before(grammarAccess.getPropertyAssertionAccess().getPropertyKeyword_1()); 
            match(input,16,FOLLOW_2); 
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
    // InternalApiTestingDsl.g:393:1: rule__PropertyAssertion__Group__2 : rule__PropertyAssertion__Group__2__Impl ;
    public final void rule__PropertyAssertion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApiTestingDsl.g:397:1: ( rule__PropertyAssertion__Group__2__Impl )
            // InternalApiTestingDsl.g:398:2: rule__PropertyAssertion__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PropertyAssertion__Group__2__Impl();

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
    // InternalApiTestingDsl.g:404:1: rule__PropertyAssertion__Group__2__Impl : ( ( rule__PropertyAssertion__NameAssignment_2 ) ) ;
    public final void rule__PropertyAssertion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApiTestingDsl.g:408:1: ( ( ( rule__PropertyAssertion__NameAssignment_2 ) ) )
            // InternalApiTestingDsl.g:409:1: ( ( rule__PropertyAssertion__NameAssignment_2 ) )
            {
            // InternalApiTestingDsl.g:409:1: ( ( rule__PropertyAssertion__NameAssignment_2 ) )
            // InternalApiTestingDsl.g:410:2: ( rule__PropertyAssertion__NameAssignment_2 )
            {
             before(grammarAccess.getPropertyAssertionAccess().getNameAssignment_2()); 
            // InternalApiTestingDsl.g:411:2: ( rule__PropertyAssertion__NameAssignment_2 )
            // InternalApiTestingDsl.g:411:3: rule__PropertyAssertion__NameAssignment_2
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


    // $ANTLR start "rule__Model__ElementsAssignment"
    // InternalApiTestingDsl.g:420:1: rule__Model__ElementsAssignment : ( ruleElement ) ;
    public final void rule__Model__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApiTestingDsl.g:424:1: ( ( ruleElement ) )
            // InternalApiTestingDsl.g:425:2: ( ruleElement )
            {
            // InternalApiTestingDsl.g:425:2: ( ruleElement )
            // InternalApiTestingDsl.g:426:3: ruleElement
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
    // InternalApiTestingDsl.g:435:1: rule__ClassBlock__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ClassBlock__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApiTestingDsl.g:439:1: ( ( RULE_STRING ) )
            // InternalApiTestingDsl.g:440:2: ( RULE_STRING )
            {
            // InternalApiTestingDsl.g:440:2: ( RULE_STRING )
            // InternalApiTestingDsl.g:441:3: RULE_STRING
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
    // InternalApiTestingDsl.g:450:1: rule__ClassBlock__AssertionsAssignment_4 : ( ruleClassLevelAssertion ) ;
    public final void rule__ClassBlock__AssertionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApiTestingDsl.g:454:1: ( ( ruleClassLevelAssertion ) )
            // InternalApiTestingDsl.g:455:2: ( ruleClassLevelAssertion )
            {
            // InternalApiTestingDsl.g:455:2: ( ruleClassLevelAssertion )
            // InternalApiTestingDsl.g:456:3: ruleClassLevelAssertion
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


    // $ANTLR start "rule__PropertyAssertion__NameAssignment_2"
    // InternalApiTestingDsl.g:465:1: rule__PropertyAssertion__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__PropertyAssertion__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApiTestingDsl.g:469:1: ( ( RULE_STRING ) )
            // InternalApiTestingDsl.g:470:2: ( RULE_STRING )
            {
            // InternalApiTestingDsl.g:470:2: ( RULE_STRING )
            // InternalApiTestingDsl.g:471:3: RULE_STRING
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});

}