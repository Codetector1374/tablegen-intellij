package cn.codetector.tablegenintellij

import cn.codetector.tablegenintellij.grammar._TableGenLexer
import com.intellij.lexer.FlexAdapter

class TableGenLexerAdapter : FlexAdapter(_TableGenLexer())