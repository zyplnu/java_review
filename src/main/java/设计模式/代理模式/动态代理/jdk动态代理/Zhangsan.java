package 设计模式.代理模式.动态代理.jdk动态代理;

public class Zhangsan implements IPerson {
    @Override
    public void findLove() {
        System.out.println("张三要求：肤白貌美大长腿");
    }
}
