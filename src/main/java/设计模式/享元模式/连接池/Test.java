package 设计模式.享元模式.连接池;

import java.sql.Connection;

public class Test {
    public static void main(String[] args) {
        ConnectionPool pool = new ConnectionPool();
        Connection connection = pool.getConnection();
    }
}
