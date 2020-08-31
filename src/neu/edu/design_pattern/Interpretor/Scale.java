package neu.edu.design_pattern.Interpretor;

/**
 * 音阶类 TerminalExpression
 */
public class Scale extends Expression {
    public void execute(String key, double value) {
        String scale = switch ((int) value) {
            case 1 -> "低音";
            case 2 -> "中音";
            case 3 -> "高音";

            default -> throw new IllegalStateException("Unexpected value: " + (int) value);
        };
        System.out.println(scale);
    }
}
