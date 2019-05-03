package cn.edu.lnu.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 测试下读取文件时如果文件不存在会不会抛出异常
 * 经测试，如果该文件不存在会报出FileNotFoundException ，系统找不到指定文件
 * 那么问题来了，如果是往外写数据那？
 * 经测试：如果是往外写的话，文件不存在，系统会默认创建这个文件，不会抛出异常
 */
public class FileInputStreamTest {

    static FileInputStream fis = null;

    static FileOutputStream fos = null;

    static String path = "D:/aa.txt";

    /*public static void main(String[] args) {
        try {
            fis = new FileInputStream(path);
            int read = 0;
            while((read = fis.read()) != -1){
                System.out.println(read);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
*/

    public static void main(String[] args) {
        try {
            fos = new FileOutputStream(path);
            int c = 100;
            fos.write(c);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
