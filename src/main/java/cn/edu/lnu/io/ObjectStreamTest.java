package cn.edu.lnu.io;

import java.io.*;

/**
 * 对象流测试：封装实例对象t
 * ObjectInputStream和ObjectOutputStream是对象序列化读和写的两个类
 * ObjectInputStream(InputStream in)
 * ObjectOutputStrem(OutputStream out)
 * 1、将对象写入到文件进行序列化，该对象的类需要实现Serilizable接口，该接口只是一个标识，并没有具体的方法，
 * 只是告诉编译器这是一个序列化的类
 * 2、在一个类中对变量加transient关键字，则该变量是透明的，即不存在
 */
public class ObjectStreamTest {

    public static class T implements Serializable{
        int i;
        int j;
        transient int k;
    }

    public static void main(String[] args) {
        T t = new T();
        t.k = 8;

        try {
            FileOutputStream fos = new FileOutputStream("D:/object.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(t);
            oos.flush();
            oos.close();
            FileInputStream fis = new FileInputStream("D:/object.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            T tRead = (T) ois.readObject();
            System.out.println(tRead.i + "\t" + tRead.j + "\t" + tRead.k);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
