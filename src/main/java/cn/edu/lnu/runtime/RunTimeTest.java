package cn.edu.lnu.runtime;

import java.io.*;

/**
 * Java执行dos命令程序测试
 */
public class RunTimeTest {

    public static void main(String[] args) {
        try {
            Process process = Runtime.getRuntime().exec("d:");
            InputStream is = process.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is , "GBK"));
            String line = null;
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }
//            OutputStream os = process.getOutputStream();
//            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
//            while()
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
