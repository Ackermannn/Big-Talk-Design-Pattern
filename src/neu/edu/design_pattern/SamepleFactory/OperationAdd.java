package neu.edu.design_pattern.SamepleFactory;

/**
 * 加类
 */
class OperationAdd extends Operation {
    @Override
    double getResult() {
        return this.a + this.b;
    }
}
