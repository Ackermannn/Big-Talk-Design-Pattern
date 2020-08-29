package neu.edu.design_pattern.Bridge;

public class RefinedAbstraction extends Abstraction{
    @Override
    public void Operation(){
        imp.operation();
    }
}
