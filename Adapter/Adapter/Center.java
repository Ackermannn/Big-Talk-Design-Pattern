package Adapter;

class Center extends Player {
    Center(String name) {
        super(name);
    }

    @Override
    void attack() {
        System.out.printf("中锋 %s 进攻\n", name);
    }

    @Override
    void defense() {
        System.out.printf("中锋 %s 防守\n", name);
    }
}
