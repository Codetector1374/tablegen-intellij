// This is a generated file. Not intended for manual editing.
package cn.codetector.tablegenintellij.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import cn.codetector.tablegenintellij.psi.impl.*;

public interface TableGenTypes {

  IElementType BASE_CLASS_LIST = new TableGenElementType("BASE_CLASS_LIST");
  IElementType BASE_CLASS_LIST_NE = new TableGenElementType("BASE_CLASS_LIST_NE");
  IElementType BINARY_INT = new TableGenElementType("BINARY_INT");
  IElementType BODY = new TableGenElementType("BODY");
  IElementType BODY_ITEM = new TableGenElementType("BODY_ITEM");
  IElementType BODY_LIST = new TableGenElementType("BODY_LIST");
  IElementType CLASS_ID = new TableGenElementType("CLASS_ID");
  IElementType CLASS_STMT = new TableGenElementType("CLASS_STMT");
  IElementType DAG_ARG = new TableGenElementType("DAG_ARG");
  IElementType DAG_ARG_LIST = new TableGenElementType("DAG_ARG_LIST");
  IElementType DECIMAL_INTEGER = new TableGenElementType("DECIMAL_INTEGER");
  IElementType DECLARATION = new TableGenElementType("DECLARATION");
  IElementType DEFM_ID = new TableGenElementType("DEFM_ID");
  IElementType DEFM_STMT = new TableGenElementType("DEFM_STMT");
  IElementType DEF_STMT = new TableGenElementType("DEF_STMT");
  IElementType INCLUDE_DIRECTIVE = new TableGenElementType("INCLUDE_DIRECTIVE");
  IElementType INTEGER = new TableGenElementType("INTEGER");
  IElementType LET_ITEM = new TableGenElementType("LET_ITEM");
  IElementType LET_LIST = new TableGenElementType("LET_LIST");
  IElementType LET_STMT = new TableGenElementType("LET_STMT");
  IElementType MULTI_CLASS_ID = new TableGenElementType("MULTI_CLASS_ID");
  IElementType OBJECT_BODY = new TableGenElementType("OBJECT_BODY");
  IElementType RANGE_LIST = new TableGenElementType("RANGE_LIST");
  IElementType RANGE_PIECE = new TableGenElementType("RANGE_PIECE");
  IElementType SIMPLE_VALUE = new TableGenElementType("SIMPLE_VALUE");
  IElementType SUB_CLASS_REF = new TableGenElementType("SUB_CLASS_REF");
  IElementType TEMPLATE_ARG_LIST = new TableGenElementType("TEMPLATE_ARG_LIST");
  IElementType TYPE = new TableGenElementType("TYPE");
  IElementType VALUE = new TableGenElementType("VALUE");
  IElementType VALUE_LIST = new TableGenElementType("VALUE_LIST");
  IElementType VALUE_LIST_NE = new TableGenElementType("VALUE_LIST_NE");
  IElementType VALUE_SUFFIX = new TableGenElementType("VALUE_SUFFIX");

