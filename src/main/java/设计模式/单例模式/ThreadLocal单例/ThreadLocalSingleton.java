package 设计模式.单例模式.ThreadLocal单例;

/**
 * 只能保证在同一个线程内是单例的
 */
public class ThreadLocalSingleton {

    private static ThreadLocal<ThreadLocalSingleton> threadLocalInstance = new ThreadLocal<ThreadLocalSingleton>(){
        @Override
        protected ThreadLocalSingleton initialValue(){
            return new ThreadLocalSingleton();
        }
    };

    private ThreadLocalSingleton(){}

    public static ThreadLocalSingleton getInstance(){
        return threadLocalInstance.get();
    }

}
