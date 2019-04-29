package cn.edu.lnu.io;

import java.io.*;

/**
 * @description 对FileInputStream中的一系列read()方法进行测试
 */
public class InputStreamTest {

    static String file = "D:/out.txt";

    static InputStream is;

    static int read;

    /**
     * 测试read()方法 102 101 116 99 104 74 83
     * 经测试，每读取一个字节，返回0~255之间的一个数字,该数字表示的是这个字符的ASCII值，如果返回-1则表示读取到末尾
     */
    public static void testRead(){

        try {
            is = new FileInputStream(new File(file));
            while((read = is.read()) != -1){
                System.out.println((char) read);
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
     * read(byte[] buffer)到底返回什么
     * 经测试：该方法返回的是设置的byte数组的值，如果最后一次读取的字节小于设置的值，则返回真实的字节数，读取到末尾返回-1
     * 格式如下：20 20 20 ... 17 -1
     */
    public static void testReadWithBufferArray(){
        try {
            is = new FileInputStream(new File(file));
            byte[] buffer = new byte[20];
            while ((read = is.read(buffer)) != -1){
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
     * 测试read(byte[] buffer , int offset , int length)到底返回什么
     * 经测试，返回每次读取的length个字节，最后一次如果字节数不足15，则返回实际读取的字节数，末尾返回-1
     * 例如：下面的实例返回15 15 15 ... 2 -1
     */
    public static void testReadWithBufferAndOffset(){
        try {
            is = new FileInputStream(new File(file));
            byte[] buffer = new byte[20];
            while((read = is.read(buffer , 0 , 15)) != -1){
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
     * 测试testSkip()到底返回什么
     * 经测试：该方法返回skip中实际设置的字节数，意思是io流跳过几个字节不读
     * 测试完之后，以为BufferedReader中不会包含这个方法，没想到我错了，BufferedReader中的skip方法返回的是跳过的字符数，后期学到的时候测验下
     */
    public static void testSkip(){
        try {
            is = new FileInputStream(new File(file));
            long length = is.skip(5);
            while((read = is.read()) != -1){
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
     * 关闭io流，形成好习惯
     */
    public static void close(){
        if(is != null){
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        testRead();
    }

}
