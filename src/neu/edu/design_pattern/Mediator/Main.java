package neu.edu.design_pattern.Mediator;

/**
 * 大话设计模式中给出了联合国调停 美国和伊拉克的例子
 */
public class Main {
    public static void main(String[] args) {
        UnitedNationsSecurityCouncil un = new UnitedNationsSecurityCouncil();
        Country usa = new USA(un);
        Country iraq = new Iraq(un);

        un.setUsa(usa);
        un.setIraq(iraq);

        usa.declare("不准研制核武器，否则要发动战争");
        iraq.declare("我们没有核武器，也不怕侵略！");

    }
}
