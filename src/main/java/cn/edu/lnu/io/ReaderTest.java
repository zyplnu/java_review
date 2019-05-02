package cn.edu.lnu.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 测试Reader方法
 */
public class ReaderTest {

    static FileReader reader = null;

    static String file = "D:/test.txt";

    static int read = 0;

    /**
     * 返回该字符的ASCII码
     */
    public static void testRead(){
        try {
            reader = new FileReader(file);
            while ((read = reader.read()) != -1){
                System.out.print((char)read);
            }
            System.out.println(read);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            close();
        }
    }

    public static void testReadWithBuffer(){
        try {
            reader = new FileReader(file);
            char[] chars = new char[20];
            while((read = reader.read(chars)) != -1){
                System.out.println(read);
            }
            System.out.println(read);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            close();
        }
    }

    public static void testReadWithBufferAndOffset(){
        try {
            reader = new FileReader(file);
            char[] chars = new char[20];
            while((read = reader.read(chars , 2 , 5)) != -1){
                System.out.println(read);
            }
            System.out.println(read);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            close();
        }
    }

    /**
     * 释放资源
     */
    public static void close(){
        if(reader != null){
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 65533
     1083
     65533
     65533
     65533
     65533
     55719
     56506
     889
     65533
     * @param args
     */

    public static void main(String[] args) {

        testRead();

    }

}
