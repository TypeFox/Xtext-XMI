package io.typefox.xtextxmi.xtree.ide.contentassist.antlr.internal;

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
import io.typefox.xtextxmi.xtree.services.XtreeGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXtreeParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'('", "')'", "'related'", "'children'", "'.'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalXtreeParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalXtreeParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalXtreeParser.tokenNames; }
    public String getGrammarFileName() { return "InternalXtree.g"; }


    	private XtreeGrammarAccess grammarAccess;

    	public void setGrammarAccess(XtreeGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleNode"
    // InternalXtree.g:53:1: entryRuleNode : ruleNode EOF ;
    public final void entryRuleNode() throws RecognitionException {
        try {
            // InternalXtree.g:54:1: ( ruleNode EOF )
            // InternalXtree.g:55:1: ruleNode EOF
            {
             before(grammarAccess.getNodeRule()); 
            pushFollow(FOLLOW_1);
            ruleNode();

            state._fsp--;

             after(grammarAccess.getNodeRule()); 
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
    // $ANTLR end "entryRuleNode"


    // $ANTLR start "ruleNode"
    // InternalXtree.g:62:1: ruleNode : ( ( rule__Node__Group__0 ) ) ;
    public final void ruleNode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtree.g:66:2: ( ( ( rule__Node__Group__0 ) ) )
            // InternalXtree.g:67:2: ( ( rule__Node__Group__0 ) )
            {
            // InternalXtree.g:67:2: ( ( rule__Node__Group__0 ) )
            // InternalXtree.g:68:3: ( rule__Node__Group__0 )
            {
             before(grammarAccess.getNodeAccess().getGroup()); 
            // InternalXtree.g:69:3: ( rule__Node__Group__0 )
            // InternalXtree.g:69:4: rule__Node__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Node__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNodeAccess().getGroup()); 

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
    // $ANTLR end "ruleNode"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalXtree.g:78:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalXtree.g:79:1: ( ruleQualifiedName EOF )
            // InternalXtree.g:80:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalXtree.g:87:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtree.g:91:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalXtree.g:92:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalXtree.g:92:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalXtree.g:93:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalXtree.g:94:3: ( rule__QualifiedName__Group__0 )
            // InternalXtree.g:94:4: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "rule__Node__Group__0"
    // InternalXtree.g:102:1: rule__Node__Group__0 : rule__Node__Group__0__Impl rule__Node__Group__1 ;
    public final void rule__Node__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtree.g:106:1: ( rule__Node__Group__0__Impl rule__Node__Group__1 )
            // InternalXtree.g:107:2: rule__Node__Group__0__Impl rule__Node__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Node__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group__1();

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
    // $ANTLR end "rule__Node__Group__0"


    // $ANTLR start "rule__Node__Group__0__Impl"
    // InternalXtree.g:114:1: rule__Node__Group__0__Impl : ( ( rule__Node__NameAssignment_0 ) ) ;
    public final void rule__Node__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtree.g:118:1: ( ( ( rule__Node__NameAssignment_0 ) ) )
            // InternalXtree.g:119:1: ( ( rule__Node__NameAssignment_0 ) )
            {
            // InternalXtree.g:119:1: ( ( rule__Node__NameAssignment_0 ) )
            // InternalXtree.g:120:2: ( rule__Node__NameAssignment_0 )
            {
             before(grammarAccess.getNodeAccess().getNameAssignment_0()); 
            // InternalXtree.g:121:2: ( rule__Node__NameAssignment_0 )
            // InternalXtree.g:121:3: rule__Node__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Node__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getNodeAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__Node__Group__0__Impl"


    // $ANTLR start "rule__Node__Group__1"
    // InternalXtree.g:129:1: rule__Node__Group__1 : rule__Node__Group__1__Impl ;
    public final void rule__Node__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtree.g:133:1: ( rule__Node__Group__1__Impl )
            // InternalXtree.g:134:2: rule__Node__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Node__Group__1__Impl();

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
    // $ANTLR end "rule__Node__Group__1"


    // $ANTLR start "rule__Node__Group__1__Impl"
    // InternalXtree.g:140:1: rule__Node__Group__1__Impl : ( ( rule__Node__Group_1__0 )? ) ;
    public final void rule__Node__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtree.g:144:1: ( ( ( rule__Node__Group_1__0 )? ) )
            // InternalXtree.g:145:1: ( ( rule__Node__Group_1__0 )? )
            {
            // InternalXtree.g:145:1: ( ( rule__Node__Group_1__0 )? )
            // InternalXtree.g:146:2: ( rule__Node__Group_1__0 )?
            {
             before(grammarAccess.getNodeAccess().getGroup_1()); 
            // InternalXtree.g:147:2: ( rule__Node__Group_1__0 )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalXtree.g:147:3: rule__Node__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Node__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNodeAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Node__Group__1__Impl"


    // $ANTLR start "rule__Node__Group_1__0"
    // InternalXtree.g:156:1: rule__Node__Group_1__0 : rule__Node__Group_1__0__Impl rule__Node__Group_1__1 ;
    public final void rule__Node__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtree.g:160:1: ( rule__Node__Group_1__0__Impl rule__Node__Group_1__1 )
            // InternalXtree.g:161:2: rule__Node__Group_1__0__Impl rule__Node__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__Node__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group_1__1();

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
    // $ANTLR end "rule__Node__Group_1__0"


    // $ANTLR start "rule__Node__Group_1__0__Impl"
    // InternalXtree.g:168:1: rule__Node__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Node__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtree.g:172:1: ( ( '(' ) )
            // InternalXtree.g:173:1: ( '(' )
            {
            // InternalXtree.g:173:1: ( '(' )
            // InternalXtree.g:174:2: '('
            {
             before(grammarAccess.getNodeAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getNodeAccess().getLeftParenthesisKeyword_1_0()); 

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
    // $ANTLR end "rule__Node__Group_1__0__Impl"


    // $ANTLR start "rule__Node__Group_1__1"
    // InternalXtree.g:183:1: rule__Node__Group_1__1 : rule__Node__Group_1__1__Impl rule__Node__Group_1__2 ;
    public final void rule__Node__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtree.g:187:1: ( rule__Node__Group_1__1__Impl rule__Node__Group_1__2 )
            // InternalXtree.g:188:2: rule__Node__Group_1__1__Impl rule__Node__Group_1__2
            {
            pushFollow(FOLLOW_4);
            rule__Node__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group_1__2();

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
    // $ANTLR end "rule__Node__Group_1__1"


    // $ANTLR start "rule__Node__Group_1__1__Impl"
    // InternalXtree.g:195:1: rule__Node__Group_1__1__Impl : ( ( rule__Node__Group_1_1__0 )? ) ;
    public final void rule__Node__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtree.g:199:1: ( ( ( rule__Node__Group_1_1__0 )? ) )
            // InternalXtree.g:200:1: ( ( rule__Node__Group_1_1__0 )? )
            {
            // InternalXtree.g:200:1: ( ( rule__Node__Group_1_1__0 )? )
            // InternalXtree.g:201:2: ( rule__Node__Group_1_1__0 )?
            {
             before(grammarAccess.getNodeAccess().getGroup_1_1()); 
            // InternalXtree.g:202:2: ( rule__Node__Group_1_1__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalXtree.g:202:3: rule__Node__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Node__Group_1_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNodeAccess().getGroup_1_1()); 

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
    // $ANTLR end "rule__Node__Group_1__1__Impl"


    // $ANTLR start "rule__Node__Group_1__2"
    // InternalXtree.g:210:1: rule__Node__Group_1__2 : rule__Node__Group_1__2__Impl rule__Node__Group_1__3 ;
    public final void rule__Node__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtree.g:214:1: ( rule__Node__Group_1__2__Impl rule__Node__Group_1__3 )
            // InternalXtree.g:215:2: rule__Node__Group_1__2__Impl rule__Node__Group_1__3
            {
            pushFollow(FOLLOW_4);
            rule__Node__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group_1__3();

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
    // $ANTLR end "rule__Node__Group_1__2"


    // $ANTLR start "rule__Node__Group_1__2__Impl"
    // InternalXtree.g:222:1: rule__Node__Group_1__2__Impl : ( ( rule__Node__Group_1_2__0 )? ) ;
    public final void rule__Node__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtree.g:226:1: ( ( ( rule__Node__Group_1_2__0 )? ) )
            // InternalXtree.g:227:1: ( ( rule__Node__Group_1_2__0 )? )
            {
            // InternalXtree.g:227:1: ( ( rule__Node__Group_1_2__0 )? )
            // InternalXtree.g:228:2: ( rule__Node__Group_1_2__0 )?
            {
             before(grammarAccess.getNodeAccess().getGroup_1_2()); 
            // InternalXtree.g:229:2: ( rule__Node__Group_1_2__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalXtree.g:229:3: rule__Node__Group_1_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Node__Group_1_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNodeAccess().getGroup_1_2()); 

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
    // $ANTLR end "rule__Node__Group_1__2__Impl"


    // $ANTLR start "rule__Node__Group_1__3"
    // InternalXtree.g:237:1: rule__Node__Group_1__3 : rule__Node__Group_1__3__Impl ;
    public final void rule__Node__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtree.g:241:1: ( rule__Node__Group_1__3__Impl )
            // InternalXtree.g:242:2: rule__Node__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Node__Group_1__3__Impl();

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
    // $ANTLR end "rule__Node__Group_1__3"


    // $ANTLR start "rule__Node__Group_1__3__Impl"
    // InternalXtree.g:248:1: rule__Node__Group_1__3__Impl : ( ')' ) ;
    public final void rule__Node__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtree.g:252:1: ( ( ')' ) )
            // InternalXtree.g:253:1: ( ')' )
            {
            // InternalXtree.g:253:1: ( ')' )
            // InternalXtree.g:254:2: ')'
            {
             before(grammarAccess.getNodeAccess().getRightParenthesisKeyword_1_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getNodeAccess().getRightParenthesisKeyword_1_3()); 

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
    // $ANTLR end "rule__Node__Group_1__3__Impl"


    // $ANTLR start "rule__Node__Group_1_1__0"
    // InternalXtree.g:264:1: rule__Node__Group_1_1__0 : rule__Node__Group_1_1__0__Impl rule__Node__Group_1_1__1 ;
    public final void rule__Node__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtree.g:268:1: ( rule__Node__Group_1_1__0__Impl rule__Node__Group_1_1__1 )
            // InternalXtree.g:269:2: rule__Node__Group_1_1__0__Impl rule__Node__Group_1_1__1
            {
            pushFollow(FOLLOW_5);
            rule__Node__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group_1_1__1();

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
    // $ANTLR end "rule__Node__Group_1_1__0"


    // $ANTLR start "rule__Node__Group_1_1__0__Impl"
    // InternalXtree.g:276:1: rule__Node__Group_1_1__0__Impl : ( 'related' ) ;
    public final void rule__Node__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtree.g:280:1: ( ( 'related' ) )
            // InternalXtree.g:281:1: ( 'related' )
            {
            // InternalXtree.g:281:1: ( 'related' )
            // InternalXtree.g:282:2: 'related'
            {
             before(grammarAccess.getNodeAccess().getRelatedKeyword_1_1_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getNodeAccess().getRelatedKeyword_1_1_0()); 

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
    // $ANTLR end "rule__Node__Group_1_1__0__Impl"


    // $ANTLR start "rule__Node__Group_1_1__1"
    // InternalXtree.g:291:1: rule__Node__Group_1_1__1 : rule__Node__Group_1_1__1__Impl ;
    public final void rule__Node__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtree.g:295:1: ( rule__Node__Group_1_1__1__Impl )
            // InternalXtree.g:296:2: rule__Node__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Node__Group_1_1__1__Impl();

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
    // $ANTLR end "rule__Node__Group_1_1__1"


    // $ANTLR start "rule__Node__Group_1_1__1__Impl"
    // InternalXtree.g:302:1: rule__Node__Group_1_1__1__Impl : ( ( rule__Node__RelatedAssignment_1_1_1 )* ) ;
    public final void rule__Node__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtree.g:306:1: ( ( ( rule__Node__RelatedAssignment_1_1_1 )* ) )
            // InternalXtree.g:307:1: ( ( rule__Node__RelatedAssignment_1_1_1 )* )
            {
            // InternalXtree.g:307:1: ( ( rule__Node__RelatedAssignment_1_1_1 )* )
            // InternalXtree.g:308:2: ( rule__Node__RelatedAssignment_1_1_1 )*
            {
             before(grammarAccess.getNodeAccess().getRelatedAssignment_1_1_1()); 
            // InternalXtree.g:309:2: ( rule__Node__RelatedAssignment_1_1_1 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalXtree.g:309:3: rule__Node__RelatedAssignment_1_1_1
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Node__RelatedAssignment_1_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getNodeAccess().getRelatedAssignment_1_1_1()); 

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
    // $ANTLR end "rule__Node__Group_1_1__1__Impl"


    // $ANTLR start "rule__Node__Group_1_2__0"
    // InternalXtree.g:318:1: rule__Node__Group_1_2__0 : rule__Node__Group_1_2__0__Impl rule__Node__Group_1_2__1 ;
    public final void rule__Node__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtree.g:322:1: ( rule__Node__Group_1_2__0__Impl rule__Node__Group_1_2__1 )
            // InternalXtree.g:323:2: rule__Node__Group_1_2__0__Impl rule__Node__Group_1_2__1
            {
            pushFollow(FOLLOW_5);
            rule__Node__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group_1_2__1();

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
    // $ANTLR end "rule__Node__Group_1_2__0"


    // $ANTLR start "rule__Node__Group_1_2__0__Impl"
    // InternalXtree.g:330:1: rule__Node__Group_1_2__0__Impl : ( 'children' ) ;
    public final void rule__Node__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtree.g:334:1: ( ( 'children' ) )
            // InternalXtree.g:335:1: ( 'children' )
            {
            // InternalXtree.g:335:1: ( 'children' )
            // InternalXtree.g:336:2: 'children'
            {
             before(grammarAccess.getNodeAccess().getChildrenKeyword_1_2_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getNodeAccess().getChildrenKeyword_1_2_0()); 

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
    // $ANTLR end "rule__Node__Group_1_2__0__Impl"


    // $ANTLR start "rule__Node__Group_1_2__1"
    // InternalXtree.g:345:1: rule__Node__Group_1_2__1 : rule__Node__Group_1_2__1__Impl ;
    public final void rule__Node__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtree.g:349:1: ( rule__Node__Group_1_2__1__Impl )
            // InternalXtree.g:350:2: rule__Node__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Node__Group_1_2__1__Impl();

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
    // $ANTLR end "rule__Node__Group_1_2__1"


    // $ANTLR start "rule__Node__Group_1_2__1__Impl"
    // InternalXtree.g:356:1: rule__Node__Group_1_2__1__Impl : ( ( rule__Node__ChildrenAssignment_1_2_1 )* ) ;
    public final void rule__Node__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtree.g:360:1: ( ( ( rule__Node__ChildrenAssignment_1_2_1 )* ) )
            // InternalXtree.g:361:1: ( ( rule__Node__ChildrenAssignment_1_2_1 )* )
            {
            // InternalXtree.g:361:1: ( ( rule__Node__ChildrenAssignment_1_2_1 )* )
            // InternalXtree.g:362:2: ( rule__Node__ChildrenAssignment_1_2_1 )*
            {
             before(grammarAccess.getNodeAccess().getChildrenAssignment_1_2_1()); 
            // InternalXtree.g:363:2: ( rule__Node__ChildrenAssignment_1_2_1 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalXtree.g:363:3: rule__Node__ChildrenAssignment_1_2_1
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Node__ChildrenAssignment_1_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getNodeAccess().getChildrenAssignment_1_2_1()); 

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
    // $ANTLR end "rule__Node__Group_1_2__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalXtree.g:372:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtree.g:376:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalXtree.g:377:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1();

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
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // InternalXtree.g:384:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtree.g:388:1: ( ( RULE_ID ) )
            // InternalXtree.g:389:1: ( RULE_ID )
            {
            // InternalXtree.g:389:1: ( RULE_ID )
            // InternalXtree.g:390:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // InternalXtree.g:399:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtree.g:403:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalXtree.g:404:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

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
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // InternalXtree.g:410:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtree.g:414:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalXtree.g:415:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalXtree.g:415:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalXtree.g:416:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalXtree.g:417:2: ( rule__QualifiedName__Group_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==15) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalXtree.g:417:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

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
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // InternalXtree.g:426:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtree.g:430:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalXtree.g:431:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1();

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
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // InternalXtree.g:438:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtree.g:442:1: ( ( '.' ) )
            // InternalXtree.g:443:1: ( '.' )
            {
            // InternalXtree.g:443:1: ( '.' )
            // InternalXtree.g:444:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

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
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // InternalXtree.g:453:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtree.g:457:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalXtree.g:458:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1__Impl();

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
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // InternalXtree.g:464:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtree.g:468:1: ( ( RULE_ID ) )
            // InternalXtree.g:469:1: ( RULE_ID )
            {
            // InternalXtree.g:469:1: ( RULE_ID )
            // InternalXtree.g:470:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__Node__NameAssignment_0"
    // InternalXtree.g:480:1: rule__Node__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Node__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtree.g:484:1: ( ( RULE_ID ) )
            // InternalXtree.g:485:2: ( RULE_ID )
            {
            // InternalXtree.g:485:2: ( RULE_ID )
            // InternalXtree.g:486:3: RULE_ID
            {
             before(grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Node__NameAssignment_0"


    // $ANTLR start "rule__Node__RelatedAssignment_1_1_1"
    // InternalXtree.g:495:1: rule__Node__RelatedAssignment_1_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Node__RelatedAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtree.g:499:1: ( ( ( ruleQualifiedName ) ) )
            // InternalXtree.g:500:2: ( ( ruleQualifiedName ) )
            {
            // InternalXtree.g:500:2: ( ( ruleQualifiedName ) )
            // InternalXtree.g:501:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getNodeAccess().getRelatedNodeCrossReference_1_1_1_0()); 
            // InternalXtree.g:502:3: ( ruleQualifiedName )
            // InternalXtree.g:503:4: ruleQualifiedName
            {
             before(grammarAccess.getNodeAccess().getRelatedNodeQualifiedNameParserRuleCall_1_1_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getNodeAccess().getRelatedNodeQualifiedNameParserRuleCall_1_1_1_0_1()); 

            }

             after(grammarAccess.getNodeAccess().getRelatedNodeCrossReference_1_1_1_0()); 

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
    // $ANTLR end "rule__Node__RelatedAssignment_1_1_1"


    // $ANTLR start "rule__Node__ChildrenAssignment_1_2_1"
    // InternalXtree.g:514:1: rule__Node__ChildrenAssignment_1_2_1 : ( ruleNode ) ;
    public final void rule__Node__ChildrenAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtree.g:518:1: ( ( ruleNode ) )
            // InternalXtree.g:519:2: ( ruleNode )
            {
            // InternalXtree.g:519:2: ( ruleNode )
            // InternalXtree.g:520:3: ruleNode
            {
             before(grammarAccess.getNodeAccess().getChildrenNodeParserRuleCall_1_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNode();

            state._fsp--;

             after(grammarAccess.getNodeAccess().getChildrenNodeParserRuleCall_1_2_1_0()); 

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
    // $ANTLR end "rule__Node__ChildrenAssignment_1_2_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000007000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008002L});

}