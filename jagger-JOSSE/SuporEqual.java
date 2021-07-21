public class SuporEqual extends Exp
{
    public Exp lhs_;
    public Exp rhs_;

	public SuporEqual(Exp lhs, Exp rhs)
	{
		lhs_ = lhs;
		rhs_ = rhs;
	}

    public void accept(Visitor v)
    {
        v.visit(this);
    }
}
