package cn.codetector.tablegenintellij.plugin

import cn.codetector.tablegenintellij.TableGenLanguage
import com.intellij.openapi.fileTypes.LanguageFileType
import javax.swing.Icon

class TableGenFileType : LanguageFileType(TableGenLanguage.INSTANCE) {
    companion object {
        @JvmField
        val INSTANCE = TableGenFileType()
    }

    override fun getIcon(): Icon? =
        TableGenIcons.FILEICON

    override fun getName(): String = "TableGen File"

    override fun getDescription(): String = "LLVM TableGen DSL File"

    override fun getDefaultExtension(): String = "td"

}