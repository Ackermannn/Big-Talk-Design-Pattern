package neu.edu.design_pattern.ChainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        CommonManager jinji = new CommonManager("金利");
        Majordomo zongjian = new Majordomo("宗剑");
        GeneralManager zhongjingli = new GeneralManager("钟精励");

        jinji.setSuperior(zongjian); // 设置上级
        zongjian.setSuperior(zhongjingli);// 设置上级

        System.out.println("---新请求---");
        Request request = new Request();
        request.setRequestType("请假");
        request.setRequestContent("小菜请假");
        request.setNumber(1);

        jinji.requestApplication(request); // 客户端中申请都是从  经理发起，但是实际决策有具体管理类处理，客户端不知道。

        System.out.println("---新请求---");
        request.setRequestType("请假");
        request.setRequestContent("小菜请假");
        request.setNumber(4);

        jinji.requestApplication(request);

        System.out.println("---新请求---");
        request.setRequestType("加薪");
        request.setRequestContent("小菜请求加薪");
        request.setNumber(500);

        jinji.requestApplication(request);

        System.out.println("---新请求---");
        request.setRequestType("加薪");
        request.setRequestContent("小菜请求加薪");
        request.setNumber(1000);

        jinji.requestApplication(request);


    }
}
