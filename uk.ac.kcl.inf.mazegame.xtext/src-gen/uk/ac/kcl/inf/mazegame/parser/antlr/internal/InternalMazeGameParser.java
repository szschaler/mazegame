package uk.ac.kcl.inf.mazegame.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import uk.ac.kcl.inf.mazegame.services.MazeGameGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMazeGameParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'maze'", "'{'", "'}'", "'room'", "':'", "'north'", "'east'", "'south'", "'west'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalMazeGameParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMazeGameParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMazeGameParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMazeGame.g"; }



     	private MazeGameGrammarAccess grammarAccess;

        public InternalMazeGameParser(TokenStream input, MazeGameGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "MazeGame";
       	}

       	@Override
       	protected MazeGameGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleMazeGame"
    // InternalMazeGame.g:65:1: entryRuleMazeGame returns [EObject current=null] : iv_ruleMazeGame= ruleMazeGame EOF ;
    public final EObject entryRuleMazeGame() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMazeGame = null;


        try {
            // InternalMazeGame.g:65:49: (iv_ruleMazeGame= ruleMazeGame EOF )
            // InternalMazeGame.g:66:2: iv_ruleMazeGame= ruleMazeGame EOF
            {
             newCompositeNode(grammarAccess.getMazeGameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMazeGame=ruleMazeGame();

            state._fsp--;

             current =iv_ruleMazeGame; 
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
    // $ANTLR end "entryRuleMazeGame"


    // $ANTLR start "ruleMazeGame"
    // InternalMazeGame.g:72:1: ruleMazeGame returns [EObject current=null] : (otherlv_0= 'maze' otherlv_1= '{' ( (lv_rooms_2_0= ruleRoomDefinition ) )+ otherlv_3= '}' ) ;
    public final EObject ruleMazeGame() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_rooms_2_0 = null;



        	enterRule();

        try {
            // InternalMazeGame.g:78:2: ( (otherlv_0= 'maze' otherlv_1= '{' ( (lv_rooms_2_0= ruleRoomDefinition ) )+ otherlv_3= '}' ) )
            // InternalMazeGame.g:79:2: (otherlv_0= 'maze' otherlv_1= '{' ( (lv_rooms_2_0= ruleRoomDefinition ) )+ otherlv_3= '}' )
            {
            // InternalMazeGame.g:79:2: (otherlv_0= 'maze' otherlv_1= '{' ( (lv_rooms_2_0= ruleRoomDefinition ) )+ otherlv_3= '}' )
            // InternalMazeGame.g:80:3: otherlv_0= 'maze' otherlv_1= '{' ( (lv_rooms_2_0= ruleRoomDefinition ) )+ otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMazeGameAccess().getMazeKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getMazeGameAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMazeGame.g:88:3: ( (lv_rooms_2_0= ruleRoomDefinition ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMazeGame.g:89:4: (lv_rooms_2_0= ruleRoomDefinition )
            	    {
            	    // InternalMazeGame.g:89:4: (lv_rooms_2_0= ruleRoomDefinition )
            	    // InternalMazeGame.g:90:5: lv_rooms_2_0= ruleRoomDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getMazeGameAccess().getRoomsRoomDefinitionParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_rooms_2_0=ruleRoomDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMazeGameRule());
            	    					}
            	    					add(
            	    						current,
            	    						"rooms",
            	    						lv_rooms_2_0,
            	    						"uk.ac.kcl.inf.mazegame.MazeGame.RoomDefinition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getMazeGameAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleMazeGame"


    // $ANTLR start "entryRuleRoomDefinition"
    // InternalMazeGame.g:115:1: entryRuleRoomDefinition returns [EObject current=null] : iv_ruleRoomDefinition= ruleRoomDefinition EOF ;
    public final EObject entryRuleRoomDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoomDefinition = null;


        try {
            // InternalMazeGame.g:115:55: (iv_ruleRoomDefinition= ruleRoomDefinition EOF )
            // InternalMazeGame.g:116:2: iv_ruleRoomDefinition= ruleRoomDefinition EOF
            {
             newCompositeNode(grammarAccess.getRoomDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRoomDefinition=ruleRoomDefinition();

            state._fsp--;

             current =iv_ruleRoomDefinition; 
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
    // $ANTLR end "entryRuleRoomDefinition"


    // $ANTLR start "ruleRoomDefinition"
    // InternalMazeGame.g:122:1: ruleRoomDefinition returns [EObject current=null] : (otherlv_0= 'room' ( (lv_name_1_0= RULE_ID ) )? ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_doors_4_0= ruleDoorDefinition ) )* otherlv_5= '}' ) ;
    public final EObject ruleRoomDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_doors_4_0 = null;



        	enterRule();

        try {
            // InternalMazeGame.g:128:2: ( (otherlv_0= 'room' ( (lv_name_1_0= RULE_ID ) )? ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_doors_4_0= ruleDoorDefinition ) )* otherlv_5= '}' ) )
            // InternalMazeGame.g:129:2: (otherlv_0= 'room' ( (lv_name_1_0= RULE_ID ) )? ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_doors_4_0= ruleDoorDefinition ) )* otherlv_5= '}' )
            {
            // InternalMazeGame.g:129:2: (otherlv_0= 'room' ( (lv_name_1_0= RULE_ID ) )? ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_doors_4_0= ruleDoorDefinition ) )* otherlv_5= '}' )
            // InternalMazeGame.g:130:3: otherlv_0= 'room' ( (lv_name_1_0= RULE_ID ) )? ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_doors_4_0= ruleDoorDefinition ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getRoomDefinitionAccess().getRoomKeyword_0());
            		
            // InternalMazeGame.g:134:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMazeGame.g:135:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalMazeGame.g:135:4: (lv_name_1_0= RULE_ID )
                    // InternalMazeGame.g:136:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getRoomDefinitionAccess().getNameIDTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRoomDefinitionRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            // InternalMazeGame.g:152:3: ( (lv_description_2_0= RULE_STRING ) )
            // InternalMazeGame.g:153:4: (lv_description_2_0= RULE_STRING )
            {
            // InternalMazeGame.g:153:4: (lv_description_2_0= RULE_STRING )
            // InternalMazeGame.g:154:5: lv_description_2_0= RULE_STRING
            {
            lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_3); 

            					newLeafNode(lv_description_2_0, grammarAccess.getRoomDefinitionAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRoomDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"description",
            						lv_description_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getRoomDefinitionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMazeGame.g:174:3: ( (lv_doors_4_0= ruleDoorDefinition ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=16 && LA3_0<=19)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMazeGame.g:175:4: (lv_doors_4_0= ruleDoorDefinition )
            	    {
            	    // InternalMazeGame.g:175:4: (lv_doors_4_0= ruleDoorDefinition )
            	    // InternalMazeGame.g:176:5: lv_doors_4_0= ruleDoorDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getRoomDefinitionAccess().getDoorsDoorDefinitionParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_doors_4_0=ruleDoorDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRoomDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"doors",
            	    						lv_doors_4_0,
            	    						"uk.ac.kcl.inf.mazegame.MazeGame.DoorDefinition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getRoomDefinitionAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleRoomDefinition"


    // $ANTLR start "entryRuleDoorDefinition"
    // InternalMazeGame.g:201:1: entryRuleDoorDefinition returns [EObject current=null] : iv_ruleDoorDefinition= ruleDoorDefinition EOF ;
    public final EObject entryRuleDoorDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoorDefinition = null;


        try {
            // InternalMazeGame.g:201:55: (iv_ruleDoorDefinition= ruleDoorDefinition EOF )
            // InternalMazeGame.g:202:2: iv_ruleDoorDefinition= ruleDoorDefinition EOF
            {
             newCompositeNode(grammarAccess.getDoorDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDoorDefinition=ruleDoorDefinition();

            state._fsp--;

             current =iv_ruleDoorDefinition; 
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
    // $ANTLR end "entryRuleDoorDefinition"


    // $ANTLR start "ruleDoorDefinition"
    // InternalMazeGame.g:208:1: ruleDoorDefinition returns [EObject current=null] : ( ( (lv_direction_0_0= ruleDirection ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleDoorDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Enumerator lv_direction_0_0 = null;



        	enterRule();

        try {
            // InternalMazeGame.g:214:2: ( ( ( (lv_direction_0_0= ruleDirection ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalMazeGame.g:215:2: ( ( (lv_direction_0_0= ruleDirection ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalMazeGame.g:215:2: ( ( (lv_direction_0_0= ruleDirection ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) )
            // InternalMazeGame.g:216:3: ( (lv_direction_0_0= ruleDirection ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) )
            {
            // InternalMazeGame.g:216:3: ( (lv_direction_0_0= ruleDirection ) )
            // InternalMazeGame.g:217:4: (lv_direction_0_0= ruleDirection )
            {
            // InternalMazeGame.g:217:4: (lv_direction_0_0= ruleDirection )
            // InternalMazeGame.g:218:5: lv_direction_0_0= ruleDirection
            {

            					newCompositeNode(grammarAccess.getDoorDefinitionAccess().getDirectionDirectionEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_9);
            lv_direction_0_0=ruleDirection();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDoorDefinitionRule());
            					}
            					set(
            						current,
            						"direction",
            						lv_direction_0_0,
            						"uk.ac.kcl.inf.mazegame.MazeGame.Direction");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getDoorDefinitionAccess().getColonKeyword_1());
            		
            // InternalMazeGame.g:239:3: ( (otherlv_2= RULE_ID ) )
            // InternalMazeGame.g:240:4: (otherlv_2= RULE_ID )
            {
            // InternalMazeGame.g:240:4: (otherlv_2= RULE_ID )
            // InternalMazeGame.g:241:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDoorDefinitionRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getDoorDefinitionAccess().getAdjacentRoomRoomDefinitionCrossReference_2_0());
            				

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
    // $ANTLR end "ruleDoorDefinition"


    // $ANTLR start "ruleDirection"
    // InternalMazeGame.g:256:1: ruleDirection returns [Enumerator current=null] : ( (enumLiteral_0= 'north' ) | (enumLiteral_1= 'east' ) | (enumLiteral_2= 'south' ) | (enumLiteral_3= 'west' ) ) ;
    public final Enumerator ruleDirection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalMazeGame.g:262:2: ( ( (enumLiteral_0= 'north' ) | (enumLiteral_1= 'east' ) | (enumLiteral_2= 'south' ) | (enumLiteral_3= 'west' ) ) )
            // InternalMazeGame.g:263:2: ( (enumLiteral_0= 'north' ) | (enumLiteral_1= 'east' ) | (enumLiteral_2= 'south' ) | (enumLiteral_3= 'west' ) )
            {
            // InternalMazeGame.g:263:2: ( (enumLiteral_0= 'north' ) | (enumLiteral_1= 'east' ) | (enumLiteral_2= 'south' ) | (enumLiteral_3= 'west' ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt4=1;
                }
                break;
            case 17:
                {
                alt4=2;
                }
                break;
            case 18:
                {
                alt4=3;
                }
                break;
            case 19:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMazeGame.g:264:3: (enumLiteral_0= 'north' )
                    {
                    // InternalMazeGame.g:264:3: (enumLiteral_0= 'north' )
                    // InternalMazeGame.g:265:4: enumLiteral_0= 'north'
                    {
                    enumLiteral_0=(Token)match(input,16,FOLLOW_2); 

                    				current = grammarAccess.getDirectionAccess().getNORTHEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDirectionAccess().getNORTHEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMazeGame.g:272:3: (enumLiteral_1= 'east' )
                    {
                    // InternalMazeGame.g:272:3: (enumLiteral_1= 'east' )
                    // InternalMazeGame.g:273:4: enumLiteral_1= 'east'
                    {
                    enumLiteral_1=(Token)match(input,17,FOLLOW_2); 

                    				current = grammarAccess.getDirectionAccess().getEASTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDirectionAccess().getEASTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMazeGame.g:280:3: (enumLiteral_2= 'south' )
                    {
                    // InternalMazeGame.g:280:3: (enumLiteral_2= 'south' )
                    // InternalMazeGame.g:281:4: enumLiteral_2= 'south'
                    {
                    enumLiteral_2=(Token)match(input,18,FOLLOW_2); 

                    				current = grammarAccess.getDirectionAccess().getSOUTHEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDirectionAccess().getSOUTHEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMazeGame.g:288:3: (enumLiteral_3= 'west' )
                    {
                    // InternalMazeGame.g:288:3: (enumLiteral_3= 'west' )
                    // InternalMazeGame.g:289:4: enumLiteral_3= 'west'
                    {
                    enumLiteral_3=(Token)match(input,19,FOLLOW_2); 

                    				current = grammarAccess.getDirectionAccess().getWESTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getDirectionAccess().getWESTEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

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
    // $ANTLR end "ruleDirection"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000F2000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});

}