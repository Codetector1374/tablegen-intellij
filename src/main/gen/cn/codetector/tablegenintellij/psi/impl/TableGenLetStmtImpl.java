// This is a generated file. Not intended for manual editing.
package cn.codetector.tablegenintellij.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static cn.codetector.tablegenintellij.psi.TableGenTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import cn.codetector.tablegenintellij.psi.*;

public class TableGenLetStmtImpl extends ASTWrapperPsiElement implements TableGenLetStmt {

  public TableGenLetStmtImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull TableGenVisitor visitor) {
    visitor.visitLetStmt(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof TableGenVisitor) accept((TableGenVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<TableGenClassStmt> getClassStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, TableGenClassStmt.class);
  }

  @Override
  @NotNull
  public List<TableGenDefStmt> getDefStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, TableGenDefStmt.class);
  }

  @Override
  @NotNull
  public List<TableGenDefmStmt> getDefmStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, TableGenDefmStmt.class);
  }

  @Override
  @NotNull
  public List<TableGenIncludeDirective> getIncludeDirectiveList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, TableGenIncludeDirective.class);
  }

  @Override
  @NotNull
  public TableGenLetList getLetList() {
    return findNotNullChildByClass(TableGenLetList.class);
  }

  @Override
  @NotNull
  public List<TableGenLetStmt> getLetStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, TableGenLetStmt.class);
  }

}
