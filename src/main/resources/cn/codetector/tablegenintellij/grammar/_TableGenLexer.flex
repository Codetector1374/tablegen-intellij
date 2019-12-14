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

LINE_BREAK=[\r\n]
WHITE_SPACE=[ \t\n\x0B\f\r]+
COMMENTS=("//".*)|("/"\*(.|\n)*\*"/")
IDENTIFIER=[0-9]*[a-zA-Z_]([a-zA-Z_]|[0-9])*
VARNAME=[$][a-zA-Z_]([a-zA-Z_]|[0-9])*
BIN_INT=0b[0-1]+
HEX_INT=0x[0-9a-fA-F]+
DEC_INT=[0-9]+
STRING=\"([^\n\r\"]|\\n|\\\")*\"
CODE_FRAGMENT=\[\{([^]}]*)}]

%%
<YYINITIAL> {
  {WHITE_SPACE}        { return WHITE_SPACE; }

  "bit"                { return KEYWORDBIT; }
  "bits"               { return KEYWORDBITS; }
  "class"              { return KEYWORDCLASS; }
  "code"               { return KEYWORDCODE; }
  "dag"                { return KEYWORDDAG; }
  "def"                { return KEYWORDDEF; }
  "foreach"            { return KEYWORDFOREACH; }
  "defm"               { return KEYWORDDEFM; }
  "field"              { return KEYWORDFIELD; }
  "in"                 { return KEYWORDIN; }
  "int"                { return KEYWORDINT; }
  "let"                { return KEYWORDLET; }
  "list"               { return KEYWORDLIST; }
  "multiclass"         { return KEYWORDMULTICLASS; }
  "string"             { return KEYWORDSTRING; }
  "include"            { return KEYWORDINCLUDE; }

  {LINE_BREAK}         { return LINE_BREAK; }
  {WHITE_SPACE}        { return WHITE_SPACE; }
  {COMMENTS}           { return COMMENTS; }
  {IDENTIFIER}         { return IDENTIFIER; }
  {VARNAME}            { return VARNAME; }
  {BIN_INT}            { return BIN_INT; }
  {HEX_INT}            { return HEX_INT; }
  {DEC_INT}            { return DEC_INT; }
  {STRING}             { return STRING; }
  {CODE_FRAGMENT}      { return CODE_FRAGMENT; }

}

[^] { return BAD_CHARACTER; }
