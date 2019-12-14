package cn.codetector.tablegenintellij

import cn.codetector.tablegenintellij.plugin.TableGenFileType
import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider
import javax.swing.Icon

class TableGenFile(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, TableGenLanguage.INSTANCE) {
    override fun getFileType(): FileType {
        return TableGenFileType.INSTANCE;
    }

    override fun toString(): String {
        return "TableGen File"
    }
}