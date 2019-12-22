package cn.codetector.tablegenintellij.plugin.tablegenlang

import cn.codetector.tablegenintellij.TableGenLexerAdapter
import cn.codetector.tablegenintellij.psi.TableGenTypes
import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.tree.IElementType
import com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey

class TableGenSyntaxHighlighter : SyntaxHighlighterBase() {

    private val tokenHighlighters: MutableMap<IElementType, Array<TextAttributesKey>> = HashMap()

    init {
        // Keywords
        tokenHighlighters[TableGenTypes.KEYWORDDEF] =
            arrayOf(createTextAttributesKey("TABLEGEN_KEYWORDDEF", DefaultLanguageHighlighterColors.KEYWORD))
        tokenHighlighters[TableGenTypes.KEYWORDDEFM] =
            arrayOf(createTextAttributesKey("TABLEGEN_KEYWORDDEFM", DefaultLanguageHighlighterColors.KEYWORD))
        tokenHighlighters[TableGenTypes.KEYWORDIN] =
            arrayOf(createTextAttributesKey("TABLEGEN_KEYWORDIN", DefaultLanguageHighlighterColors.KEYWORD))
        tokenHighlighters[TableGenTypes.KEYWORDLET] =
            arrayOf(createTextAttributesKey("TABLEGEN_KEYWORDLET", DefaultLanguageHighlighterColors.KEYWORD))
        tokenHighlighters[TableGenTypes.KEYWORDCLASS] =
            arrayOf(createTextAttributesKey("TABLEGEN_KEYWORDCLASS", DefaultLanguageHighlighterColors.KEYWORD))

        // INCLUDE
        tokenHighlighters[TableGenTypes.KEYWORDINCLUDE] =
            arrayOf(createTextAttributesKey("TABLEGEN_INCLUDE", DefaultLanguageHighlighterColors.METADATA))

        // Constants
        tokenHighlighters[TableGenTypes.INTEGER] =
            arrayOf(createTextAttributesKey("TABLEGEN_INTLIT", DefaultLanguageHighlighterColors.NUMBER))
        tokenHighlighters[TableGenTypes.STRING] =
            arrayOf(createTextAttributesKey("TABLEGEN_STRINGLIT", DefaultLanguageHighlighterColors.STRING))

        // Comments
        tokenHighlighters[TableGenTypes.COMMENTS] =
            arrayOf(createTextAttributesKey("TABLEGEN_COMMENTS", DefaultLanguageHighlighterColors.BLOCK_COMMENT))
    }

    override fun getTokenHighlights(tokenType: IElementType?): Array<TextAttributesKey> {
        return tokenHighlighters[tokenType] ?: arrayOf()
    }

    override fun getHighlightingLexer(): Lexer = TableGenLexerAdapter()
}