package neu.edu.design_pattern.ChainOfResponsibility;

/**
 * 经理
 */
public class CommonManager extends Manager {
    public CommonManager(String name) {
        super(name);
    }

    @Override
    public void requestApplication(Request request) {
        if ("请假".equals(request.getRequestType()) && request.getNumber() <= 2) {
            System.out.printf("%s: %s 数量 %d 被批准\n",
                    name, request.getRequestContent(), request.getNumber());
        }
        else {

            if (superior != null) {
                System.out.printf("%s: 这事儿我问问上级\n", name);
                superior.requestApplication(request);
            }
        }
    }
}
