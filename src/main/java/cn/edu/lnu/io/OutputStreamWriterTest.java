package cn.edu.lnu.io;

import java.io.*;

/**
 * 转换流测试
 * OutputStreamWriter是一种转换流，将字节流转换为字符流，原本对数据源的读取是一个字节一个字节的读，但是由于读取太慢或者由于
 * 汉字的存在会出现读取错误的问题，因此该流显得非常的必须。
 * FileWriter和FileOutputStream中均存在是否可对文件进行append的操作
 * OutputStreamWriter中可指定字符的编码
 */
public class OutputStreamWriterTest {

    static OutputStreamWriter osw = null;
    static FileWriter fw  = null;

    public static void main(String[] args) {
        try {
            osw = new OutputStreamWriter(new FileOutputStream("D:/dat.txt"));
            osw.write("MicrosoftsunIBMOracle");
            System.out.println(osw.getEncoding());
            osw.flush();

            osw = new OutputStreamWriter(new FileOutputStream("D:/dat.txt" , true) , "ISO8859_1");
            osw.write("MicrosoftsunIBMOracle");
            System.out.println(osw.getEncoding());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(osw != null){
                try {
                    osw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(fw != null){
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
