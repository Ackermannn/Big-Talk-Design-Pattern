package neu.edu.design_pattern.Visitor;

public class Main {
    public static void main(String[] args) {
        ObjectStructure o = new ObjectStructure();
        o.attach(new Man());
        o.attach(new Woman());

        // 成功时的反应
        Success v1 = new Success();
        o.display(v1);
    }
}
