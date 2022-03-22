package 设计模式.适配器模式.接口适配器;

public class PowerAdapter extends AbstractPowerAdapter {
    @Override
    public int output5V() {
        return super.output5V() + 1;
    }
}
