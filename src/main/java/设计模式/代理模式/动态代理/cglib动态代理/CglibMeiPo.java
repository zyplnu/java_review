package 设计模式.代理模式.动态代理.cglib动态代理;

import net.sf.cglib.Enhancer;
import net.sf.cglib.MethodInterceptor;
import net.sf.cglib.MethodProxy;

import java.lang.reflect.Method;

public class CglibMeiPo implements MethodInterceptor{

    private Object target;

    public Object getInstance(Class<?> clazz) {
//        Enhancer enhancer = new Enhancer();
//        enhancer.setSuperclass(clazz);
//        enhancer.setCallback(this);
//        return enhancer.create();
        return null;
    }

    private void before() {
    }

    private void after() {
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        before();
        Object result = methodProxy.invokeSuper(o, objects);
        after();
        return result;
    }
}
