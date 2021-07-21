  public class NegUn extends Exp // or Unaire ?
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
