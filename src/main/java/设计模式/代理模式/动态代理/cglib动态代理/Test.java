package 设计模式.代理模式.动态代理.cglib动态代理;

public class Test {
    public static void main(String[] args) {
        Zhangsan zhangsan = (Zhangsan) new CglibMeiPo().getInstance(Zhangsan.class);
        zhangsan.findLove();
    }
}
