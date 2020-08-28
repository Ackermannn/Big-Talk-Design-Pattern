package neu.edu.design_pattern.Adapter;

class Forward extends Player {

    Forward(String name) {
        super(name);
    }

    @Override
    void attack() {
        System.out.printf("前锋 %s 进攻\n", name);
    }

    @Override
    void defense() {
        System.out.printf("前锋 %s 防守\n", name);
    }
}
