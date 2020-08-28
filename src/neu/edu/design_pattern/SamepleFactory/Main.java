package neu.edu.design_pattern.SamepleFactory;
import java.util.Scanner;

/***
 *
 */
public class Main{
    public static void main(String[] args) {
        double a;
        double b;
        String string;

        Scanner s = new Scanner(System.in);
        System.out.println("A");
        a = s.nextDouble();
        System.out.println("B");
        b = s.nextDouble();
        System.out.println("operation");
        string = s.next();

        SimpleFactory simpleFactory = new SimpleFactory();
        Operation operation = simpleFactory.makeOperation(string);
        operation.setA(a);
        operation.setB(b);
        double res = operation.getResult();
        System.out.println(res);

    }
}