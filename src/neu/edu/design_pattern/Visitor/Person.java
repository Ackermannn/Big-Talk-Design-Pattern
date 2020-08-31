package neu.edu.design_pattern.Visitor;

/**
 *
 */
public abstract class Person {
    /**
     *
     * @param visitor 用来获得状态对象
     */
    public abstract void accept(Action visitor);
}
