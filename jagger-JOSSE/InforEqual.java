public class InforEqual extends Exp
{
    public Exp lhs_;
    public Exp rhs_;

	public InforEqual(Exp lhs, Exp rhs)
	{
		lhs_ = lhs;
		rhs_ = rhs;
	}

    public void accept(Visitor v)
    {
        v.visit(this);
    }
}
