package neu.edu.design_pattern.ChainOfResponsibility;

/**
 * 抽象管理者类
 */
public abstract class Manager {
    protected String name;
    protected Manager superior; // 管理者的上级
    public Manager(String name){ this.name = name;}

    // 设置管理者的上级
    public void setSuperior(Manager superior) {
        this.superior = superior;
    }

    //申请请求
    abstract public void requestApplication(Request request);
}
