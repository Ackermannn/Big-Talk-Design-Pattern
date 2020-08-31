package neu.edu.design_pattern.Visitor;

/**
 * 状态抽象类
 */
public abstract class Action {
    public abstract void getConclusion(Man concreteElementA);
    public abstract void getConclusion(Woman concreteElementB);
}
