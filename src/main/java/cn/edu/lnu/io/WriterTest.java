package cn.edu.lnu.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

/**
 * 测试Writer中的一系列方法
 */
public class WriterTest {

    static OutputStreamWriter os = null;

    static String file =  "D:/data.txt";

    /**
     * 经测试，write()方法写入的是b数字表示的真实字符
     */
    public static void testWrite(){
        try {
            os = new FileWriter(file);
            int b = 889;
            os.write(b);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            close();
        }
    }

    public static void testWriteWithBuffer(){
        try {
            os = new FileWriter(file);
            String str = "你好中国";
//            char[] chars = str.toCharArray();
            os.write(str , 2 , 2);
            os.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            close();
        }
    }

    /**
     * 关闭并释放资源
     */
    public  static void close(){
        if(os != null){
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        for(int i = 0; i < 100; i++){
            System.out.println(Math.random() * 10);
        }
    }

}
