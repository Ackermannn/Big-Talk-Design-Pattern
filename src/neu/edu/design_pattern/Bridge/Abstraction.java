package neu.edu.design_pattern.Bridge;

public class Abstraction {
    protected Implementor imp;
    public void setImp(Implementor imp){
        this.imp = imp;

    }
    public void  Operation(){
        imp.operation();
    }
}
