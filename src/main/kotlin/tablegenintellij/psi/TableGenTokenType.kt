package tablegenintellij.psi

import com.intellij.psi.tree.IElementType
import tablegenintellij.TableGenLanguage

class TableGenTokenType(debugName: String) : IElementType(debugName, TableGenLanguage) {
    override fun toString(): String = "TableGenTokenType.${super.toString()}"
}