package cn.edu.lnu.io;

import java.io.*;

/**
 * 测试BufferedWriter
 * 处理流有四种，BufferedReader BufferedWriter BufferedInputStream BufferedOutputStream
 * BufferedReader中有按行读取的方法readLine()
 * BufferedWriter中有按行写出的方法newLine()
 * 处理流中缓冲流利用缓冲区的思想，缓冲区就是内存中的一块区域，把读到的数据先放到缓冲区后再写出或读入
 */
public class BufferedWriterTest {

    static BufferedWriter bw = null;
    static BufferedReader reader = null;

    public static void main(String[] args) {
        try {
             bw = new BufferedWriter(new FileWriter("D:/dat.txt" ));
            String s = null;
            for(int i = 0; i < 100;i++){
                s = String.valueOf(Math.random());
                bw.write(s);
                bw.newLine();
            }
            bw.flush();
            reader = new BufferedReader(new FileReader("D:/dat.txt" ));
            while((s = reader.readLine()) != null){
                System.out.println(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(bw != null){
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(reader != null){
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println(System.getProperty("line.separator"));
    }

}
