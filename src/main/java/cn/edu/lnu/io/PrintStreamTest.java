package cn.edu.lnu.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * 测试PrintStream输出流
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
