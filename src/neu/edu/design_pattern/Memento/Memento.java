package neu.edu.design_pattern.Memento;

public class Memento {
    private int vitality;
    private int attack;
    private int defence;

    public Memento(int vitality, int attack, int defence) {
        this.vitality = vitality;
        this.attack = attack;
        this.defence = defence;
    }

    public int getVitality() {
        return vitality;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefence() {
        return defence;
    }
}
