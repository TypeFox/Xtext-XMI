package io.typefox.xtextxmi.xtree.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import io.typefox.xtextxmi.xtree.services.XtreeGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXtreeParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'('", "'related'", "'children'", "')'", "'.'"
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

        public InternalXtreeParser(TokenStream input, XtreeGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Node";
       	}

       	@Override
       	protected XtreeGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleNode"
    // InternalXtree.g:64:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // InternalXtree.g:64:45: (iv_ruleNode= ruleNode EOF )
            // InternalXtree.g:65:2: iv_ruleNode= ruleNode EOF
            {
             newCompositeNode(grammarAccess.getNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNode=ruleNode();

            state._fsp--;

             current =iv_ruleNode; 
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
    // $ANTLR end "entryRuleNode"


    // $ANTLR start "ruleNode"
    // InternalXtree.g:71:1: ruleNode returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' (otherlv_2= 'related' ( ( ruleQualifiedName ) )* )? (otherlv_4= 'children' ( (lv_children_5_0= ruleNode ) )* )? otherlv_6= ')' )? ) ;
    public final EObject ruleNode() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_children_5_0 = null;



        	enterRule();

        try {
            // InternalXtree.g:77:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' (otherlv_2= 'related' ( ( ruleQualifiedName ) )* )? (otherlv_4= 'children' ( (lv_children_5_0= ruleNode ) )* )? otherlv_6= ')' )? ) )
            // InternalXtree.g:78:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' (otherlv_2= 'related' ( ( ruleQualifiedName ) )* )? (otherlv_4= 'children' ( (lv_children_5_0= ruleNode ) )* )? otherlv_6= ')' )? )
            {
            // InternalXtree.g:78:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' (otherlv_2= 'related' ( ( ruleQualifiedName ) )* )? (otherlv_4= 'children' ( (lv_children_5_0= ruleNode ) )* )? otherlv_6= ')' )? )
            // InternalXtree.g:79:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' (otherlv_2= 'related' ( ( ruleQualifiedName ) )* )? (otherlv_4= 'children' ( (lv_children_5_0= ruleNode ) )* )? otherlv_6= ')' )?
            {
            // InternalXtree.g:79:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalXtree.g:80:4: (lv_name_0_0= RULE_ID )
            {
            // InternalXtree.g:80:4: (lv_name_0_0= RULE_ID )
            // InternalXtree.g:81:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_0_0, grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNodeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalXtree.g:97:3: (otherlv_1= '(' (otherlv_2= 'related' ( ( ruleQualifiedName ) )* )? (otherlv_4= 'children' ( (lv_children_5_0= ruleNode ) )* )? otherlv_6= ')' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==11) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalXtree.g:98:4: otherlv_1= '(' (otherlv_2= 'related' ( ( ruleQualifiedName ) )* )? (otherlv_4= 'children' ( (lv_children_5_0= ruleNode ) )* )? otherlv_6= ')'
                    {
                    otherlv_1=(Token)match(input,11,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getNodeAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalXtree.g:102:4: (otherlv_2= 'related' ( ( ruleQualifiedName ) )* )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==12) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // InternalXtree.g:103:5: otherlv_2= 'related' ( ( ruleQualifiedName ) )*
                            {
                            otherlv_2=(Token)match(input,12,FOLLOW_5); 

                            					newLeafNode(otherlv_2, grammarAccess.getNodeAccess().getRelatedKeyword_1_1_0());
                            				
                            // InternalXtree.g:107:5: ( ( ruleQualifiedName ) )*
                            loop1:
                            do {
                                int alt1=2;
                                int LA1_0 = input.LA(1);

                                if ( (LA1_0==RULE_ID) ) {
                                    alt1=1;
                                }


                                switch (alt1) {
                            	case 1 :
                            	    // InternalXtree.g:108:6: ( ruleQualifiedName )
                            	    {
                            	    // InternalXtree.g:108:6: ( ruleQualifiedName )
                            	    // InternalXtree.g:109:7: ruleQualifiedName
                            	    {

                            	    							if (current==null) {
                            	    								current = createModelElement(grammarAccess.getNodeRule());
                            	    							}
                            	    						

                            	    							newCompositeNode(grammarAccess.getNodeAccess().getRelatedNodeCrossReference_1_1_1_0());
                            	    						
                            	    pushFollow(FOLLOW_5);
                            	    ruleQualifiedName();

                            	    state._fsp--;


                            	    							afterParserOrEnumRuleCall();
                            	    						

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop1;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // InternalXtree.g:124:4: (otherlv_4= 'children' ( (lv_children_5_0= ruleNode ) )* )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==13) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalXtree.g:125:5: otherlv_4= 'children' ( (lv_children_5_0= ruleNode ) )*
                            {
                            otherlv_4=(Token)match(input,13,FOLLOW_6); 

                            					newLeafNode(otherlv_4, grammarAccess.getNodeAccess().getChildrenKeyword_1_2_0());
                            				
                            // InternalXtree.g:129:5: ( (lv_children_5_0= ruleNode ) )*
                            loop3:
                            do {
                                int alt3=2;
                                int LA3_0 = input.LA(1);

                                if ( (LA3_0==RULE_ID) ) {
                                    alt3=1;
                                }


                                switch (alt3) {
                            	case 1 :
                            	    // InternalXtree.g:130:6: (lv_children_5_0= ruleNode )
                            	    {
                            	    // InternalXtree.g:130:6: (lv_children_5_0= ruleNode )
                            	    // InternalXtree.g:131:7: lv_children_5_0= ruleNode
                            	    {

                            	    							newCompositeNode(grammarAccess.getNodeAccess().getChildrenNodeParserRuleCall_1_2_1_0());
                            	    						
                            	    pushFollow(FOLLOW_6);
                            	    lv_children_5_0=ruleNode();

                            	    state._fsp--;


                            	    							if (current==null) {
                            	    								current = createModelElementForParent(grammarAccess.getNodeRule());
                            	    							}
                            	    							add(
                            	    								current,
                            	    								"children",
                            	    								lv_children_5_0,
                            	    								"io.typefox.xtextxmi.xtree.Xtree.Node");
                            	    							afterParserOrEnumRuleCall();
                            	    						

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop3;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getNodeAccess().getRightParenthesisKeyword_1_3());
                    			

                    }
                    break;

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
    // $ANTLR end "ruleNode"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalXtree.g:158:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalXtree.g:158:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalXtree.g:159:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalXtree.g:165:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalXtree.g:171:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalXtree.g:172:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalXtree.g:172:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalXtree.g:173:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalXtree.g:180:3: (kw= '.' this_ID_2= RULE_ID )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==15) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalXtree.g:181:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,15,FOLLOW_8); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_7); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


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
    // $ANTLR end "ruleQualifiedName"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000007000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});

}