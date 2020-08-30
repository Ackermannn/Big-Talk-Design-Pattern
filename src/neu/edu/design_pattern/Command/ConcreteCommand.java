package neu.edu.design_pattern.Command;

public class ConcreteCommand extends Command{
    public ConcreteCommand(Receiver rec){
        super(rec);
    }
    @Override
    public void execute(){
        receiver.Action();
    }
}
