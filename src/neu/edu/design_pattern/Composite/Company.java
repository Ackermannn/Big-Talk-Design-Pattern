package neu.edu.design_pattern.Composite;

/**
 * 公司类 抽象类或接口
 */
public abstract class Company {
    protected String name;

    public Company(String name){
        this.name = name;
    }

    public abstract void add(Company company);
    public abstract void remove(Company company);
    public abstract void display(int depth);
    public abstract void lineOfDuty();

}
