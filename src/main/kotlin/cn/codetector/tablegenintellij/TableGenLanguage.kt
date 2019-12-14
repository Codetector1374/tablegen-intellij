package cn.codetector.tablegenintellij

import com.intellij.lang.Language

class TableGenLanguage: Language("TableGen") {
    companion object {
        @JvmStatic
        val INSTANCE = TableGenLanguage()
    }
}