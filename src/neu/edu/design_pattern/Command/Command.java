package neu.edu.design_pattern.Command;


public abstract class Command {

    protected Receiver receiver;
    public Command(Receiver rec){
        receiver = rec;
    }

    abstract public void execute();
}
