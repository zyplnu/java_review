package cn.edu.lnu.io;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 转换流测试
 * 用户从DOS窗口输入的内容传递给in这个标准输入流，这个流是InputStream，通过InputStreamReader可以将字节输入流转换为
 * 字符输入流，该流是节点流，通过加上一层管道可以对该流进行包装成处理流，通过处理流可以按行读取用户输入在DOS窗口的内容，放到s
 * 指定的内存区域中，最后可以对该内存区域中的内容进行打印。
 */
public class InputStreamReaderTest {

    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = null;
        try {
            s = br.readLine();
            while (s != null){
                System.out.println(s.toUpperCase());
                s = br.readLine();
                if(s.equalsIgnoreCase("exit")){
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
