package 设计模式.代理模式.静态代理;

public class ZhangLaoSan implements IPerson {

    private Zhangsan zhangsan;

    public ZhangLaoSan(Zhangsan zhangsan) {
        this.zhangsan = zhangsan;
    }

    public void findLove() {
        System.out.println("开始物色");
        zhangsan.findLove();
        System.out.println("开始交往");
    }
}
