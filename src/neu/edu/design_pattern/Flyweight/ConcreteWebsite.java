package neu.edu.design_pattern.Flyweight;

/**
 * 具体网站
 */
public class ConcreteWebsite extends WebSite {
    private String name = "";

    public ConcreteWebsite(String name) {
        this.name = name;
    }

    @Override
    public void use(User user) {
        System.out.println("网站分类：" + name + "用户：" + user.getName());
    }
}