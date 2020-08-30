package neu.edu.design_pattern.Flyweight;

/**
 * 客户端代码
 */
public class Main {
    public static void main(String[] args) {
        WebsiteFactory f = new WebsiteFactory();
        WebSite fx = f.getWebsiteCategory("产品展示");
        fx.use(new User("小菜"));

        WebSite fy = f.getWebsiteCategory("产品展示");
        fy.use(new User("大鸟"));

        WebSite fz = f.getWebsiteCategory("产品展示");
        fz.use(new User("娇娇"));

        WebSite fl = f.getWebsiteCategory("blog");
        fl.use(new User("XXX"));

        WebSite fm = f.getWebsiteCategory("blog");
        fm.use(new User("yyy"));

        WebSite fn = f.getWebsiteCategory("blog");
        fn.use(new User("ZZZ"));

        System.out.println("得到的网站分类总数为："+f.getWebSiteCount());
    }
}
