// Generated from /Users/jacklem1/IdeaProjects/CMinusCompiler/src/CMinusComplier.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HW5Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, LCOMM=2, RCOMM=3, COMMENT=4, LB=5, RB=6, LPAREN=7, RPAREN=8, SEMICOLON=9, 
		COMMA=10, LCB=11, RCB=12, LTE=13, LT=14, GT=15, GTE=16, EQ=17, ASSIGN=18, 
		NOTEQ=19, ADD=20, SUB=21, MULT=22, DIV=23, IF=24, ELSE=25, WHILE=26, RETURN=27, 
		INT=28, VOID=29, NUM=30, ID=31;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"WS", "LCOMM", "RCOMM", "COMMENT", "LB", "RB", "LPAREN", "RPAREN", "SEMICOLON", 
		"COMMA", "LCB", "RCB", "LTE", "LT", "GT", "GTE", "EQ", "ASSIGN", "NOTEQ", 
		"ADD", "SUB", "MULT", "DIV", "IF", "ELSE", "WHILE", "RETURN", "INT", "VOID", 
		"DIGIT", "LETTER", "NUM", "ID"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'/*'", "'*/'", null, "'['", "']'", "'('", "')'", "';'", "','", 
		"'{'", "'}'", "'<='", "'<'", "'>'", "'>='", "'=='", "'='", "'!='", "'+'", 
		"'-'", "'*'", "'/'", "'if'", "'else'", "'while'", "'return'", "'int'", 
		"'void'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WS", "LCOMM", "RCOMM", "COMMENT", "LB", "RB", "LPAREN", "RPAREN", 
		"SEMICOLON", "COMMA", "LCB", "RCB", "LTE", "LT", "GT", "GTE", "EQ", "ASSIGN", 
		"NOTEQ", "ADD", "SUB", "MULT", "DIV", "IF", "ELSE", "WHILE", "RETURN", 
		"INT", "VOID", "NUM", "ID"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public HW5Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CMinusComplier.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2!\u00b6\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\6\2G\n\2\r\2\16\2H\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5"+
		"\3\5\6\5U\n\5\r\5\16\5V\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3"+
		"\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\20\3\20"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\26"+
		"\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35"+
		"\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3 \3 \3!\3!\7!\u00ab\n!"+
		"\f!\16!\u00ae\13!\3\"\3\"\7\"\u00b2\n\"\f\"\16\"\u00b5\13\"\3V\2#\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37=\2?"+
		"\2A C!\3\2\5\5\2\13\f\17\17\"\"\3\2\62;\4\2C\\c|\2\u00b7\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2A\3\2\2"+
		"\2\2C\3\2\2\2\3F\3\2\2\2\5L\3\2\2\2\7O\3\2\2\2\tR\3\2\2\2\13\\\3\2\2\2"+
		"\r^\3\2\2\2\17`\3\2\2\2\21b\3\2\2\2\23d\3\2\2\2\25f\3\2\2\2\27h\3\2\2"+
		"\2\31j\3\2\2\2\33l\3\2\2\2\35o\3\2\2\2\37q\3\2\2\2!s\3\2\2\2#v\3\2\2\2"+
		"%y\3\2\2\2\'{\3\2\2\2)~\3\2\2\2+\u0080\3\2\2\2-\u0082\3\2\2\2/\u0084\3"+
		"\2\2\2\61\u0086\3\2\2\2\63\u0089\3\2\2\2\65\u008e\3\2\2\2\67\u0094\3\2"+
		"\2\29\u009b\3\2\2\2;\u009f\3\2\2\2=\u00a4\3\2\2\2?\u00a6\3\2\2\2A\u00a8"+
		"\3\2\2\2C\u00af\3\2\2\2EG\t\2\2\2FE\3\2\2\2GH\3\2\2\2HF\3\2\2\2HI\3\2"+
		"\2\2IJ\3\2\2\2JK\b\2\2\2K\4\3\2\2\2LM\7\61\2\2MN\7,\2\2N\6\3\2\2\2OP\7"+
		",\2\2PQ\7\61\2\2Q\b\3\2\2\2RT\5\5\3\2SU\13\2\2\2TS\3\2\2\2UV\3\2\2\2V"+
		"W\3\2\2\2VT\3\2\2\2WX\3\2\2\2XY\5\7\4\2YZ\3\2\2\2Z[\b\5\2\2[\n\3\2\2\2"+
		"\\]\7]\2\2]\f\3\2\2\2^_\7_\2\2_\16\3\2\2\2`a\7*\2\2a\20\3\2\2\2bc\7+\2"+
		"\2c\22\3\2\2\2de\7=\2\2e\24\3\2\2\2fg\7.\2\2g\26\3\2\2\2hi\7}\2\2i\30"+
		"\3\2\2\2jk\7\177\2\2k\32\3\2\2\2lm\7>\2\2mn\7?\2\2n\34\3\2\2\2op\7>\2"+
		"\2p\36\3\2\2\2qr\7@\2\2r \3\2\2\2st\7@\2\2tu\7?\2\2u\"\3\2\2\2vw\7?\2"+
		"\2wx\7?\2\2x$\3\2\2\2yz\7?\2\2z&\3\2\2\2{|\7#\2\2|}\7?\2\2}(\3\2\2\2~"+
		"\177\7-\2\2\177*\3\2\2\2\u0080\u0081\7/\2\2\u0081,\3\2\2\2\u0082\u0083"+
		"\7,\2\2\u0083.\3\2\2\2\u0084\u0085\7\61\2\2\u0085\60\3\2\2\2\u0086\u0087"+
		"\7k\2\2\u0087\u0088\7h\2\2\u0088\62\3\2\2\2\u0089\u008a\7g\2\2\u008a\u008b"+
		"\7n\2\2\u008b\u008c\7u\2\2\u008c\u008d\7g\2\2\u008d\64\3\2\2\2\u008e\u008f"+
		"\7y\2\2\u008f\u0090\7j\2\2\u0090\u0091\7k\2\2\u0091\u0092\7n\2\2\u0092"+
		"\u0093\7g\2\2\u0093\66\3\2\2\2\u0094\u0095\7t\2\2\u0095\u0096\7g\2\2\u0096"+
		"\u0097\7v\2\2\u0097\u0098\7w\2\2\u0098\u0099\7t\2\2\u0099\u009a\7p\2\2"+
		"\u009a8\3\2\2\2\u009b\u009c\7k\2\2\u009c\u009d\7p\2\2\u009d\u009e\7v\2"+
		"\2\u009e:\3\2\2\2\u009f\u00a0\7x\2\2\u00a0\u00a1\7q\2\2\u00a1\u00a2\7"+
		"k\2\2\u00a2\u00a3\7f\2\2\u00a3<\3\2\2\2\u00a4\u00a5\t\3\2\2\u00a5>\3\2"+
		"\2\2\u00a6\u00a7\t\4\2\2\u00a7@\3\2\2\2\u00a8\u00ac\5=\37\2\u00a9\u00ab"+
		"\5=\37\2\u00aa\u00a9\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac"+
		"\u00ad\3\2\2\2\u00adB\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b3\5? \2\u00b0"+
		"\u00b2\5? \2\u00b1\u00b0\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2\2"+
		"\2\u00b3\u00b4\3\2\2\2\u00b4D\3\2\2\2\u00b5\u00b3\3\2\2\2\7\2HV\u00ac"+
		"\u00b3\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}