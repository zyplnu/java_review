package 设计模式.代理模式.动态代理.jdk动态代理;

public class Test {
    public static void main(String[] args) {
        JdkMeiPo jdkMeiPo = new JdkMeiPo();
        IPerson zhangsan = (IPerson) jdkMeiPo.getInstance(new Zhangsan());
        zhangsan.findLove();
    }
}
