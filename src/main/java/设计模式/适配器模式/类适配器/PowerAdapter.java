package 设计模式.适配器模式.类适配器;

public class PowerAdapter extends AC220 implements DC5 {
    @Override
    public int output5V() {
        int adapter = super.outputAC220();
        int adapterOutput = adapter / 44;
        return adapterOutput;
    }
}
