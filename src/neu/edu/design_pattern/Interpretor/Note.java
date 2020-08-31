package neu.edu.design_pattern.Interpretor;

/**
 * 音符类  TerminalExpression
 */
public class Note extends Expression {
    @Override
    public void execute(String key, double value) {
        String note = switch (key) {
            case "C" -> "1";
            case "D" -> "2";
            case "E" -> "3";
            case "F" -> "4";
            case "G" -> "5";
            case "A" -> "6";
            case "B" -> "7";
            default -> "";
        };
        System.out.println(note);
    }
}
