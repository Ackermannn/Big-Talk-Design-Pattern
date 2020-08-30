package neu.edu.design_pattern.Mediator;

/**
 * 国家
 */
public abstract class Country {
    protected UnitedNations mediator;
    public Country(UnitedNations mediator){
        this.mediator = mediator;
    }


    public void declare(String message){
        mediator.declare(message, this); // 声明到联合国去说！
    }

    public abstract void getMessage(String message);
}
