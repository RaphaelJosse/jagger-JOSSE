public abstract class Visitor
{
    	abstract void visit(Num n);


	abstract void visit(NegUn n);
    	abstract void visit(Add a);
    	abstract void visit(Sub s);
    	abstract void visit(Mul m);
    	abstract void visit(Div d);
}
