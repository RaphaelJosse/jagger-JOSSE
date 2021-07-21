public abstract class Visitor
{
    	abstract void visit(Num n);


	abstract void visit(NegUn n);
    	abstract void visit(Add a);
    	abstract void visit(Sub s);
    	abstract void visit(Mul m);
    	abstract void visit(Div d);
    	
    	abstract void visit(Equal e);
    	abstract void visit(NotEqual n);
    	abstract void visit(Inf i);
    	abstract void visit(InforEqual i);
    	abstract void visit(Sup s);
    	abstract void visit(SuporEqual s);
}
