package 设计模式.装饰器模式.V2;

public class EggBatterCakeDecerator extends BatterCakeDecerator {

    public EggBatterCakeDecerator(BatterCake batterCake) {
        super(batterCake);
    }

    @Override
    protected String getMsg() {
        return super.getMsg() + "1个鸡蛋";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 1;
    }
}
