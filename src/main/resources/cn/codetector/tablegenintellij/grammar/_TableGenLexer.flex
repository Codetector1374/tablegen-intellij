package cn.codetector.tablegenintellij.grammar;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static cn.codetector.tablegenintellij.psi.TableGenTypes.*;

%%

%{
  public _TableGenLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _TableGenLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL=\R
WHITE_SPACE=\s+

LINE_COMMENT="//".*
BLOCK_COMMENT="/"\*(.|\n)*\*"/"
IDENTIFIER=[0-9]*[a-zA-Z_]([a-zA-Z_]|[0-9])*
VARNAME=[$][a-zA-Z_]([a-zA-Z_]|[0-9])*

%%
<YYINITIAL> {
  {WHITE_SPACE}        { return WHITE_SPACE; }

  "-"                  { return MINUS; }
  "+"                  { return PLUS; }
  "["                  { return LBRACKET; }
  "]"                  { return RBRACKET; }
  "{"                  { return LCURLY; }
  "}"                  { return RCURLY; }
  "("                  { return LPARN; }
  ")"                  { return RPARN; }
  "<"                  { return LT; }
  ">"                  { return GT; }
  ":"                  { return COLON; }
  ";"                  { return SEMI; }
  "."                  { return DOT; }
  "="                  { return EQUALS; }
  "?"                  { return QUESTION; }
  "#"                  { return HASH; }

  {LINE_COMMENT}       { return LINE_COMMENT; }
  {BLOCK_COMMENT}      { return BLOCK_COMMENT; }
  {IDENTIFIER}         { return IDENTIFIER; }
  {VARNAME}            { return VARNAME; }

}

[^] { return BAD_CHARACTER; }
