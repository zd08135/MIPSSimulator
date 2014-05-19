/* Generated By:JavaCC: Do not edit this line. MIPSParserConstants.java */

/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
public interface MIPSParserConstants {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int SINGLE_LINE_COMMENT = 9;
  /** RegularExpression Id. */
  int FORMAL_COMMENT = 10;
  /** RegularExpression Id. */
  int MULTI_LINE_COMMENT = 11;
  /** RegularExpression Id. */
  int NOP = 13;
  /** RegularExpression Id. */
  int ADD = 14;
  /** RegularExpression Id. */
  int ADDI = 15;
  /** RegularExpression Id. */
  int ADDIU = 16;
  /** RegularExpression Id. */
  int ADDU = 17;
  /** RegularExpression Id. */
  int SUB = 18;
  /** RegularExpression Id. */
  int CLO = 19;
  /** RegularExpression Id. */
  int CLZ = 20;
  /** RegularExpression Id. */
  int AND = 21;
  /** RegularExpression Id. */
  int LUI = 22;
  /** RegularExpression Id. */
  int SEB = 23;
  /** RegularExpression Id. */
  int SEH = 24;
  /** RegularExpression Id. */
  int B = 25;
  /** RegularExpression Id. */
  int BGEZ = 26;
  /** RegularExpression Id. */
  int INTEGER_LITERAL = 27;
  /** RegularExpression Id. */
  int DECIMAL_LITERAL = 28;
  /** RegularExpression Id. */
  int HEX_LITERAL = 29;
  /** RegularExpression Id. */
  int OCTAL_LITERAL = 30;
  /** RegularExpression Id. */
  int REG_LOGO = 31;

  /** Lexical state. */
  int DEFAULT = 0;
  /** Lexical state. */
  int IN_SINGLE_LINE_COMMENT = 1;
  /** Lexical state. */
  int IN_FORMAL_COMMENT = 2;
  /** Lexical state. */
  int IN_MULTI_LINE_COMMENT = 3;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "\" \"",
    "\"\\t\"",
    "\"\\n\"",
    "\"\\r\"",
    "\"\\f\"",
    "\"//\"",
    "<token of kind 7>",
    "\"/*\"",
    "<SINGLE_LINE_COMMENT>",
    "\"*/\"",
    "\"*/\"",
    "<token of kind 12>",
    "\"nop\"",
    "\"add\"",
    "\"addi\"",
    "\"addiu\"",
    "\"addu\"",
    "\"sub\"",
    "\"clo\"",
    "\"clz\"",
    "\"and\"",
    "\"lui\"",
    "\"seb\"",
    "\"seh\"",
    "\"b\"",
    "\"bgez\"",
    "<INTEGER_LITERAL>",
    "<DECIMAL_LITERAL>",
    "<HEX_LITERAL>",
    "<OCTAL_LITERAL>",
    "\"$\"",
  };

}
