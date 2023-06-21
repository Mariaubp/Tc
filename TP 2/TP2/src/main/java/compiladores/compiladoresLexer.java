// Generated from c:\Users\flore\OneDrive\Documentos\Semestre9\TC\parcial2\tp2\src\main\java\compiladores\compiladores.g4 by ANTLR 4.9.2

package compiladores;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class compiladoresLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PA=1, PC=2, LA=3, LC=4, PyC=5, IGU=6, COM=7, EQ=8, GT=9, GE=10, LT=11, 
		LE=12, NEQ=13, AND=14, OR=15, SUMA=16, RESTA=17, MULT=18, DIV=19, MOD=20, 
		INT=21, DOUBLE=22, BOOL=23, TRUE=24, FALSE=25, IWHILE=26, IIF=27, IFOR=28, 
		IRETURN=29, VAR=30, WS=31, ENTERO=32, DOBLE=33, BOOLEANO=34;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"DIGITO", "PA", "PC", "LA", "LC", "PyC", "IGU", "COM", "EQ", "GT", "GE", 
			"LT", "LE", "NEQ", "AND", "OR", "SUMA", "RESTA", "MULT", "DIV", "MOD", 
			"INT", "DOUBLE", "BOOL", "TRUE", "FALSE", "IWHILE", "IIF", "IFOR", "IRETURN", 
			"VAR", "WS", "ENTERO", "DOBLE", "BOOLEANO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", "';'", "'='", "','", "'=='", "'>'", 
			"'>='", "'<'", "'<='", "'!='", "'&&'", "'||'", "'+'", "'-'", "'*'", "'/'", 
			"'%'", "'int'", "'double'", "'boolean'", "'true'", "'false'", "'while'", 
			"'if'", "'for'", "'return'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PA", "PC", "LA", "LC", "PyC", "IGU", "COM", "EQ", "GT", "GE", 
			"LT", "LE", "NEQ", "AND", "OR", "SUMA", "RESTA", "MULT", "DIV", "MOD", 
			"INT", "DOUBLE", "BOOL", "TRUE", "FALSE", "IWHILE", "IIF", "IFOR", "IRETURN", 
			"VAR", "WS", "ENTERO", "DOBLE", "BOOLEANO"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public compiladoresLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "compiladores.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2$\u00c8\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3"+
		"\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23"+
		"\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3 \6 \u00ad\n \r \16 \u00ae\3!\3!\3!\3!\3\"\6\"\u00b6\n\"\r\"\16\"\u00b7"+
		"\3#\6#\u00bb\n#\r#\16#\u00bc\3#\3#\6#\u00c1\n#\r#\16#\u00c2\3$\3$\5$\u00c7"+
		"\n$\2\2%\3\2\5\3\7\4\t\5\13\6\r\7\17\b\21\t\23\n\25\13\27\f\31\r\33\16"+
		"\35\17\37\20!\21#\22%\23\'\24)\25+\26-\27/\30\61\31\63\32\65\33\67\34"+
		"9\35;\36=\37? A!C\"E#G$\3\2\5\3\2\62;\4\2C\\c|\5\2\13\f\17\17\"\"\2\u00cb"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2"+
		"\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\3I\3\2\2\2"+
		"\5K\3\2\2\2\7M\3\2\2\2\tO\3\2\2\2\13Q\3\2\2\2\rS\3\2\2\2\17U\3\2\2\2\21"+
		"W\3\2\2\2\23Y\3\2\2\2\25\\\3\2\2\2\27^\3\2\2\2\31a\3\2\2\2\33c\3\2\2\2"+
		"\35f\3\2\2\2\37i\3\2\2\2!l\3\2\2\2#o\3\2\2\2%q\3\2\2\2\'s\3\2\2\2)u\3"+
		"\2\2\2+w\3\2\2\2-y\3\2\2\2/}\3\2\2\2\61\u0084\3\2\2\2\63\u008c\3\2\2\2"+
		"\65\u0091\3\2\2\2\67\u0097\3\2\2\29\u009d\3\2\2\2;\u00a0\3\2\2\2=\u00a4"+
		"\3\2\2\2?\u00ac\3\2\2\2A\u00b0\3\2\2\2C\u00b5\3\2\2\2E\u00ba\3\2\2\2G"+
		"\u00c6\3\2\2\2IJ\t\2\2\2J\4\3\2\2\2KL\7*\2\2L\6\3\2\2\2MN\7+\2\2N\b\3"+
		"\2\2\2OP\7}\2\2P\n\3\2\2\2QR\7\177\2\2R\f\3\2\2\2ST\7=\2\2T\16\3\2\2\2"+
		"UV\7?\2\2V\20\3\2\2\2WX\7.\2\2X\22\3\2\2\2YZ\7?\2\2Z[\7?\2\2[\24\3\2\2"+
		"\2\\]\7@\2\2]\26\3\2\2\2^_\7@\2\2_`\7?\2\2`\30\3\2\2\2ab\7>\2\2b\32\3"+
		"\2\2\2cd\7>\2\2de\7?\2\2e\34\3\2\2\2fg\7#\2\2gh\7?\2\2h\36\3\2\2\2ij\7"+
		"(\2\2jk\7(\2\2k \3\2\2\2lm\7~\2\2mn\7~\2\2n\"\3\2\2\2op\7-\2\2p$\3\2\2"+
		"\2qr\7/\2\2r&\3\2\2\2st\7,\2\2t(\3\2\2\2uv\7\61\2\2v*\3\2\2\2wx\7\'\2"+
		"\2x,\3\2\2\2yz\7k\2\2z{\7p\2\2{|\7v\2\2|.\3\2\2\2}~\7f\2\2~\177\7q\2\2"+
		"\177\u0080\7w\2\2\u0080\u0081\7d\2\2\u0081\u0082\7n\2\2\u0082\u0083\7"+
		"g\2\2\u0083\60\3\2\2\2\u0084\u0085\7d\2\2\u0085\u0086\7q\2\2\u0086\u0087"+
		"\7q\2\2\u0087\u0088\7n\2\2\u0088\u0089\7g\2\2\u0089\u008a\7c\2\2\u008a"+
		"\u008b\7p\2\2\u008b\62\3\2\2\2\u008c\u008d\7v\2\2\u008d\u008e\7t\2\2\u008e"+
		"\u008f\7w\2\2\u008f\u0090\7g\2\2\u0090\64\3\2\2\2\u0091\u0092\7h\2\2\u0092"+
		"\u0093\7c\2\2\u0093\u0094\7n\2\2\u0094\u0095\7u\2\2\u0095\u0096\7g\2\2"+
		"\u0096\66\3\2\2\2\u0097\u0098\7y\2\2\u0098\u0099\7j\2\2\u0099\u009a\7"+
		"k\2\2\u009a\u009b\7n\2\2\u009b\u009c\7g\2\2\u009c8\3\2\2\2\u009d\u009e"+
		"\7k\2\2\u009e\u009f\7h\2\2\u009f:\3\2\2\2\u00a0\u00a1\7h\2\2\u00a1\u00a2"+
		"\7q\2\2\u00a2\u00a3\7t\2\2\u00a3<\3\2\2\2\u00a4\u00a5\7t\2\2\u00a5\u00a6"+
		"\7g\2\2\u00a6\u00a7\7v\2\2\u00a7\u00a8\7w\2\2\u00a8\u00a9\7t\2\2\u00a9"+
		"\u00aa\7p\2\2\u00aa>\3\2\2\2\u00ab\u00ad\t\3\2\2\u00ac\u00ab\3\2\2\2\u00ad"+
		"\u00ae\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af@\3\2\2\2"+
		"\u00b0\u00b1\t\4\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\b!\2\2\u00b3B\3\2"+
		"\2\2\u00b4\u00b6\5\3\2\2\u00b5\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7"+
		"\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8D\3\2\2\2\u00b9\u00bb\5\3\2\2"+
		"\u00ba\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd"+
		"\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c0\7\60\2\2\u00bf\u00c1\5\3\2\2"+
		"\u00c0\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3"+
		"\3\2\2\2\u00c3F\3\2\2\2\u00c4\u00c7\5\63\32\2\u00c5\u00c7\5\65\33\2\u00c6"+
		"\u00c4\3\2\2\2\u00c6\u00c5\3\2\2\2\u00c7H\3\2\2\2\b\2\u00ae\u00b7\u00bc"+
		"\u00c2\u00c6\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}