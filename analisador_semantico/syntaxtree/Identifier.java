package analisador_semantico.syntaxtree;
import analisador_semantico.visitor.*;
import traducao.visitor.VisitorIR;

public class Identifier {
  public String s;

  public Identifier(String as) { 
    s=as;
  }

  public void accept(Visitor v) {
    v.visit(this);
  }

  public Type accept(TypeVisitor v) {
    return v.visit(this);
  }
  public traducao.FragAux.Exp accept(VisitorIR v) {
    return v.visit(this);
  }

  public String toString() {
    return this.s;
  }
}
