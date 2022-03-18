package 设计模式.单例模式.懒汉式单例;

/**
 * classpath: LazyStaticInnerClassSingleton.class
 *                  LazyStaticInnerClassSingleton$LazyHolder.class
 *
 * 优点：写法优雅，利用java本身的语法特点，性能提高，避免内存浪费
 * 缺点：能够被反射破坏，可以在构造方法中抛异常，但是会使代码不优雅
 */
public class LazyStaticInnerClassSingleton {

    private LazyStaticInnerClassSingleton() {
//        if(LazyHolder.INSTANCE != null){
//            throw new RuntimeException("不能被非法访问");
//        }
    }

    public static LazyStaticInnerClassSingleton getInstance() {
        return LazyHolder.INSTANCE;
    }

    private static class  LazyHolder{
        private static final LazyStaticInnerClassSingleton INSTANCE = new LazyStaticInnerClassSingleton();
    }
}
