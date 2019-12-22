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

public class TableGenTypeImpl extends ASTWrapperPsiElement implements TableGenType {

  public TableGenTypeImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull TableGenVisitor visitor) {
    visitor.visitType(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof TableGenVisitor) accept((TableGenVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public TableGenClassID getClassID() {
    return findChildByClass(TableGenClassID.class);
  }

  @Override
  @Nullable
  public TableGenInteger getInteger() {
    return findChildByClass(TableGenInteger.class);
  }

  @Override
  @Nullable
  public TableGenType getType() {
    return findChildByClass(TableGenType.class);
  }

}