  IElementType BIN_INT = new TableGenTokenType("BIN_INT");
  IElementType CODE_FRAGMENT = new TableGenTokenType("CODE_FRAGMENT");
  IElementType COMMENTS = new TableGenTokenType("COMMENTS");
  IElementType DEC_INT = new TableGenTokenType("DEC_INT");
  IElementType HEX_INT = new TableGenTokenType("HEX_INT");
  IElementType IDENTIFIER = new TableGenTokenType("IDENTIFIER");
  IElementType KEYWORDBIT = new TableGenTokenType("bit");
  IElementType KEYWORDBITS = new TableGenTokenType("bits");
  IElementType KEYWORDCLASS = new TableGenTokenType("class");
  IElementType KEYWORDCODE = new TableGenTokenType("code");
  IElementType KEYWORDDAG = new TableGenTokenType("dag");
  IElementType KEYWORDDEF = new TableGenTokenType("def");
  IElementType KEYWORDDEFM = new TableGenTokenType("defm");
  IElementType KEYWORDFIELD = new TableGenTokenType("field");
  IElementType KEYWORDFOREACH = new TableGenTokenType("foreach");
  IElementType KEYWORDIN = new TableGenTokenType("in");
  IElementType KEYWORDINCLUDE = new TableGenTokenType("include");
  IElementType KEYWORDINT = new TableGenTokenType("int");
  IElementType KEYWORDLET = new TableGenTokenType("let");
  IElementType KEYWORDLIST = new TableGenTokenType("list");
  IElementType KEYWORDMULTICLASS = new TableGenTokenType("multiclass");
  IElementType KEYWORDSTRING = new TableGenTokenType("string");
  IElementType STRING = new TableGenTokenType("STRING");
  IElementType VARNAME = new TableGenTokenType("VARNAME");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == BASE_CLASS_LIST) {
        return new TableGenBaseClassListImpl(node);
      }
      else if (type == BASE_CLASS_LIST_NE) {
        return new TableGenBaseClassListNEImpl(node);
      }
      else if (type == BINARY_INT) {
        return new TableGenBinaryIntImpl(node);
      }
      else if (type == BODY) {
        return new TableGenBodyImpl(node);
      }
      else if (type == BODY_ITEM) {
        return new TableGenBodyItemImpl(node);
      }
      else if (type == BODY_LIST) {
        return new TableGenBodyListImpl(node);
      }
      else if (type == CLASS_ID) {
        return new TableGenClassIDImpl(node);
      }
      else if (type == CLASS_STMT) {
        return new TableGenClassStmtImpl(node);
      }
      else if (type == DAG_ARG) {
        return new TableGenDagArgImpl(node);
      }
      else if (type == DAG_ARG_LIST) {
        return new TableGenDagArgListImpl(node);
      }
      else if (type == DECIMAL_INTEGER) {
        return new TableGenDecimalIntegerImpl(node);
      }
      else if (type == DECLARATION) {
        return new TableGenDeclarationImpl(node);
      }
      else if (type == DEFM_ID) {
        return new TableGenDefmIDImpl(node);
      }
      else if (type == DEFM_STMT) {
        return new TableGenDefmStmtImpl(node);
      }
      else if (type == DEF_STMT) {
        return new TableGenDefStmtImpl(node);
      }
      else if (type == INCLUDE_DIRECTIVE) {
        return new TableGenIncludeDirectiveImpl(node);
      }
      else if (type == INTEGER) {
        return new TableGenIntegerImpl(node);
      }
      else if (type == LET_ITEM) {
        return new TableGenLetItemImpl(node);
      }
      else if (type == LET_LIST) {
        return new TableGenLetListImpl(node);
      }
      else if (type == LET_STMT) {
        return new TableGenLetStmtImpl(node);
      }
      else if (type == MULTI_CLASS_ID) {
        return new TableGenMultiClassIDImpl(node);
      }
      else if (type == OBJECT_BODY) {
        return new TableGenObjectBodyImpl(node);
      }
      else if (type == RANGE_LIST) {
        return new TableGenRangeListImpl(node);
      }
      else if (type == RANGE_PIECE) {
        return new TableGenRangePieceImpl(node);
      }
      else if (type == SIMPLE_VALUE) {
        return new TableGenSimpleValueImpl(node);
      }
      else if (type == SUB_CLASS_REF) {
        return new TableGenSubClassRefImpl(node);
      }
      else if (type == TEMPLATE_ARG_LIST) {
        return new TableGenTemplateArgListImpl(node);
      }
      else if (type == TYPE) {
        return new TableGenTypeImpl(node);
      }
      else if (type == VALUE) {
        return new TableGenValueImpl(node);
      }
      else if (type == VALUE_LIST) {
        return new TableGenValueListImpl(node);
      }
      else if (type == VALUE_LIST_NE) {
        return new TableGenValueListNEImpl(node);
      }
      else if (type == VALUE_SUFFIX) {
        return new TableGenValueSuffixImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
