package cn.codetector.tablegenintellij.psi

import com.intellij.psi.tree.IElementType
import cn.codetector.tablegenintellij.TableGenLanguage

class TableGenElementType(debugName: String): IElementType(debugName,
    TableGenLanguage.INSTANCE
) {
}