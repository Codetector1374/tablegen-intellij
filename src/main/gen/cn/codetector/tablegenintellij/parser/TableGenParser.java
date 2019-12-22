// This is a generated file. Not intended for manual editing.
package cn.codetector.tablegenintellij.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static cn.codetector.tablegenintellij.psi.TableGenTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class TableGenParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return tableGenFile(b, l + 1);
  }

  /* ********************************************************** */
  // (":" baseClassListNE)?
  public static boolean baseClassList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "baseClassList")) return false;
    Marker m = enter_section_(b, l, _NONE_, BASE_CLASS_LIST, "<base class list>");
    baseClassList_0(b, l + 1);
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // ":" baseClassListNE
  private static boolean baseClassList_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "baseClassList_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ":");
    r = r && baseClassListNE(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // subClassRef ("," subClassRef)*
  public static boolean baseClassListNE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "baseClassListNE")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BASE_CLASS_LIST_NE, "<base class list ne>");
    r = subClassRef(b, l + 1);
    r = r && baseClassListNE_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ("," subClassRef)*
  private static boolean baseClassListNE_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "baseClassListNE_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!baseClassListNE_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "baseClassListNE_1", c)) break;
    }
    return true;
  }

  // "," subClassRef
  private static boolean baseClassListNE_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "baseClassListNE_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && subClassRef(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // BIN_INT
  public static boolean binaryInt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "binaryInt")) return false;
    if (!nextTokenIs(b, BIN_INT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BIN_INT);
    exit_section_(b, m, BINARY_INT, r);
    return r;
  }

  /* ********************************************************** */
  // ";" | "{" bodyList "}"
  public static boolean body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "body")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BODY, "<body>");
    r = consumeToken(b, ";");
    if (!r) r = body_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "{" bodyList "}"
  private static boolean body_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "body_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "{");
    r = r && bodyList(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // declaration ";"
  //              | KeywordLet IDENTIFIER [ "{" rangeList "}" ] "=" value ";"
  //              | KeywordField declaration ";"
  public static boolean bodyItem(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bodyItem")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BODY_ITEM, "<body item>");
    r = bodyItem_0(b, l + 1);
    if (!r) r = bodyItem_1(b, l + 1);
    if (!r) r = bodyItem_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // declaration ";"
  private static boolean bodyItem_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bodyItem_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = declaration(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  // KeywordLet IDENTIFIER [ "{" rangeList "}" ] "=" value ";"
  private static boolean bodyItem_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bodyItem_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KEYWORDLET, IDENTIFIER);
    r = r && bodyItem_1_2(b, l + 1);
    r = r && consumeToken(b, "=");
    r = r && value(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  // [ "{" rangeList "}" ]
  private static boolean bodyItem_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bodyItem_1_2")) return false;
    bodyItem_1_2_0(b, l + 1);
    return true;
  }

  // "{" rangeList "}"
  private static boolean bodyItem_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bodyItem_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "{");
    r = r && rangeList(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, m, null, r);
    return r;
  }

  // KeywordField declaration ";"
  private static boolean bodyItem_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bodyItem_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KEYWORDFIELD);
    r = r && declaration(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // bodyItem*
  public static boolean bodyList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bodyList")) return false;
    Marker m = enter_section_(b, l, _NONE_, BODY_LIST, "<body list>");
    while (true) {
      int c = current_position_(b);
      if (!bodyItem(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "bodyList", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean classID(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classID")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, CLASS_ID, r);
    return r;
  }

  /* ********************************************************** */
  // KeywordClass IDENTIFIER templateArgList? objectBody
  public static boolean classStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classStmt")) return false;
    if (!nextTokenIs(b, KEYWORDCLASS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KEYWORDCLASS, IDENTIFIER);
    r = r && classStmt_2(b, l + 1);
    r = r && objectBody(b, l + 1);
    exit_section_(b, m, CLASS_STMT, r);
    return r;
  }

  // templateArgList?
  private static boolean classStmt_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classStmt_2")) return false;
    templateArgList(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // value (":" VARNAME)? | VARNAME
  public static boolean dagArg(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dagArg")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DAG_ARG, "<dag arg>");
    r = dagArg_0(b, l + 1);
    if (!r) r = consumeToken(b, VARNAME);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // value (":" VARNAME)?
  private static boolean dagArg_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dagArg_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = value(b, l + 1);
    r = r && dagArg_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (":" VARNAME)?
  private static boolean dagArg_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dagArg_0_1")) return false;
    dagArg_0_1_0(b, l + 1);
    return true;
  }

  // ":" VARNAME
  private static boolean dagArg_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dagArg_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ":");
    r = r && consumeToken(b, VARNAME);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // dagArg ("," dagArg)*
  public static boolean dagArgList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dagArgList")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DAG_ARG_LIST, "<dag arg list>");
    r = dagArg(b, l + 1);
    r = r && dagArgList_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ("," dagArg)*
  private static boolean dagArgList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dagArgList_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!dagArgList_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "dagArgList_1", c)) break;
    }
    return true;
  }

  // "," dagArg
  private static boolean dagArgList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dagArgList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && dagArg(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ["-"] DEC_INT
  public static boolean decimalInteger(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decimalInteger")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DECIMAL_INTEGER, "<decimal integer>");
    r = decimalInteger_0(b, l + 1);
    r = r && consumeToken(b, DEC_INT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ["-"]
  private static boolean decimalInteger_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decimalInteger_0")) return false;
    consumeToken(b, "-");
    return true;
  }

  /* ********************************************************** */
  // type IDENTIFIER ("=" value)?
  public static boolean declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DECLARATION, "<declaration>");
    r = type(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    r = r && declaration_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ("=" value)?
  private static boolean declaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declaration_2")) return false;
    declaration_2_0(b, l + 1);
    return true;
  }

  // "=" value
  private static boolean declaration_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declaration_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "=");
    r = r && value(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KeywordDef value? objectBody
  public static boolean defStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "defStmt")) return false;
    if (!nextTokenIs(b, KEYWORDDEF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KEYWORDDEF);
    r = r && defStmt_1(b, l + 1);
    r = r && objectBody(b, l + 1);
    exit_section_(b, m, DEF_STMT, r);
    return r;
  }

  // value?
  private static boolean defStmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "defStmt_1")) return false;
    value(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean defmID(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "defmID")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, DEFM_ID, r);
    return r;
  }

  /* ********************************************************** */
  // KeywordDefm [value] ":" baseClassListNE ";"
  public static boolean defmStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "defmStmt")) return false;
    if (!nextTokenIs(b, KEYWORDDEFM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KEYWORDDEFM);
    r = r && defmStmt_1(b, l + 1);
    r = r && consumeToken(b, ":");
    r = r && baseClassListNE(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, DEFM_STMT, r);
    return r;
  }

  // [value]
  private static boolean defmStmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "defmStmt_1")) return false;
    value(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // KeywordInclude STRING
  public static boolean includeDirective(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "includeDirective")) return false;
    if (!nextTokenIs(b, KEYWORDINCLUDE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KEYWORDINCLUDE, STRING);
    exit_section_(b, m, INCLUDE_DIRECTIVE, r);
    return r;
  }

  /* ********************************************************** */
  // binaryInt | decimalInteger | HEX_INT
  public static boolean integer(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "integer")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INTEGER, "<integer>");
    r = binaryInt(b, l + 1);
    if (!r) r = decimalInteger(b, l + 1);
    if (!r) r = consumeToken(b, HEX_INT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER [rangeList] "=" value
  public static boolean letItem(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "letItem")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && letItem_1(b, l + 1);
    r = r && consumeToken(b, "=");
    r = r && value(b, l + 1);
    exit_section_(b, m, LET_ITEM, r);
    return r;
  }

  // [rangeList]
  private static boolean letItem_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "letItem_1")) return false;
    rangeList(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // letItem ("," letItem)*
  public static boolean letList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "letList")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = letItem(b, l + 1);
    r = r && letList_1(b, l + 1);
    exit_section_(b, m, LET_LIST, r);
    return r;
  }

  // ("," letItem)*
  private static boolean letList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "letList_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!letList_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "letList_1", c)) break;
    }
    return true;
  }

  // "," letItem
  private static boolean letList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "letList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && letItem(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KeywordLet letList KeywordIn "{" object* "}"
  //             | KeywordLet letList KeywordIn object
  public static boolean letStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "letStmt")) return false;
    if (!nextTokenIs(b, KEYWORDLET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = letStmt_0(b, l + 1);
    if (!r) r = letStmt_1(b, l + 1);
    exit_section_(b, m, LET_STMT, r);
    return r;
  }

  // KeywordLet letList KeywordIn "{" object* "}"
  private static boolean letStmt_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "letStmt_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KEYWORDLET);
    r = r && letList(b, l + 1);
    r = r && consumeToken(b, KEYWORDIN);
    r = r && consumeToken(b, "{");
    r = r && letStmt_0_4(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, m, null, r);
    return r;
  }

  // object*
  private static boolean letStmt_0_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "letStmt_0_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!object(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "letStmt_0_4", c)) break;
    }
    return true;
  }

  // KeywordLet letList KeywordIn object
  private static boolean letStmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "letStmt_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KEYWORDLET);
    r = r && letList(b, l + 1);
    r = r && consumeToken(b, KEYWORDIN);
    r = r && object(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  public static boolean multiClassID(PsiBuilder b, int l) {
    Marker m = enter_section_(b);
    exit_section_(b, m, MULTI_CLASS_ID, true);
    return true;
  }

  /* ********************************************************** */
  // !<<eof>> (classStmt | defStmt | defmStmt | includeDirective | letStmt)
  static boolean object(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = object_0(b, l + 1);
    r = r && object_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // !<<eof>>
  private static boolean object_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !eof(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // classStmt | defStmt | defmStmt | includeDirective | letStmt
  private static boolean object_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_1")) return false;
    boolean r;
    r = classStmt(b, l + 1);
    if (!r) r = defStmt(b, l + 1);
    if (!r) r = defmStmt(b, l + 1);
    if (!r) r = includeDirective(b, l + 1);
    if (!r) r = letStmt(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // baseClassList body
  public static boolean objectBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "objectBody")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OBJECT_BODY, "<object body>");
    r = baseClassList(b, l + 1);
    r = r && body(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // rangePiece (',' rangePiece)*
  public static boolean rangeList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rangeList")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RANGE_LIST, "<range list>");
    r = rangePiece(b, l + 1);
    r = r && rangeList_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (',' rangePiece)*
  private static boolean rangeList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rangeList_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!rangeList_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "rangeList_1", c)) break;
    }
    return true;
  }

  // ',' rangePiece
  private static boolean rangeList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rangeList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && rangePiece(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // integer '-' integer
  //              | integer integer
  //              | integer
  public static boolean rangePiece(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rangePiece")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RANGE_PIECE, "<range piece>");
    r = rangePiece_0(b, l + 1);
    if (!r) r = rangePiece_1(b, l + 1);
    if (!r) r = integer(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // integer '-' integer
  private static boolean rangePiece_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rangePiece_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = integer(b, l + 1);
    r = r && consumeToken(b, "-");
    r = r && integer(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // integer integer
  private static boolean rangePiece_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rangePiece_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = integer(b, l + 1);
    r = r && integer(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // CODE_FRAGMENT
  //               | STRING
  //               | '?'
  //               | '{' valueList '}'
  //               | classID '<' valueListNE '>'
  //               | '[' valueList ']' ("<" type ">")?
  //               | "(" dagArg dagArgList? ")"
  //               // TODO BANG Operator
  //               | integer
  //               | IDENTIFIER
  public static boolean simpleValue(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simpleValue")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SIMPLE_VALUE, "<simple value>");
    r = consumeToken(b, CODE_FRAGMENT);
    if (!r) r = consumeToken(b, STRING);
    if (!r) r = consumeToken(b, "?");
    if (!r) r = simpleValue_3(b, l + 1);
    if (!r) r = simpleValue_4(b, l + 1);
    if (!r) r = simpleValue_5(b, l + 1);
    if (!r) r = simpleValue_6(b, l + 1);
    if (!r) r = integer(b, l + 1);
    if (!r) r = consumeToken(b, IDENTIFIER);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '{' valueList '}'
  private static boolean simpleValue_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simpleValue_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "{");
    r = r && valueList(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, m, null, r);
    return r;
  }

  // classID '<' valueListNE '>'
  private static boolean simpleValue_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simpleValue_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = classID(b, l + 1);
    r = r && consumeToken(b, "<");
    r = r && valueListNE(b, l + 1);
    r = r && consumeToken(b, ">");
    exit_section_(b, m, null, r);
    return r;
  }

  // '[' valueList ']' ("<" type ">")?
  private static boolean simpleValue_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simpleValue_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "[");
    r = r && valueList(b, l + 1);
    r = r && consumeToken(b, "]");
    r = r && simpleValue_5_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ("<" type ">")?
  private static boolean simpleValue_5_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simpleValue_5_3")) return false;
    simpleValue_5_3_0(b, l + 1);
    return true;
  }

  // "<" type ">"
  private static boolean simpleValue_5_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simpleValue_5_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "<");
    r = r && type(b, l + 1);
    r = r && consumeToken(b, ">");
    exit_section_(b, m, null, r);
    return r;
  }

  // "(" dagArg dagArgList? ")"
  private static boolean simpleValue_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simpleValue_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && dagArg(b, l + 1);
    r = r && simpleValue_6_2(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // dagArgList?
  private static boolean simpleValue_6_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simpleValue_6_2")) return false;
    dagArgList(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // (classID | multiClassID) ("<" valueList ">")?
  public static boolean subClassRef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subClassRef")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SUB_CLASS_REF, "<sub class ref>");
    r = subClassRef_0(b, l + 1);
    r = r && subClassRef_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // classID | multiClassID
  private static boolean subClassRef_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subClassRef_0")) return false;
    boolean r;
    r = classID(b, l + 1);
    if (!r) r = multiClassID(b, l + 1);
    return r;
  }

  // ("<" valueList ">")?
  private static boolean subClassRef_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subClassRef_1")) return false;
    subClassRef_1_0(b, l + 1);
    return true;
  }

  // "<" valueList ">"
  private static boolean subClassRef_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subClassRef_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "<");
    r = r && valueList(b, l + 1);
    r = r && consumeToken(b, ">");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // object*
  static boolean tableGenFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tableGenFile")) return false;
    while (true) {
      int c = current_position_(b);
      if (!object(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "tableGenFile", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // "<" declaration ("," declaration)* ">"
  public static boolean templateArgList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "templateArgList")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TEMPLATE_ARG_LIST, "<template arg list>");
    r = consumeToken(b, "<");
    r = r && declaration(b, l + 1);
    r = r && templateArgList_2(b, l + 1);
    r = r && consumeToken(b, ">");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ("," declaration)*
  private static boolean templateArgList_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "templateArgList_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!templateArgList_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "templateArgList_2", c)) break;
    }
    return true;
  }

  // "," declaration
  private static boolean templateArgList_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "templateArgList_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && declaration(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KeywordString | KeywordCode | KeywordBit | KeywordInt
  //             | KeywordDag
  //             | KeywordBits "<" integer ">"
  //             | KeywordList "<" type ">"
  //             | classID
  public static boolean type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE, "<type>");
    r = consumeToken(b, KEYWORDSTRING);
    if (!r) r = consumeToken(b, KEYWORDCODE);
    if (!r) r = consumeToken(b, KEYWORDBIT);
    if (!r) r = consumeToken(b, KEYWORDINT);
    if (!r) r = consumeToken(b, KEYWORDDAG);
    if (!r) r = type_5(b, l + 1);
    if (!r) r = type_6(b, l + 1);
    if (!r) r = classID(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // KeywordBits "<" integer ">"
  private static boolean type_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KEYWORDBITS);
    r = r && consumeToken(b, "<");
    r = r && integer(b, l + 1);
    r = r && consumeToken(b, ">");
    exit_section_(b, m, null, r);
    return r;
  }

  // KeywordList "<" type ">"
  private static boolean type_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KEYWORDLIST);
    r = r && consumeToken(b, "<");
    r = r && type(b, l + 1);
    r = r && consumeToken(b, ">");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // simpleValue valueSuffix*
  public static boolean value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VALUE, "<value>");
    r = simpleValue(b, l + 1);
    r = r && value_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // valueSuffix*
  private static boolean value_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!valueSuffix(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "value_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // valueListNE?
  public static boolean valueList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "valueList")) return false;
    Marker m = enter_section_(b, l, _NONE_, VALUE_LIST, "<value list>");
    valueListNE(b, l + 1);
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // value ("," value)*
  public static boolean valueListNE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "valueListNE")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VALUE_LIST_NE, "<value list ne>");
    r = value(b, l + 1);
    r = r && valueListNE_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ("," value)*
  private static boolean valueListNE_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "valueListNE_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!valueListNE_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "valueListNE_1", c)) break;
    }
    return true;
  }

  // "," value
  private static boolean valueListNE_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "valueListNE_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && value(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '{' rangeList '}'
  //                | '[' rangeList ']'
  //                | '.' IDENTIFIER
  public static boolean valueSuffix(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "valueSuffix")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VALUE_SUFFIX, "<value suffix>");
    r = valueSuffix_0(b, l + 1);
    if (!r) r = valueSuffix_1(b, l + 1);
    if (!r) r = valueSuffix_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '{' rangeList '}'
  private static boolean valueSuffix_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "valueSuffix_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "{");
    r = r && rangeList(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, m, null, r);
    return r;
  }

  // '[' rangeList ']'
  private static boolean valueSuffix_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "valueSuffix_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "[");
    r = r && rangeList(b, l + 1);
    r = r && consumeToken(b, "]");
    exit_section_(b, m, null, r);
    return r;
  }

  // '.' IDENTIFIER
  private static boolean valueSuffix_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "valueSuffix_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ".");
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

}
