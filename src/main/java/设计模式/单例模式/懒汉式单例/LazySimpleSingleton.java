package 设计模式.单例模式.懒汉式单例;

/**
 * 优点：节省内存
 * 缺点：线程不安全(加synchronized)
 */
public class LazySimpleSingleton {

    private static LazySimpleSingleton instance;

    private LazySimpleSingleton() {
    }

    public synchronized static LazySimpleSingleton getInstance(){
        if(instance == null){
            instance = new LazySimpleSingleton();
        }
        return instance;
    }
}
