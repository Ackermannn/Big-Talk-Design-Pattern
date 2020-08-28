package neu.edu.design_pattern.SamepleFactory;

/**
 * 抽象运算类
 */
abstract class Operation {
    double a;
    double b;

    void setA(double a) {
        this.a = a;
    }

    void setB(double b) {
        this.b = b;
    }

    abstract double getResult();
}
