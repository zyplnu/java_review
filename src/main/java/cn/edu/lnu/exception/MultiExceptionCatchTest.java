package cn.edu.lnu.exception;

import org.omg.CORBA.INTERNAL;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * 测试多个catch，同时上一个catch包含下一个catch时是否能编译通过
 * 经测试：无法通过编译
 * 结论：在一个try语句块中，基类异常的捕获语句不可以写在子类异常捕获语句的上面
 */
public class MultiExceptionCatchTest {

    public static void main(String[] args) {
        String[][] s = new String[5][];
        if(2 < 1){
            throw new ArithmeticException("i can not equals 0");
        }
        try {
            int a = 3;
//            System.out.println(a / 0);
            System.out.println("ss");
            System.out.println(s[5]);
        } catch (ArithmeticException ex) {
            ex.printStackTrace();
            System.out.println("liuliulu");
        } catch (ArrayIndexOutOfBoundsException ex) {
            ex.printStackTrace();
            System.out.println("qiqiiqi");
        } finally {
            System.out.println("xixi");
        }
        System.out.println("haha");

    }

    public void method(){
        if(2 < 1){
            throw new ArithmeticException("i can not equals 0");
        }
    }

    public void read() throws IOException {
        try {
            FileReader file = new FileReader(new File("D:/test.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        if(2 < 1){
            throw new IOException("参数异常");
        }
    }
}