package tablegenintellij.psi

import com.intellij.psi.tree.IElementType
import tablegenintellij.TableGenLanguage

class TableGenElementType(debugName: String): IElementType(debugName, TableGenLanguage) {
}