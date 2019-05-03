package cn.edu.lnu.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * 测试PrintStream输出流
 * System.out 这个out默认是连接的DOS窗口
 * 在该程序中，首先通过fos这个流指向log.txt这个文件，然后在fos流上套一个打印流，紧接着通过设置System.setOut(ps)，指定系统的标准输出流为
 * ps，这样就更改了系统的默认输出流为log.txt而非DOS窗口。
 * 通过查看源码可以发现，设置系统的输入输出流是native方法，也就是虚拟机调用C++方法实现的。
 */
public class PrintStreamTest {

    public static void main(String[] args) {
        PrintStream ps = null;
        try {
            FileOutputStream fos = new FileOutputStream("D:/log.txt");
            ps = new PrintStream(fos);
            if(ps != null){
                System.setOut(ps);
            }
            for(char c = 0; c <= 60000; c++){
                System.out.println(c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            ps.close();
        }
    }

}
