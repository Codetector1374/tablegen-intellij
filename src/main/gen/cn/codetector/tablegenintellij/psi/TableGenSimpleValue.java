// This is a generated file. Not intended for manual editing.
package cn.codetector.tablegenintellij.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface TableGenSimpleValue extends PsiElement {

  @Nullable
  TableGenClassID getClassID();

  @Nullable
  TableGenDagArg getDagArg();

  @Nullable
  TableGenDagArgList getDagArgList();

  @Nullable
  TableGenInteger getInteger();

  @Nullable
  TableGenType getType();

  @Nullable
  TableGenValueList getValueList();

  @Nullable
  TableGenValueListNE getValueListNE();

  @Nullable
  PsiElement getCodeFragment();

  @Nullable
  PsiElement getIdentifier();

  @Nullable
  PsiElement getString();

}
