public class Sub extends Exp
{
    public Exp lhs_;
    public Exp rhs_;

	public Sub(Exp lhs, Exp rhs)
	{
		lhs_ = lhs;
		rhs_ = rhs;
	}

    public void accept(Visitor v)
    {
        v.visit(this);
    }
}
