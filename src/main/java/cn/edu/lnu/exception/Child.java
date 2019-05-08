package cn.edu.lnu.exception;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 测试重写方法时抛出异常规则
 * 1、子类可以抛出和父类方法中相同的异常和子类异常
 * 2、如果父类中方法只抛出受检查异常，则子类抛出的方法中可以有非受检查异常
 */
public class Child extends Parent {


    public void fun() throws IOException, RuntimeException, ArithmeticException {

    }
}
