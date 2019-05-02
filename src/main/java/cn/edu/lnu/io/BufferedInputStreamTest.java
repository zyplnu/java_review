package cn.edu.lnu.io;

import java.io.*;

/**
 * 测试一下缓冲流
 */
public class BufferedInputStreamTest {

    /*public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("D:/out.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);
            int c = 0;
            System.out.println((char) bis.read());
            System.out.println((char) bis.read());
            bis.mark(3);
            for(int i = 0; i <= 10 && (c = bis.read()) != -1; i++){
                System.out.println((char) c);
            }
            System.out.println();
            bis.reset();
            for(int i = 0; i <= 10 && (c = bis.read()) != -1; i++){
                System.out.println((char) c);
            }
            bis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/

    public static void main(String[] args) {
        try { // 初始化一个字节数组，内有10个字节的数据
            byte[] bytes = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // 用一个ByteArrayInputStream来读取这个字节数组
            ByteArrayInputStream in = new ByteArrayInputStream(bytes); // 将ByteArrayInputStream包含在一个BufferedInputStream
            BufferedInputStream bis = new BufferedInputStream(in); // 读取字节1,2
            System.out.print(bis.read() + ",");
            System.out.print(bis.read() + ","); // 在此处做标记，同时设置readlimit参数为3
            System.out.println("mark");
            bis.mark(3); // 继续输出3，4，5，6值
            System.out.print(bis.read() + ",");
            System.out.print(bis.read() + ",");
//            System.out.print(bis.read() + ",");
//            System.out.print(bis.read() + ","); // 调用reset()方法
            System.out.println("reset");
            bis.reset(); // 输出剩下的值
            System.out.println("");
            int c;
            while ((c = bis.read()) != -1) {
                System.out.print(c + ",");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
