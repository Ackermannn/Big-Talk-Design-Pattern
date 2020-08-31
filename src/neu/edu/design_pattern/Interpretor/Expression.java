package neu.edu.design_pattern.Interpretor;

/**
 * 表达式类
 */
public abstract class Expression {
    public void interpret(PlayContext context) {
        if (context.getPlayText().length() == 0)
            return;
        else {
            String playKey = context.getPlayText().substring(0, 1);
            context.setPlayText(context.getPlayText().substring(2));
            double playValue = Double.parseDouble(context.getPlayText().substring(0, context.getPlayText().indexOf(' ')));
            context.setPlayText(context.getPlayText().substring(context.getPlayText().indexOf(' ') + 1));
            execute(playKey, playValue);
        }
    }
    public abstract void execute(String key, double value);
}
