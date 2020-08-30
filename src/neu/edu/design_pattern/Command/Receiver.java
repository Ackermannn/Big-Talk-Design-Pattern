package neu.edu.design_pattern.Command;

/**
 * 知道如何实施与执行一个与请求相关的操作，任何类都可以成为一个接收者
 */
public class Receiver {
    public void Action(){
        System.out.println("执行请求！");
    }
}
