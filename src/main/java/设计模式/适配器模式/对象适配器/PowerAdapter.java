package 设计模式.适配器模式.对象适配器;

public class PowerAdapter implements DC5{

    private AC220 adaptee;

    public PowerAdapter(AC220 adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public int output5V() {
        return adaptee.outputAC220() / 44;
    }
}
