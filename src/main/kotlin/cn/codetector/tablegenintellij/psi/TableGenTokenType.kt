package cn.codetector.tablegenintellij.psi

import com.intellij.psi.tree.IElementType
import cn.codetector.tablegenintellij.TableGenLanguage

class TableGenTokenType(debugName: String) : IElementType(debugName, TableGenLanguage.INSTANCE) {
    override fun toString(): String = "TableGenTokenType.${super.toString()}"
}