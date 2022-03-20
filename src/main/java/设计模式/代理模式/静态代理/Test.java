package 设计模式.代理模式.静态代理;

public class Test  {
    public static void main(String[] args) {
        ZhangLaoSan zhangLaoSan = new ZhangLaoSan(new Zhangsan());
        zhangLaoSan.findLove();
    }
}
