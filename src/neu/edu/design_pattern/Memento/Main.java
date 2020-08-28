package neu.edu.design_pattern.Memento;

/**
 * 备忘录模式
 */
public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.show();

        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(hero.createMemento()); // 备份一下

        hero.fight(); // 战斗！
        hero.show();

        System.out.println("读档");
        hero.setMemento(caretaker.getMemento());
        hero.show();

    }
}
