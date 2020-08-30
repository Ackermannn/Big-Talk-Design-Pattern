package neu.edu.design_pattern.ChainOfResponsibility;

public class GeneralManager extends Manager {
    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void requestApplication(Request request) {
        if ("请假".equals(request.getRequestType())) {// 总经理可准许下属任意天的假期
            System.out.printf("%s: %s 数量 %d 被批准\n",
                    name, request.getRequestContent(), request.getNumber());
        } else if ("加薪".equals(request.getRequestType()) && request.getNumber() <= 500) {// 加薪在500内 没问题
            System.out.printf("%s: %s 数量 %d 被批准\n",
                    name, request.getRequestContent(), request.getNumber());
        } else if ("加薪".equals(request.getRequestType()) && request.getNumber() > 500) {// 超了500就要考虑一下
            System.out.printf("%s: %s 数量 %d 再说吧\n",
                    name, request.getRequestContent(), request.getNumber());
        }
    }
}
