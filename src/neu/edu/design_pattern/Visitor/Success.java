package neu.edu.design_pattern.Visitor;

/**
 * 成功状态
 */
public class Success extends Action {
    @Override
    public void getConclusion(Man concreteElementA) {
        System.out.printf("%s %s 时，背后多半有一个伟大的女人。\n", concreteElementA.getClass().getName(), this.getClass().getName());
    }

    @Override
    public void getConclusion(Woman concreteElementB) {
        System.out.printf("%s %s 时，背后多半有一个不成功的男人。\n", concreteElementB.getClass().getName(), this.getClass().getName());
    }
}
