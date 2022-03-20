package 设计模式.装饰器模式.V2;

public class Test {
    public static void main(String[] args) {
        BatterCake batterCake = new BaseBatterCake();
        batterCake = new EggBatterCakeDecerator(batterCake)


        System.out.println(batterCake.getMsg() + "," + batterCake.getPrice());
    }
}
