package neu.edu.design_pattern.Composite;

/**
 * 组合模式
 */
public class Main {

    public static void main(String[] args) {
        ConcreteCompany root = new ConcreteCompany("北京总公司");
        root.add(new HRDepartment("总公司人力资源部"));
        root.add(new FianceDepartment("总公司财务部"));

        ConcreteCompany comp = new ConcreteCompany("上海分公司");
        comp.add(new HRDepartment("上海分公司人力资源部"));
        comp.add(new FianceDepartment("上海分公司财务部"));

        root.add(comp);

        ConcreteCompany comp1 = new ConcreteCompany("南京办事处");
        comp1.add(new HRDepartment("南京办事处人力资源部"));
        comp1.add(new FianceDepartment("南京办事处财务部"));
        comp.add(comp1);

        ConcreteCompany comp2 = new ConcreteCompany("杭州办事处");
        comp2.add(new HRDepartment("杭州办事处人力资源部"));
        comp2.add(new FianceDepartment("杭州办事处财务部"));
        comp.add(comp2);

        System.out.println("\n结构图");
        root.display(0);

        System.out.println("\n职责:");
        root.lineOfDuty();
    }
}