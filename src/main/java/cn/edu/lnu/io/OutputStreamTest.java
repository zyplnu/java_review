package cn.edu.lnu.io;

import java.io.*;

/**
 * @description:该类主要用来测试OutputStream中的几个方法
 * write(int b)
 * write(byte[] buffer)
 * write(byte[] buffer , int offset , int length)
 * close()
 * flush()
 */
public class OutputStreamTest {

    static OutputStream os = null;

    static String file = "D:/data.txt";


    /**
     * 测试write()方法到底返回什么
     * 经过测试，该方法什么也不返回，只是把b的值表示的ASCii值对应的东西写入到文件 只能写入该值的低8位
     * 备注：只能写入ASCII中可打印字符，即32-126
     */
    public static void writeTest(){
        try {
            os = new FileOutputStream(new File(file));
            int b = 150;
            os.write(b);
            os.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            close();
        }
    }

    /**
     * 测试write(byte[] buffer)方法到底返回什么
     * 经测试：该方法无返回值，只是将byte数组中的内容写出到目的地
     */
    public static void writeWithBuffer(){
        try {
            os = new FileOutputStream(new File(file));
            byte[] bytes = {65,66,67,68,69};
            os.write(bytes);
            os.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            close();
        }
    }

    /**
     * 测试write(byte[] buffer , int offset , int length)方法到底返回什么
     * 经测试：该方法无返回值，只是将byte数组中的内容写出到目的地,offset是数组的便宜位置，length表示需要读取的长度
     * 若偏移量大于数组长度，或者length-offset>数组的长度都会抛出IndexOutOfBoundsException
     */
    public static void writeWithBufferAndOffset(){
        try {
            os = new FileOutputStream(new File(file));
            byte[] bytes = {65,66,67,68,69};
            os.write(bytes , 6 , 3);
            os.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            close();
        }
    }

    public static void flushTest(){

    }

    /**
     * 关闭资源
     */
    public static void close(){
        if(os != null){
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    os = new FileOutputStream(new File(file));
                    byte[] bytes = new byte[100000];
                    for(int i = 0; i < bytes.length; i++){
                        bytes[i] = (byte) 97;
                        if(i == 1000){
                            Thread.currentThread().interrupt();
                        }
                    }
                    os.write(bytes);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        t.start();

        try {
            os = new FileOutputStream(new File("D:/test.txt"));
            for(int i = 0; i < 100; i++){
                os.write(i);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
