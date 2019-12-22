package cn.codetector.tablegenintellij.plugin.tablegenlang

import com.intellij.lang.Commenter

class TableGenCommenter : Commenter {
    override fun getCommentedBlockCommentPrefix(): String? {
        return "/*";
    }

    override fun getCommentedBlockCommentSuffix(): String? {
        return "*/"
    }

    override fun getBlockCommentPrefix(): String? {
        return "/*"
    }

    override fun getBlockCommentSuffix(): String? {
        return "/*"
    }

    override fun getLineCommentPrefix(): String? {
        return "//"
    }
}