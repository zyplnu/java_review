package 设计模式.适配器模式.接口适配器;

public abstract class AbstractPowerAdapter implements DC {

    @Override
    public int output5V() {
        return 5;
    }

    @Override
    public int output15V() {
        return 0;
    }

    @Override
    public int output25V() {
        return 0;
    }

    @Override
    public int output35V() {
        return 0;
    }
}
