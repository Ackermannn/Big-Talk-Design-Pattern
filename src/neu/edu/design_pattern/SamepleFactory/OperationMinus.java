package neu.edu.design_pattern.SamepleFactory;

/**
 * 减类
 */
class OperationMinus extends Operation {
    @Override
    double getResult() {
        return this.a - this.b;
    }
}
