package Adapter;
/**
 * 球员抽象类
 */
abstract class Player {
    String name;

    Player(String name) {
        this.name = name;
    }

    abstract void attack();

    abstract void defense();
}
