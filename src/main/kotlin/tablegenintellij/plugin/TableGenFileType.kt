package tablegenintellij.plugin

import tablegenintellij.TableGenLanguage
import com.intellij.openapi.fileTypes.LanguageFileType
import javax.swing.Icon

class TableGenFileType : LanguageFileType(TableGenLanguage) {
    companion object {
        @JvmField
        val INSTANCE = TableGenFileType()
    }

    override fun getIcon(): Icon? = TableGenIcons.FILEICON

    override fun getName(): String = "TableGen File"

    override fun getDescription(): String = "LLVM TableGen DSL File"

    override fun getDefaultExtension(): String = "td"

}