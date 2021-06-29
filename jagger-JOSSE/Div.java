public class Div extends Exp
{
    public Exp lhs_;
    public Exp rhs_;

	public Div(Exp lhs, Exp rhs)
	{
		lhs_ = lhs;
		rhs_ = rhs;
	}

    public void accept(Visitor v)
    {
        v.visit(this);
    }
}