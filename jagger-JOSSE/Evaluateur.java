import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Eval extends Visitor
{
	private double res = 0.0;
	private String resS;

	//constructors
	public Eval(Exp e)
	{
		e.accept(this);	
		System.out.println();
	}
	
	public double getRes() { return res; }

	public void visit(Num n) 
	{
		res = n.val_;
		resS = Double.toString(res);
	}

	//type
	public void visit(Num n)
	{
		res = n.val_;
		resS = Double.toString(res);
	}

    //calcul basic

	//unary 
	public void visit(NegUn n)
	{
		n.val_.accept(this);
		res = -res;
		sRes = Double.toString(res);
	}
	
	//binary
	public void visit(Add a) 
	{
    	    	resS = Double.toString(a.lhs_.accept(this) + a.rhs_.accept(this));	
	}
	
	public void visit(Sub s) 
	{
		resS = Double.toString(s.lhs_.accept(this) - s.rhs_.accept(this));	
	}
	
	public void visit(Mul m)
	{
		resS = Double.toString(m.lhs_.accept(this) * m.rhs_.accept(this));
	}
	
	public void visit(Div d)
	{
		resS = Double.toString(d.lhs_.accept(this) / d.rhs_.accept(this))
	}
}
