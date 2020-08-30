package neu.edu.design_pattern.Mediator;

public class UnitedNationsSecurityCouncil extends UnitedNations{
    private Country usa;
    private Country iraq;
    public void setUsa(Country usa) {
        this.usa = usa;
    }

    public void setIraq(Country iraq) {
        this.iraq = iraq;
    }


    @Override
    public void declare(String message, Country colleague) {
        if (colleague == usa){
            iraq.getMessage(message); // 伊拉克在联合国，并听到了美国说的话
        }else if (colleague == iraq){
            usa.getMessage(message);
        }
    }


}
