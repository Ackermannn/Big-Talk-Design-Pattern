package neu.edu.design_pattern.Interpretor;

public class Main {
    public static void main(String[] args) {
        PlayContext context = new PlayContext();
        // 音乐上海滩
        System.out.println("上海滩：");
        context.setPlayText("O 2 E 0.5 G 0.5 A 3 E 0.5 G 0.5 D 3 E 0.5 G 0.5 ");
        Expression expression = null;
        try {
            while (context.getPlayText().length() > 0) {
                String str = context.getPlayText().substring(0, 1);
                switch (str) {
                    case "O" -> expression = new Scale();
                    case "C", "D", "E", "F", "G", "A", "B", "P" -> expression = new Note();
                }
                assert expression != null;
                expression.interpret(context);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }
}
