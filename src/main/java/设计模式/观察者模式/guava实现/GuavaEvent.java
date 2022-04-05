package 设计模式.观察者模式.guava实现;

import org.springframework.messaging.simp.annotation.SubscribeMapping;

public class GuavaEvent {

//    @Subscribe
    public void observer(Object arg){
        if(arg instanceof Pojo){
            System.out.println("执行observer方法，传参为：" + arg);
        }
    }
}
