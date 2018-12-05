package uk.ac.kcl.inf.mazegame.ide.contentassist.antlr.internal;

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
import uk.ac.kcl.inf.mazegame.services.MazeGameGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMazeGameParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'north'", "'east'", "'south'", "'west'", "'maze'", "'{'", "'}'", "'room'", "':'"
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

    	public void setGrammarAccess(MazeGameGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleMazeGame"
    // InternalMazeGame.g:53:1: entryRuleMazeGame : ruleMazeGame EOF ;
    public final void entryRuleMazeGame() throws RecognitionException {
        try {
            // InternalMazeGame.g:54:1: ( ruleMazeGame EOF )
            // InternalMazeGame.g:55:1: ruleMazeGame EOF
            {
             before(grammarAccess.getMazeGameRule()); 
            pushFollow(FOLLOW_1);
            ruleMazeGame();

            state._fsp--;

             after(grammarAccess.getMazeGameRule()); 
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
    // $ANTLR end "entryRuleMazeGame"


    // $ANTLR start "ruleMazeGame"
    // InternalMazeGame.g:62:1: ruleMazeGame : ( ( rule__MazeGame__Group__0 ) ) ;
    public final void ruleMazeGame() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMazeGame.g:66:2: ( ( ( rule__MazeGame__Group__0 ) ) )
            // InternalMazeGame.g:67:2: ( ( rule__MazeGame__Group__0 ) )
            {
            // InternalMazeGame.g:67:2: ( ( rule__MazeGame__Group__0 ) )
            // InternalMazeGame.g:68:3: ( rule__MazeGame__Group__0 )
            {
             before(grammarAccess.getMazeGameAccess().getGroup()); 
            // InternalMazeGame.g:69:3: ( rule__MazeGame__Group__0 )
            // InternalMazeGame.g:69:4: rule__MazeGame__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MazeGame__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMazeGameAccess().getGroup()); 

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
    // $ANTLR end "ruleMazeGame"


    // $ANTLR start "entryRuleRoomDefinition"
    // InternalMazeGame.g:78:1: entryRuleRoomDefinition : ruleRoomDefinition EOF ;
    public final void entryRuleRoomDefinition() throws RecognitionException {
        try {
            // InternalMazeGame.g:79:1: ( ruleRoomDefinition EOF )
            // InternalMazeGame.g:80:1: ruleRoomDefinition EOF
            {
             before(grammarAccess.getRoomDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleRoomDefinition();

            state._fsp--;

             after(grammarAccess.getRoomDefinitionRule()); 
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
    // $ANTLR end "entryRuleRoomDefinition"


    // $ANTLR start "ruleRoomDefinition"
    // InternalMazeGame.g:87:1: ruleRoomDefinition : ( ( rule__RoomDefinition__Group__0 ) ) ;
    public final void ruleRoomDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMazeGame.g:91:2: ( ( ( rule__RoomDefinition__Group__0 ) ) )
            // InternalMazeGame.g:92:2: ( ( rule__RoomDefinition__Group__0 ) )
            {
            // InternalMazeGame.g:92:2: ( ( rule__RoomDefinition__Group__0 ) )
            // InternalMazeGame.g:93:3: ( rule__RoomDefinition__Group__0 )
            {
             before(grammarAccess.getRoomDefinitionAccess().getGroup()); 
            // InternalMazeGame.g:94:3: ( rule__RoomDefinition__Group__0 )
            // InternalMazeGame.g:94:4: rule__RoomDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RoomDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRoomDefinitionAccess().getGroup()); 

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
    // $ANTLR end "ruleRoomDefinition"


    // $ANTLR start "entryRuleDoorDefinition"
    // InternalMazeGame.g:103:1: entryRuleDoorDefinition : ruleDoorDefinition EOF ;
    public final void entryRuleDoorDefinition() throws RecognitionException {
        try {
            // InternalMazeGame.g:104:1: ( ruleDoorDefinition EOF )
            // InternalMazeGame.g:105:1: ruleDoorDefinition EOF
            {
             before(grammarAccess.getDoorDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleDoorDefinition();

            state._fsp--;

             after(grammarAccess.getDoorDefinitionRule()); 
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
    // $ANTLR end "entryRuleDoorDefinition"


    // $ANTLR start "ruleDoorDefinition"
    // InternalMazeGame.g:112:1: ruleDoorDefinition : ( ( rule__DoorDefinition__Group__0 ) ) ;
    public final void ruleDoorDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMazeGame.g:116:2: ( ( ( rule__DoorDefinition__Group__0 ) ) )
            // InternalMazeGame.g:117:2: ( ( rule__DoorDefinition__Group__0 ) )
            {
            // InternalMazeGame.g:117:2: ( ( rule__DoorDefinition__Group__0 ) )
            // InternalMazeGame.g:118:3: ( rule__DoorDefinition__Group__0 )
            {
             before(grammarAccess.getDoorDefinitionAccess().getGroup()); 
            // InternalMazeGame.g:119:3: ( rule__DoorDefinition__Group__0 )
            // InternalMazeGame.g:119:4: rule__DoorDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DoorDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDoorDefinitionAccess().getGroup()); 

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
    // $ANTLR end "ruleDoorDefinition"


    // $ANTLR start "ruleDirection"
    // InternalMazeGame.g:128:1: ruleDirection : ( ( rule__Direction__Alternatives ) ) ;
    public final void ruleDirection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMazeGame.g:132:1: ( ( ( rule__Direction__Alternatives ) ) )
            // InternalMazeGame.g:133:2: ( ( rule__Direction__Alternatives ) )
            {
            // InternalMazeGame.g:133:2: ( ( rule__Direction__Alternatives ) )
            // InternalMazeGame.g:134:3: ( rule__Direction__Alternatives )
            {
             before(grammarAccess.getDirectionAccess().getAlternatives()); 
            // InternalMazeGame.g:135:3: ( rule__Direction__Alternatives )
            // InternalMazeGame.g:135:4: rule__Direction__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Direction__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDirectionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleDirection"


    // $ANTLR start "rule__Direction__Alternatives"
    // InternalMazeGame.g:143:1: rule__Direction__Alternatives : ( ( ( 'north' ) ) | ( ( 'east' ) ) | ( ( 'south' ) ) | ( ( 'west' ) ) );
    public final void rule__Direction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMazeGame.g:147:1: ( ( ( 'north' ) ) | ( ( 'east' ) ) | ( ( 'south' ) ) | ( ( 'west' ) ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt1=1;
                }
                break;
            case 12:
                {
                alt1=2;
                }
                break;
            case 13:
                {
                alt1=3;
                }
                break;
            case 14:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalMazeGame.g:148:2: ( ( 'north' ) )
                    {
                    // InternalMazeGame.g:148:2: ( ( 'north' ) )
                    // InternalMazeGame.g:149:3: ( 'north' )
                    {
                     before(grammarAccess.getDirectionAccess().getNORTHEnumLiteralDeclaration_0()); 
                    // InternalMazeGame.g:150:3: ( 'north' )
                    // InternalMazeGame.g:150:4: 'north'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectionAccess().getNORTHEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMazeGame.g:154:2: ( ( 'east' ) )
                    {
                    // InternalMazeGame.g:154:2: ( ( 'east' ) )
                    // InternalMazeGame.g:155:3: ( 'east' )
                    {
                     before(grammarAccess.getDirectionAccess().getEASTEnumLiteralDeclaration_1()); 
                    // InternalMazeGame.g:156:3: ( 'east' )
                    // InternalMazeGame.g:156:4: 'east'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectionAccess().getEASTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMazeGame.g:160:2: ( ( 'south' ) )
                    {
                    // InternalMazeGame.g:160:2: ( ( 'south' ) )
                    // InternalMazeGame.g:161:3: ( 'south' )
                    {
                     before(grammarAccess.getDirectionAccess().getSOUTHEnumLiteralDeclaration_2()); 
                    // InternalMazeGame.g:162:3: ( 'south' )
                    // InternalMazeGame.g:162:4: 'south'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectionAccess().getSOUTHEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMazeGame.g:166:2: ( ( 'west' ) )
                    {
                    // InternalMazeGame.g:166:2: ( ( 'west' ) )
                    // InternalMazeGame.g:167:3: ( 'west' )
                    {
                     before(grammarAccess.getDirectionAccess().getWESTEnumLiteralDeclaration_3()); 
                    // InternalMazeGame.g:168:3: ( 'west' )
                    // InternalMazeGame.g:168:4: 'west'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectionAccess().getWESTEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__Direction__Alternatives"


    // $ANTLR start "rule__MazeGame__Group__0"
    // InternalMazeGame.g:176:1: rule__MazeGame__Group__0 : rule__MazeGame__Group__0__Impl rule__MazeGame__Group__1 ;
    public final void rule__MazeGame__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMazeGame.g:180:1: ( rule__MazeGame__Group__0__Impl rule__MazeGame__Group__1 )
            // InternalMazeGame.g:181:2: rule__MazeGame__Group__0__Impl rule__MazeGame__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__MazeGame__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MazeGame__Group__1();

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
    // $ANTLR end "rule__MazeGame__Group__0"


    // $ANTLR start "rule__MazeGame__Group__0__Impl"
    // InternalMazeGame.g:188:1: rule__MazeGame__Group__0__Impl : ( 'maze' ) ;
    public final void rule__MazeGame__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMazeGame.g:192:1: ( ( 'maze' ) )
            // InternalMazeGame.g:193:1: ( 'maze' )
            {
            // InternalMazeGame.g:193:1: ( 'maze' )
            // InternalMazeGame.g:194:2: 'maze'
            {
             before(grammarAccess.getMazeGameAccess().getMazeKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getMazeGameAccess().getMazeKeyword_0()); 

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
    // $ANTLR end "rule__MazeGame__Group__0__Impl"


    // $ANTLR start "rule__MazeGame__Group__1"
    // InternalMazeGame.g:203:1: rule__MazeGame__Group__1 : rule__MazeGame__Group__1__Impl rule__MazeGame__Group__2 ;
    public final void rule__MazeGame__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMazeGame.g:207:1: ( rule__MazeGame__Group__1__Impl rule__MazeGame__Group__2 )
            // InternalMazeGame.g:208:2: rule__MazeGame__Group__1__Impl rule__MazeGame__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__MazeGame__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MazeGame__Group__2();

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
    // $ANTLR end "rule__MazeGame__Group__1"


    // $ANTLR start "rule__MazeGame__Group__1__Impl"
    // InternalMazeGame.g:215:1: rule__MazeGame__Group__1__Impl : ( '{' ) ;
    public final void rule__MazeGame__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMazeGame.g:219:1: ( ( '{' ) )
            // InternalMazeGame.g:220:1: ( '{' )
            {
            // InternalMazeGame.g:220:1: ( '{' )
            // InternalMazeGame.g:221:2: '{'
            {
             before(grammarAccess.getMazeGameAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getMazeGameAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__MazeGame__Group__1__Impl"


    // $ANTLR start "rule__MazeGame__Group__2"
    // InternalMazeGame.g:230:1: rule__MazeGame__Group__2 : rule__MazeGame__Group__2__Impl rule__MazeGame__Group__3 ;
    public final void rule__MazeGame__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMazeGame.g:234:1: ( rule__MazeGame__Group__2__Impl rule__MazeGame__Group__3 )
            // InternalMazeGame.g:235:2: rule__MazeGame__Group__2__Impl rule__MazeGame__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__MazeGame__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MazeGame__Group__3();

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
    // $ANTLR end "rule__MazeGame__Group__2"


    // $ANTLR start "rule__MazeGame__Group__2__Impl"
    // InternalMazeGame.g:242:1: rule__MazeGame__Group__2__Impl : ( ( ( rule__MazeGame__RoomsAssignment_2 ) ) ( ( rule__MazeGame__RoomsAssignment_2 )* ) ) ;
    public final void rule__MazeGame__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMazeGame.g:246:1: ( ( ( ( rule__MazeGame__RoomsAssignment_2 ) ) ( ( rule__MazeGame__RoomsAssignment_2 )* ) ) )
            // InternalMazeGame.g:247:1: ( ( ( rule__MazeGame__RoomsAssignment_2 ) ) ( ( rule__MazeGame__RoomsAssignment_2 )* ) )
            {
            // InternalMazeGame.g:247:1: ( ( ( rule__MazeGame__RoomsAssignment_2 ) ) ( ( rule__MazeGame__RoomsAssignment_2 )* ) )
            // InternalMazeGame.g:248:2: ( ( rule__MazeGame__RoomsAssignment_2 ) ) ( ( rule__MazeGame__RoomsAssignment_2 )* )
            {
            // InternalMazeGame.g:248:2: ( ( rule__MazeGame__RoomsAssignment_2 ) )
            // InternalMazeGame.g:249:3: ( rule__MazeGame__RoomsAssignment_2 )
            {
             before(grammarAccess.getMazeGameAccess().getRoomsAssignment_2()); 
            // InternalMazeGame.g:250:3: ( rule__MazeGame__RoomsAssignment_2 )
            // InternalMazeGame.g:250:4: rule__MazeGame__RoomsAssignment_2
            {
            pushFollow(FOLLOW_6);
            rule__MazeGame__RoomsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMazeGameAccess().getRoomsAssignment_2()); 

            }

            // InternalMazeGame.g:253:2: ( ( rule__MazeGame__RoomsAssignment_2 )* )
            // InternalMazeGame.g:254:3: ( rule__MazeGame__RoomsAssignment_2 )*
            {
             before(grammarAccess.getMazeGameAccess().getRoomsAssignment_2()); 
            // InternalMazeGame.g:255:3: ( rule__MazeGame__RoomsAssignment_2 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==18) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMazeGame.g:255:4: rule__MazeGame__RoomsAssignment_2
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__MazeGame__RoomsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getMazeGameAccess().getRoomsAssignment_2()); 

            }


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
    // $ANTLR end "rule__MazeGame__Group__2__Impl"


    // $ANTLR start "rule__MazeGame__Group__3"
    // InternalMazeGame.g:264:1: rule__MazeGame__Group__3 : rule__MazeGame__Group__3__Impl ;
    public final void rule__MazeGame__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMazeGame.g:268:1: ( rule__MazeGame__Group__3__Impl )
            // InternalMazeGame.g:269:2: rule__MazeGame__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MazeGame__Group__3__Impl();

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
    // $ANTLR end "rule__MazeGame__Group__3"


    // $ANTLR start "rule__MazeGame__Group__3__Impl"
    // InternalMazeGame.g:275:1: rule__MazeGame__Group__3__Impl : ( '}' ) ;
    public final void rule__MazeGame__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMazeGame.g:279:1: ( ( '}' ) )
            // InternalMazeGame.g:280:1: ( '}' )
            {
            // InternalMazeGame.g:280:1: ( '}' )
            // InternalMazeGame.g:281:2: '}'
            {
             before(grammarAccess.getMazeGameAccess().getRightCurlyBracketKeyword_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getMazeGameAccess().getRightCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__MazeGame__Group__3__Impl"


    // $ANTLR start "rule__RoomDefinition__Group__0"
    // InternalMazeGame.g:291:1: rule__RoomDefinition__Group__0 : rule__RoomDefinition__Group__0__Impl rule__RoomDefinition__Group__1 ;
    public final void rule__RoomDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMazeGame.g:295:1: ( rule__RoomDefinition__Group__0__Impl rule__RoomDefinition__Group__1 )
            // InternalMazeGame.g:296:2: rule__RoomDefinition__Group__0__Impl rule__RoomDefinition__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__RoomDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoomDefinition__Group__1();

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
    // $ANTLR end "rule__RoomDefinition__Group__0"


    // $ANTLR start "rule__RoomDefinition__Group__0__Impl"
    // InternalMazeGame.g:303:1: rule__RoomDefinition__Group__0__Impl : ( 'room' ) ;
    public final void rule__RoomDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMazeGame.g:307:1: ( ( 'room' ) )
            // InternalMazeGame.g:308:1: ( 'room' )
            {
            // InternalMazeGame.g:308:1: ( 'room' )
            // InternalMazeGame.g:309:2: 'room'
            {
             before(grammarAccess.getRoomDefinitionAccess().getRoomKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getRoomDefinitionAccess().getRoomKeyword_0()); 

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
    // $ANTLR end "rule__RoomDefinition__Group__0__Impl"


    // $ANTLR start "rule__RoomDefinition__Group__1"
    // InternalMazeGame.g:318:1: rule__RoomDefinition__Group__1 : rule__RoomDefinition__Group__1__Impl rule__RoomDefinition__Group__2 ;
    public final void rule__RoomDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMazeGame.g:322:1: ( rule__RoomDefinition__Group__1__Impl rule__RoomDefinition__Group__2 )
            // InternalMazeGame.g:323:2: rule__RoomDefinition__Group__1__Impl rule__RoomDefinition__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__RoomDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoomDefinition__Group__2();

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
    // $ANTLR end "rule__RoomDefinition__Group__1"


    // $ANTLR start "rule__RoomDefinition__Group__1__Impl"
    // InternalMazeGame.g:330:1: rule__RoomDefinition__Group__1__Impl : ( ( rule__RoomDefinition__NameAssignment_1 )? ) ;
    public final void rule__RoomDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMazeGame.g:334:1: ( ( ( rule__RoomDefinition__NameAssignment_1 )? ) )
            // InternalMazeGame.g:335:1: ( ( rule__RoomDefinition__NameAssignment_1 )? )
            {
            // InternalMazeGame.g:335:1: ( ( rule__RoomDefinition__NameAssignment_1 )? )
            // InternalMazeGame.g:336:2: ( rule__RoomDefinition__NameAssignment_1 )?
            {
             before(grammarAccess.getRoomDefinitionAccess().getNameAssignment_1()); 
            // InternalMazeGame.g:337:2: ( rule__RoomDefinition__NameAssignment_1 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMazeGame.g:337:3: rule__RoomDefinition__NameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__RoomDefinition__NameAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRoomDefinitionAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__RoomDefinition__Group__1__Impl"


    // $ANTLR start "rule__RoomDefinition__Group__2"
    // InternalMazeGame.g:345:1: rule__RoomDefinition__Group__2 : rule__RoomDefinition__Group__2__Impl rule__RoomDefinition__Group__3 ;
    public final void rule__RoomDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMazeGame.g:349:1: ( rule__RoomDefinition__Group__2__Impl rule__RoomDefinition__Group__3 )
            // InternalMazeGame.g:350:2: rule__RoomDefinition__Group__2__Impl rule__RoomDefinition__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__RoomDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoomDefinition__Group__3();

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
    // $ANTLR end "rule__RoomDefinition__Group__2"


    // $ANTLR start "rule__RoomDefinition__Group__2__Impl"
    // InternalMazeGame.g:357:1: rule__RoomDefinition__Group__2__Impl : ( ( rule__RoomDefinition__DescriptionAssignment_2 ) ) ;
    public final void rule__RoomDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMazeGame.g:361:1: ( ( ( rule__RoomDefinition__DescriptionAssignment_2 ) ) )
            // InternalMazeGame.g:362:1: ( ( rule__RoomDefinition__DescriptionAssignment_2 ) )
            {
            // InternalMazeGame.g:362:1: ( ( rule__RoomDefinition__DescriptionAssignment_2 ) )
            // InternalMazeGame.g:363:2: ( rule__RoomDefinition__DescriptionAssignment_2 )
            {
             before(grammarAccess.getRoomDefinitionAccess().getDescriptionAssignment_2()); 
            // InternalMazeGame.g:364:2: ( rule__RoomDefinition__DescriptionAssignment_2 )
            // InternalMazeGame.g:364:3: rule__RoomDefinition__DescriptionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RoomDefinition__DescriptionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRoomDefinitionAccess().getDescriptionAssignment_2()); 

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
    // $ANTLR end "rule__RoomDefinition__Group__2__Impl"


    // $ANTLR start "rule__RoomDefinition__Group__3"
    // InternalMazeGame.g:372:1: rule__RoomDefinition__Group__3 : rule__RoomDefinition__Group__3__Impl rule__RoomDefinition__Group__4 ;
    public final void rule__RoomDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMazeGame.g:376:1: ( rule__RoomDefinition__Group__3__Impl rule__RoomDefinition__Group__4 )
            // InternalMazeGame.g:377:2: rule__RoomDefinition__Group__3__Impl rule__RoomDefinition__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__RoomDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoomDefinition__Group__4();

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
    // $ANTLR end "rule__RoomDefinition__Group__3"


    // $ANTLR start "rule__RoomDefinition__Group__3__Impl"
    // InternalMazeGame.g:384:1: rule__RoomDefinition__Group__3__Impl : ( '{' ) ;
    public final void rule__RoomDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMazeGame.g:388:1: ( ( '{' ) )
            // InternalMazeGame.g:389:1: ( '{' )
            {
            // InternalMazeGame.g:389:1: ( '{' )
            // InternalMazeGame.g:390:2: '{'
            {
             before(grammarAccess.getRoomDefinitionAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getRoomDefinitionAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__RoomDefinition__Group__3__Impl"


    // $ANTLR start "rule__RoomDefinition__Group__4"
    // InternalMazeGame.g:399:1: rule__RoomDefinition__Group__4 : rule__RoomDefinition__Group__4__Impl rule__RoomDefinition__Group__5 ;
    public final void rule__RoomDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMazeGame.g:403:1: ( rule__RoomDefinition__Group__4__Impl rule__RoomDefinition__Group__5 )
            // InternalMazeGame.g:404:2: rule__RoomDefinition__Group__4__Impl rule__RoomDefinition__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__RoomDefinition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoomDefinition__Group__5();

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
    // $ANTLR end "rule__RoomDefinition__Group__4"


    // $ANTLR start "rule__RoomDefinition__Group__4__Impl"
    // InternalMazeGame.g:411:1: rule__RoomDefinition__Group__4__Impl : ( ( rule__RoomDefinition__DoorsAssignment_4 )* ) ;
    public final void rule__RoomDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMazeGame.g:415:1: ( ( ( rule__RoomDefinition__DoorsAssignment_4 )* ) )
            // InternalMazeGame.g:416:1: ( ( rule__RoomDefinition__DoorsAssignment_4 )* )
            {
            // InternalMazeGame.g:416:1: ( ( rule__RoomDefinition__DoorsAssignment_4 )* )
            // InternalMazeGame.g:417:2: ( rule__RoomDefinition__DoorsAssignment_4 )*
            {
             before(grammarAccess.getRoomDefinitionAccess().getDoorsAssignment_4()); 
            // InternalMazeGame.g:418:2: ( rule__RoomDefinition__DoorsAssignment_4 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=11 && LA4_0<=14)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMazeGame.g:418:3: rule__RoomDefinition__DoorsAssignment_4
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__RoomDefinition__DoorsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getRoomDefinitionAccess().getDoorsAssignment_4()); 

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
    // $ANTLR end "rule__RoomDefinition__Group__4__Impl"


    // $ANTLR start "rule__RoomDefinition__Group__5"
    // InternalMazeGame.g:426:1: rule__RoomDefinition__Group__5 : rule__RoomDefinition__Group__5__Impl ;
    public final void rule__RoomDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMazeGame.g:430:1: ( rule__RoomDefinition__Group__5__Impl )
            // InternalMazeGame.g:431:2: rule__RoomDefinition__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RoomDefinition__Group__5__Impl();

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
    // $ANTLR end "rule__RoomDefinition__Group__5"


    // $ANTLR start "rule__RoomDefinition__Group__5__Impl"
    // InternalMazeGame.g:437:1: rule__RoomDefinition__Group__5__Impl : ( '}' ) ;
    public final void rule__RoomDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMazeGame.g:441:1: ( ( '}' ) )
            // InternalMazeGame.g:442:1: ( '}' )
            {
            // InternalMazeGame.g:442:1: ( '}' )
            // InternalMazeGame.g:443:2: '}'
            {
             before(grammarAccess.getRoomDefinitionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getRoomDefinitionAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__RoomDefinition__Group__5__Impl"


    // $ANTLR start "rule__DoorDefinition__Group__0"
    // InternalMazeGame.g:453:1: rule__DoorDefinition__Group__0 : rule__DoorDefinition__Group__0__Impl rule__DoorDefinition__Group__1 ;
    public final void rule__DoorDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMazeGame.g:457:1: ( rule__DoorDefinition__Group__0__Impl rule__DoorDefinition__Group__1 )
            // InternalMazeGame.g:458:2: rule__DoorDefinition__Group__0__Impl rule__DoorDefinition__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__DoorDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoorDefinition__Group__1();

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
    // $ANTLR end "rule__DoorDefinition__Group__0"


    // $ANTLR start "rule__DoorDefinition__Group__0__Impl"
    // InternalMazeGame.g:465:1: rule__DoorDefinition__Group__0__Impl : ( ( rule__DoorDefinition__DirectionAssignment_0 ) ) ;
    public final void rule__DoorDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMazeGame.g:469:1: ( ( ( rule__DoorDefinition__DirectionAssignment_0 ) ) )
            // InternalMazeGame.g:470:1: ( ( rule__DoorDefinition__DirectionAssignment_0 ) )
            {
            // InternalMazeGame.g:470:1: ( ( rule__DoorDefinition__DirectionAssignment_0 ) )
            // InternalMazeGame.g:471:2: ( rule__DoorDefinition__DirectionAssignment_0 )
            {
             before(grammarAccess.getDoorDefinitionAccess().getDirectionAssignment_0()); 
            // InternalMazeGame.g:472:2: ( rule__DoorDefinition__DirectionAssignment_0 )
            // InternalMazeGame.g:472:3: rule__DoorDefinition__DirectionAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__DoorDefinition__DirectionAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDoorDefinitionAccess().getDirectionAssignment_0()); 

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
    // $ANTLR end "rule__DoorDefinition__Group__0__Impl"


    // $ANTLR start "rule__DoorDefinition__Group__1"
    // InternalMazeGame.g:480:1: rule__DoorDefinition__Group__1 : rule__DoorDefinition__Group__1__Impl rule__DoorDefinition__Group__2 ;
    public final void rule__DoorDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMazeGame.g:484:1: ( rule__DoorDefinition__Group__1__Impl rule__DoorDefinition__Group__2 )
            // InternalMazeGame.g:485:2: rule__DoorDefinition__Group__1__Impl rule__DoorDefinition__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__DoorDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoorDefinition__Group__2();

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
    // $ANTLR end "rule__DoorDefinition__Group__1"


    // $ANTLR start "rule__DoorDefinition__Group__1__Impl"
    // InternalMazeGame.g:492:1: rule__DoorDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__DoorDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMazeGame.g:496:1: ( ( ':' ) )
            // InternalMazeGame.g:497:1: ( ':' )
            {
            // InternalMazeGame.g:497:1: ( ':' )
            // InternalMazeGame.g:498:2: ':'
            {
             before(grammarAccess.getDoorDefinitionAccess().getColonKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getDoorDefinitionAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__DoorDefinition__Group__1__Impl"


    // $ANTLR start "rule__DoorDefinition__Group__2"
    // InternalMazeGame.g:507:1: rule__DoorDefinition__Group__2 : rule__DoorDefinition__Group__2__Impl ;
    public final void rule__DoorDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMazeGame.g:511:1: ( rule__DoorDefinition__Group__2__Impl )
            // InternalMazeGame.g:512:2: rule__DoorDefinition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DoorDefinition__Group__2__Impl();

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
    // $ANTLR end "rule__DoorDefinition__Group__2"


    // $ANTLR start "rule__DoorDefinition__Group__2__Impl"
    // InternalMazeGame.g:518:1: rule__DoorDefinition__Group__2__Impl : ( ( rule__DoorDefinition__AdjacentRoomAssignment_2 ) ) ;
    public final void rule__DoorDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMazeGame.g:522:1: ( ( ( rule__DoorDefinition__AdjacentRoomAssignment_2 ) ) )
            // InternalMazeGame.g:523:1: ( ( rule__DoorDefinition__AdjacentRoomAssignment_2 ) )
            {
            // InternalMazeGame.g:523:1: ( ( rule__DoorDefinition__AdjacentRoomAssignment_2 ) )
            // InternalMazeGame.g:524:2: ( rule__DoorDefinition__AdjacentRoomAssignment_2 )
            {
             before(grammarAccess.getDoorDefinitionAccess().getAdjacentRoomAssignment_2()); 
            // InternalMazeGame.g:525:2: ( rule__DoorDefinition__AdjacentRoomAssignment_2 )
            // InternalMazeGame.g:525:3: rule__DoorDefinition__AdjacentRoomAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DoorDefinition__AdjacentRoomAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDoorDefinitionAccess().getAdjacentRoomAssignment_2()); 

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
    // $ANTLR end "rule__DoorDefinition__Group__2__Impl"


    // $ANTLR start "rule__MazeGame__RoomsAssignment_2"
    // InternalMazeGame.g:534:1: rule__MazeGame__RoomsAssignment_2 : ( ruleRoomDefinition ) ;
    public final void rule__MazeGame__RoomsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMazeGame.g:538:1: ( ( ruleRoomDefinition ) )
            // InternalMazeGame.g:539:2: ( ruleRoomDefinition )
            {
            // InternalMazeGame.g:539:2: ( ruleRoomDefinition )
            // InternalMazeGame.g:540:3: ruleRoomDefinition
            {
             before(grammarAccess.getMazeGameAccess().getRoomsRoomDefinitionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRoomDefinition();

            state._fsp--;

             after(grammarAccess.getMazeGameAccess().getRoomsRoomDefinitionParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__MazeGame__RoomsAssignment_2"


    // $ANTLR start "rule__RoomDefinition__NameAssignment_1"
    // InternalMazeGame.g:549:1: rule__RoomDefinition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RoomDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMazeGame.g:553:1: ( ( RULE_ID ) )
            // InternalMazeGame.g:554:2: ( RULE_ID )
            {
            // InternalMazeGame.g:554:2: ( RULE_ID )
            // InternalMazeGame.g:555:3: RULE_ID
            {
             before(grammarAccess.getRoomDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRoomDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__RoomDefinition__NameAssignment_1"


    // $ANTLR start "rule__RoomDefinition__DescriptionAssignment_2"
    // InternalMazeGame.g:564:1: rule__RoomDefinition__DescriptionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__RoomDefinition__DescriptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMazeGame.g:568:1: ( ( RULE_STRING ) )
            // InternalMazeGame.g:569:2: ( RULE_STRING )
            {
            // InternalMazeGame.g:569:2: ( RULE_STRING )
            // InternalMazeGame.g:570:3: RULE_STRING
            {
             before(grammarAccess.getRoomDefinitionAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRoomDefinitionAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__RoomDefinition__DescriptionAssignment_2"


    // $ANTLR start "rule__RoomDefinition__DoorsAssignment_4"
    // InternalMazeGame.g:579:1: rule__RoomDefinition__DoorsAssignment_4 : ( ruleDoorDefinition ) ;
    public final void rule__RoomDefinition__DoorsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMazeGame.g:583:1: ( ( ruleDoorDefinition ) )
            // InternalMazeGame.g:584:2: ( ruleDoorDefinition )
            {
            // InternalMazeGame.g:584:2: ( ruleDoorDefinition )
            // InternalMazeGame.g:585:3: ruleDoorDefinition
            {
             before(grammarAccess.getRoomDefinitionAccess().getDoorsDoorDefinitionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleDoorDefinition();

            state._fsp--;

             after(grammarAccess.getRoomDefinitionAccess().getDoorsDoorDefinitionParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__RoomDefinition__DoorsAssignment_4"


    // $ANTLR start "rule__DoorDefinition__DirectionAssignment_0"
    // InternalMazeGame.g:594:1: rule__DoorDefinition__DirectionAssignment_0 : ( ruleDirection ) ;
    public final void rule__DoorDefinition__DirectionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMazeGame.g:598:1: ( ( ruleDirection ) )
            // InternalMazeGame.g:599:2: ( ruleDirection )
            {
            // InternalMazeGame.g:599:2: ( ruleDirection )
            // InternalMazeGame.g:600:3: ruleDirection
            {
             before(grammarAccess.getDoorDefinitionAccess().getDirectionDirectionEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDirection();

            state._fsp--;

             after(grammarAccess.getDoorDefinitionAccess().getDirectionDirectionEnumRuleCall_0_0()); 

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
    // $ANTLR end "rule__DoorDefinition__DirectionAssignment_0"


    // $ANTLR start "rule__DoorDefinition__AdjacentRoomAssignment_2"
    // InternalMazeGame.g:609:1: rule__DoorDefinition__AdjacentRoomAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__DoorDefinition__AdjacentRoomAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMazeGame.g:613:1: ( ( ( RULE_ID ) ) )
            // InternalMazeGame.g:614:2: ( ( RULE_ID ) )
            {
            // InternalMazeGame.g:614:2: ( ( RULE_ID ) )
            // InternalMazeGame.g:615:3: ( RULE_ID )
            {
             before(grammarAccess.getDoorDefinitionAccess().getAdjacentRoomRoomDefinitionCrossReference_2_0()); 
            // InternalMazeGame.g:616:3: ( RULE_ID )
            // InternalMazeGame.g:617:4: RULE_ID
            {
             before(grammarAccess.getDoorDefinitionAccess().getAdjacentRoomRoomDefinitionIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDoorDefinitionAccess().getAdjacentRoomRoomDefinitionIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getDoorDefinitionAccess().getAdjacentRoomRoomDefinitionCrossReference_2_0()); 

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
    // $ANTLR end "rule__DoorDefinition__AdjacentRoomAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000027800L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000007802L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000010L});

}