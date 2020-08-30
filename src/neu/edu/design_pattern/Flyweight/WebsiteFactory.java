package neu.edu.design_pattern.Flyweight;

import java.util.HashMap;
import java.util.Hashtable;

/**
 * 网站工厂
 */
public class WebsiteFactory {
    private HashMap<String, WebSite> flyweight = new HashMap<>();

    public WebSite getWebsiteCategory(String key) {
        if (!flyweight.containsKey(key)) {
            flyweight.put(key, new ConcreteWebsite(key));

        }
        return flyweight.get(key);

    }

    public int getWebSiteCount() {
        return flyweight.size();
    }

}
