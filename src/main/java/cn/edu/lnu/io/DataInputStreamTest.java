package cn.edu.lnu.io;

import java.io.*;

/**
 * 数据流测试
 * DataInputStream和DataOutputStream分别套接在InputStream和OutputStream上，它输入处理流
 * DataInputSteam(InputStream in)
 * DataOutputSteam(OutputStream out)
 * 这两个处理流提供了可以存取与机器无关的Java原始类型数据的方法（int，double等）
 * 通过bais这个流往外读取数据的时候，是一个字节一个字节地往外读取的，因此读出来的数据无法判断是字符串还是bool类型的值，
 * 因此要在它的外面再套一个流，通过dataInputStream把读出来的数据转换就可以判断了。
 * 注意了：读取数据的时候是先写进去的就先读出来，因此读ByteArray字节数组数据的顺序应该是先把占8个字节的double类型的数读出来，
 * 然后再读那个只占一个字节的boolean类型的数，因为double类型的数是先写进数组里面的，读的时候也要先读它。
 * 这就是所谓的先写的要先读。如果先读Boolean类型的那个数，那么读出来的情况可能就是把double类型数的8个字节里面的一个字节读了出来。
 */
public class DataInputStreamTest {

    public static void main(String[] args) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        DataOutputStream dos = new DataOutputStream(baos);
        try {
            dos.writeDouble(Math.random());
            dos.writeBoolean(true);
            ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
            System.out.println(bais.available());
            DataInputStream dis = new DataInputStream(bais);
            System.out.println(dis.readDouble());
            System.out.println(dis.readBoolean());
            dis.close();
            bais.close();
            dos.close();
            baos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
