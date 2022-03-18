package 设计模式.单例模式.懒汉式单例;

/**
 * 优点：提升性能，线程安全
 * 缺点：可读性难度加大，不够优雅
 */
public class LazyDoubleCheckSingleton {

    private static volatile LazyDoubleCheckSingleton instance;

    private LazyDoubleCheckSingleton() {
    }

    public static LazyDoubleCheckSingleton getInstance() {
        //1、检查是否阻塞
        if (instance == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                //2、检查是否要重新创建实例
                if(instance == null){
                    instance = new LazyDoubleCheckSingleton();
                    //指令重排序
                }
            }
        }
        return instance;
    }
}
