package neu.edu.design_pattern.Command;

/**
 * 命令模式
 */
public class Main {
    public static void main(String[] args) {
        Receiver r = new Receiver();
        Command c = new ConcreteCommand(r);
        Invoker i = new Invoker();

        i.setCommand(c);
        i.executeCommand();

    }
}
