package neu.edu.design_pattern.Visitor;

public class Woman extends Person{
    public void accept(Action visitor) {
        visitor.getConclusion(this);
    }
}
