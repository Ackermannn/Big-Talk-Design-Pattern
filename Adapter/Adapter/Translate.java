package Adapter;

/**
 * 适配器--翻译类
 */
class Translate extends Player {
    private final ForeignCenter foreignCenter;

    Translate(String name) {
        super(name);
        foreignCenter = new ForeignCenter();
        foreignCenter.setName(name);
    }

    @Override
    void attack() {
        foreignCenter.jinGong();
    }

    @Override
    void defense() {
        foreignCenter.fangShou();
    }
}
