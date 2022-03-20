package 设计模式.装饰器模式.V2;

public class BatterCakeDecerator extends BatterCake {

    private BatterCake batterCake;

    public BatterCakeDecerator(BatterCake batterCake) {
        this.batterCake = batterCake;
    }

    @Override
    protected String getMsg() {
        return this.batterCake.getMsg();
    }

    @Override
    public int getPrice() {
        return this.batterCake.getPrice();
    }
}
