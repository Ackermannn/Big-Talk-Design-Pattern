package neu.edu.design_pattern.Mediator;

/**
 * 美国
 */
public class USA extends Country {
    public USA(UnitedNations mediator) {
        super(mediator);
    }

    @Override
    public void getMessage(String message) {
        System.out.println("美国获得对方信息：" + message);
    }
}
