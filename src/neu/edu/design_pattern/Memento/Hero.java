package neu.edu.design_pattern.Memento;

/**
 * 游戏英雄
 */
public class Hero {
    private int vitality; // 体力
    private int attack; // 攻击力
    private int defence; // 防御力

    public Hero() {
        System.out.println("建立了一个新英雄属性自动初始化......");
        vitality = 100;
        attack = 100;
        defence = 100;
    }

    public void setVitality(int vitality) {
        this.vitality = vitality;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public void show() {
        System.out.println("角色状态：");
        System.out.printf("体力：%d\n", vitality);
        System.out.printf("攻击力：%d\n", attack);
        System.out.printf("防御力：%d\n", defence);

    }

    public void fight() {
        System.out.println("角色进行了战斗。损失了一些属性。");
        vitality = 0;
        attack = 0;
        defence = 0;
    }
    public Memento createMemento(){
        return new Memento(vitality, attack, defence);

    }
    public void setMemento(Memento memento){
        setAttack(memento.getAttack());
        setVitality(memento.getVitality());
        setDefence(memento.getDefence());
    }

}
