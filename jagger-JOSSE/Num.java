public class Num extends Exp {
    
    public double val_;
    
    public Num (double val){
        val_ = val;
    }

    public void accept(Visitor v){
        v.visit(this);
    }
}
