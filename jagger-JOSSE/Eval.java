import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Eval extends Visitor
{
	public double res = 0.0;
	
	//constructors
	public Eval(Exp e)
	{
		e.accept(this);	
		System.out.println();
	}
	
	public double getRes() { return res; }


	//type
	public void visit(Num n)
	{
		res = n.val_;
	}

    //calcul basic

	//unary 
	public void visit(NegUn n)
	{
		n.val_.accept(this);
		res = -res;
	}
	
	//binary
	public void visit(Add a) 
	{
    	    	a.lhs_.accept(this);
    	    	double temp = res;
    	    	a.rhs_.accept(this);
    	    	res = temp + res;
    	    		
	}
	
	public void visit(Sub s) 
	{
		s.lhs_.accept(this);
    	    	double temp = res;
    	    	s.rhs_.accept(this);
    	    	res = temp - res;	
	}
	
	public void visit(Mul m)
	{
		m.lhs_.accept(this);
    	    	double temp = res;
    	    	m.rhs_.accept(this);
    	    	res = temp * res;
	}
	
	public void visit(Div d)
	{
		d.lhs_.accept(this);
    	    	double temp = res;
    	    	d.rhs_.accept(this);
    	    	res = temp / res;
	}
	
	public void visit(Equal e)
	{
		e.lhs_.accept(this);
		double temp = res;
		e.rhs_.accept(this);
		if(temp == res)
			res = 1;
		else
			res = 0;
	}
	
	public void visit(NotEqual n)
	{
		n.lhs_.accept(this);
		double temp = res;
		n.rhs_.accept(this);
		if(temp != res)
			res = 1;
		else
			res = 0;
	}
	
	public void visit(Inf i)
	{
		i.lhs_.accept(this);
		double temp = res;
		i.rhs_.accept(this);
		if(temp < res)
			res = 1;
		else
			res = 0;
	}
	
	public void visit(InforEqual i)
	{
		i.lhs_.accept(this);
		double temp = res;
		i.rhs_.accept(this);
		if(temp <= res)
			res = 1;
		else
			res = 0;
	}
	
	public void visit(Sup s)
	{
		s.lhs_.accept(this);
		double temp = res;
		s.rhs_.accept(this);
		if(temp > res)
			res = 1;
		else
			res = 0;
	}
	
	public void visit(SuporEqual s)
	{
		s.lhs_.accept(this);
		double temp = res;
		s.rhs_.accept(this);
		if(temp >= res)
			res = 1;
		else
			res = 0;
	}
	
	
	
	
	
	
	
	
}
