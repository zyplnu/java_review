package 设计模式.代理模式.动态代理.jdk动态代理;

import 设计模式.代理模式.静态代理.IPerson;

public class ZhaoLiu implements IPerson {
    @Override
    public void findLove() {
        System.out.println("赵六要求：有车有房");
    }
}
