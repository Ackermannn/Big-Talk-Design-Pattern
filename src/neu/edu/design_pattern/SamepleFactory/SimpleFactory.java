package neu.edu.design_pattern.SamepleFactory;

/**
 * 简单工厂模式
 */
class SimpleFactory {
    Operation makeOperation(String s) {
        if ("+".equals(s)) return new OperationAdd();
        else if ("-".equals(s)) return new OperationMinus();
        else
            return null;
    }
}
