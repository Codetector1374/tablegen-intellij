// This is a generated file. Not intended for manual editing.
package cn.codetector.tablegenintellij.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface TableGenBodyItem extends PsiElement {

  @Nullable
  TableGenDeclaration getDeclaration();

  @Nullable
  TableGenRangeList getRangeList();

  @Nullable
  TableGenValue getValue();

  @Nullable
  PsiElement getIdentifier();

}
