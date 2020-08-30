package neu.edu.design_pattern.ChainOfResponsibility;

/**
 * 总监
 */
public class Majordomo extends Manager{

    public Majordomo(String name) {
        super(name);
    }

    @Override
    public void requestApplication(Request request) {
        if ("请假".equals(request.getRequestType()) && request.getNumber() <= 5) {
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
