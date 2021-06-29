  public class NegUn extends Unaire
{
    public Exp val_;

    public NegUn(Exp val)
    {
        val_ = val;
    }

    public void accept(Visitor v)
    {
        v.visit(this);
    }

}