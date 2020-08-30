package neu.edu.design_pattern.Mediator;

/**
 * 伊拉克
 */
public class Iraq extends Country {

    public Iraq(UnitedNations mediator) {
        super(mediator);
    }

    @Override
    public void getMessage(String message) {
        System.out.println("伊拉克获得对方信息：" + message);
    }
}
