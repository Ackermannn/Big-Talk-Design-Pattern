package neu.edu.design_pattern.Visitor;

public class Man extends Person {
    @Override
    public void accept(Action visitor) {
        visitor.getConclusion(this);
    }
}
