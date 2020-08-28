package neu.edu.design_pattern.Adapter;

/**
 * 外籍中锋
 */
class ForeignCenter {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void jinGong() {
        System.out.printf("外籍中锋 %s 进攻\n", name);
    }

    void fangShou() {
        System.out.printf("外籍中锋 %s 防守\n", name);
    }
}
