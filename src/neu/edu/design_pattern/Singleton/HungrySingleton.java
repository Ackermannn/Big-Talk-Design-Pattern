package neu.edu.design_pattern.Singleton;

/**
 * 饿汉式单例模式
 *
 * 在类初始化时，已经自行实例化。
 */
public class HungrySingleton {
    private static final HungrySingleton hungrySingleton= new HungrySingleton();

    private HungrySingleton(){

    }

    public HungrySingleton getInstance(){
        return hungrySingleton;
    }
}
