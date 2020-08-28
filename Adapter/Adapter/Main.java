package Adapter;
/*
  大话数据结构--17章 适配器模式
  <p>
  本章节用姚明去NBA打篮球需要翻译的例子解释了适配器模式
 */

/**
 * 客户端
 */
public class Main {
    public static void main(String[] args) {
        Player a = new Forward("巴蒂尔");
        a.attack();
        a.defense();

        Player b = new Center("Tom");
        b.attack();
        b.defense();

        Player c = new Translate("姚明");
        c.attack();
        c.defense();

    }

}
