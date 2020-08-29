package neu.edu.design_pattern.Bridge;

/**
 * 桥接模式
 */
public class Main {
    public static void main(String[] args) {
        Abstraction ab = new RefinedAbstraction();
        ab.setImp(new ConcreteImplementorA());
        ab.Operation();

        ab.setImp(new ConcreteImplementorB());
        ab.Operation();

    }
}
