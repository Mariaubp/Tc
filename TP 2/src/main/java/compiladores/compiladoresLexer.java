// Generated from /Users/jony/Documents/UBP/VSCode/TC/BaseCompiladores/src/main/java/compiladores/compiladores.g4 by ANTLR 4.9.2

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
		WS=1, INT=2, DOUBLE=3, CHAR=4, VOID=5, IF=6, ELSE=7, RETURN=8, TRUE=9, 
		FALSE=10, WHILE=11, FOR=12, PYC=13, COMA=14, PA=15, PC=16, LLA=17, LLC=18, 
		CA=19, CC=20, ASSIGN=21, SUMA=22, RESTA=23, DIV=24, MULT=25, MOD=26, INCREMENTO=27, 
		DECREMENTO=28, PREG=29, OR=30, AND=31, NOT=32, COMPARADOR=33, NUMERO=34, 
		FLOATNUMBER=35, ID=36, CHARVALUE=37;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WS", "INT", "DOUBLE", "CHAR", "VOID", "IF", "ELSE", "RETURN", "TRUE", 
			"FALSE", "WHILE", "FOR", "PYC", "COMA", "PA", "PC", "LLA", "LLC", "CA", 
			"CC", "ASSIGN", "SUMA", "RESTA", "DIV", "MULT", "MOD", "INCREMENTO", 
			"DECREMENTO", "PREG", "OR", "AND", "NOT", "COMPARADOR", "DIGITO", "NUMERO", 
			"FLOATNUMBER", "LETRA", "ID", "CHARVALUE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'int'", "'double'", "'char'", "'void'", "'if'", "'else'", 
			"'return'", "'true'", "'false'", "'while'", "'for'", "';'", "','", "'('", 
			"')'", "'{'", "'}'", "'['", "']'", "'='", "'+'", "'-'", "'/'", "'*'", 
			"'%'", "'++'", "'--'", "'?'", "'||'", "'&&'", "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "INT", "DOUBLE", "CHAR", "VOID", "IF", "ELSE", "RETURN", 
			"TRUE", "FALSE", "WHILE", "FOR", "PYC", "COMA", "PA", "PC", "LLA", "LLC", 
			"CA", "CC", "ASSIGN", "SUMA", "RESTA", "DIV", "MULT", "MOD", "INCREMENTO", 
			"DECREMENTO", "PREG", "OR", "AND", "NOT", "COMPARADOR", "NUMERO", "FLOATNUMBER", 
			"ID", "CHARVALUE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\'\u00ea\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31"+
		"\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\37\3\37"+
		"\3\37\3 \3 \3 \3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u00c5"+
		"\n\"\3#\3#\3$\6$\u00ca\n$\r$\16$\u00cb\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u00d7"+
		"\n%\3&\3&\3\'\3\'\5\'\u00dd\n\'\3\'\3\'\3\'\7\'\u00e2\n\'\f\'\16\'\u00e5"+
		"\13\'\3(\3(\3(\3(\2\2)\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E\2G$I%K\2M&O\'\3\2\5\5\2\13\f\17\17\"\""+
		"\3\2\62;\4\2C\\c|\2\u00f3\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67"+
		"\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2"+
		"\2\2\2G\3\2\2\2\2I\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\3Q\3\2\2\2\5U\3\2\2\2"+
		"\7Y\3\2\2\2\t`\3\2\2\2\13e\3\2\2\2\rj\3\2\2\2\17m\3\2\2\2\21r\3\2\2\2"+
		"\23y\3\2\2\2\25~\3\2\2\2\27\u0084\3\2\2\2\31\u008a\3\2\2\2\33\u008e\3"+
		"\2\2\2\35\u0090\3\2\2\2\37\u0092\3\2\2\2!\u0094\3\2\2\2#\u0096\3\2\2\2"+
		"%\u0098\3\2\2\2\'\u009a\3\2\2\2)\u009c\3\2\2\2+\u009e\3\2\2\2-\u00a0\3"+
		"\2\2\2/\u00a2\3\2\2\2\61\u00a4\3\2\2\2\63\u00a6\3\2\2\2\65\u00a8\3\2\2"+
		"\2\67\u00aa\3\2\2\29\u00ad\3\2\2\2;\u00b0\3\2\2\2=\u00b2\3\2\2\2?\u00b5"+
		"\3\2\2\2A\u00b8\3\2\2\2C\u00c4\3\2\2\2E\u00c6\3\2\2\2G\u00c9\3\2\2\2I"+
		"\u00d6\3\2\2\2K\u00d8\3\2\2\2M\u00dc\3\2\2\2O\u00e6\3\2\2\2QR\t\2\2\2"+
		"RS\3\2\2\2ST\b\2\2\2T\4\3\2\2\2UV\7k\2\2VW\7p\2\2WX\7v\2\2X\6\3\2\2\2"+
		"YZ\7f\2\2Z[\7q\2\2[\\\7w\2\2\\]\7d\2\2]^\7n\2\2^_\7g\2\2_\b\3\2\2\2`a"+
		"\7e\2\2ab\7j\2\2bc\7c\2\2cd\7t\2\2d\n\3\2\2\2ef\7x\2\2fg\7q\2\2gh\7k\2"+
		"\2hi\7f\2\2i\f\3\2\2\2jk\7k\2\2kl\7h\2\2l\16\3\2\2\2mn\7g\2\2no\7n\2\2"+
		"op\7u\2\2pq\7g\2\2q\20\3\2\2\2rs\7t\2\2st\7g\2\2tu\7v\2\2uv\7w\2\2vw\7"+
		"t\2\2wx\7p\2\2x\22\3\2\2\2yz\7v\2\2z{\7t\2\2{|\7w\2\2|}\7g\2\2}\24\3\2"+
		"\2\2~\177\7h\2\2\177\u0080\7c\2\2\u0080\u0081\7n\2\2\u0081\u0082\7u\2"+
		"\2\u0082\u0083\7g\2\2\u0083\26\3\2\2\2\u0084\u0085\7y\2\2\u0085\u0086"+
		"\7j\2\2\u0086\u0087\7k\2\2\u0087\u0088\7n\2\2\u0088\u0089\7g\2\2\u0089"+
		"\30\3\2\2\2\u008a\u008b\7h\2\2\u008b\u008c\7q\2\2\u008c\u008d\7t\2\2\u008d"+
		"\32\3\2\2\2\u008e\u008f\7=\2\2\u008f\34\3\2\2\2\u0090\u0091\7.\2\2\u0091"+
		"\36\3\2\2\2\u0092\u0093\7*\2\2\u0093 \3\2\2\2\u0094\u0095\7+\2\2\u0095"+
		"\"\3\2\2\2\u0096\u0097\7}\2\2\u0097$\3\2\2\2\u0098\u0099\7\177\2\2\u0099"+
		"&\3\2\2\2\u009a\u009b\7]\2\2\u009b(\3\2\2\2\u009c\u009d\7_\2\2\u009d*"+
		"\3\2\2\2\u009e\u009f\7?\2\2\u009f,\3\2\2\2\u00a0\u00a1\7-\2\2\u00a1.\3"+
		"\2\2\2\u00a2\u00a3\7/\2\2\u00a3\60\3\2\2\2\u00a4\u00a5\7\61\2\2\u00a5"+
		"\62\3\2\2\2\u00a6\u00a7\7,\2\2\u00a7\64\3\2\2\2\u00a8\u00a9\7\'\2\2\u00a9"+
		"\66\3\2\2\2\u00aa\u00ab\7-\2\2\u00ab\u00ac\7-\2\2\u00ac8\3\2\2\2\u00ad"+
		"\u00ae\7/\2\2\u00ae\u00af\7/\2\2\u00af:\3\2\2\2\u00b0\u00b1\7A\2\2\u00b1"+
		"<\3\2\2\2\u00b2\u00b3\7~\2\2\u00b3\u00b4\7~\2\2\u00b4>\3\2\2\2\u00b5\u00b6"+
		"\7(\2\2\u00b6\u00b7\7(\2\2\u00b7@\3\2\2\2\u00b8\u00b9\7#\2\2\u00b9B\3"+
		"\2\2\2\u00ba\u00bb\7?\2\2\u00bb\u00c5\7?\2\2\u00bc\u00bd\7#\2\2\u00bd"+
		"\u00c5\7?\2\2\u00be\u00c5\7@\2\2\u00bf\u00c0\7@\2\2\u00c0\u00c5\7?\2\2"+
		"\u00c1\u00c5\7>\2\2\u00c2\u00c3\7>\2\2\u00c3\u00c5\7?\2\2\u00c4\u00ba"+
		"\3\2\2\2\u00c4\u00bc\3\2\2\2\u00c4\u00be\3\2\2\2\u00c4\u00bf\3\2\2\2\u00c4"+
		"\u00c1\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5D\3\2\2\2\u00c6\u00c7\t\3\2\2"+
		"\u00c7F\3\2\2\2\u00c8\u00ca\5E#\2\u00c9\u00c8\3\2\2\2\u00ca\u00cb\3\2"+
		"\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00ccH\3\2\2\2\u00cd\u00ce"+
		"\5G$\2\u00ce\u00cf\7\60\2\2\u00cf\u00d7\3\2\2\2\u00d0\u00d1\5G$\2\u00d1"+
		"\u00d2\7\60\2\2\u00d2\u00d3\5G$\2\u00d3\u00d7\3\2\2\2\u00d4\u00d5\7\60"+
		"\2\2\u00d5\u00d7\5G$\2\u00d6\u00cd\3\2\2\2\u00d6\u00d0\3\2\2\2\u00d6\u00d4"+
		"\3\2\2\2\u00d7J\3\2\2\2\u00d8\u00d9\t\4\2\2\u00d9L\3\2\2\2\u00da\u00dd"+
		"\7a\2\2\u00db\u00dd\5K&\2\u00dc\u00da\3\2\2\2\u00dc\u00db\3\2\2\2\u00dd"+
		"\u00e3\3\2\2\2\u00de\u00e2\7a\2\2\u00df\u00e2\5K&\2\u00e0\u00e2\5E#\2"+
		"\u00e1\u00de\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e0\3\2\2\2\u00e2\u00e5"+
		"\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4N\3\2\2\2\u00e5"+
		"\u00e3\3\2\2\2\u00e6\u00e7\7)\2\2\u00e7\u00e8\5K&\2\u00e8\u00e9\7)\2\2"+
		"\u00e9P\3\2\2\2\t\2\u00c4\u00cb\u00d6\u00dc\u00e1\u00e3\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}