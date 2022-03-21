package 设计模式.享元模式.连接池;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Vector;

public class ConnectionPool {
    private Vector<Connection> pool;

    private String url = "jdbc:mysql://localhost:3306/test";
    private String username = "root";
    private String password = "root";
    private String driverClassName = "com.mysql.jdbc.Driver";

    private int poolSize = 100;

    public ConnectionPool() {
    }

    public ConnectionPool(Vector<Connection> pool) {
        pool = new Vector<>(poolSize);
        for (int i = 0; i < poolSize; i++) {
            try{
                Class.forName(driverClassName);
                Connection connection = DriverManager.getConnection(url, username, password);
                pool.add(connection);
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    public synchronized Connection getConnection(){
        if(pool.size() > 0){
            Connection connection = pool.get(0);
            pool.remove(connection);
            return connection;
        }
        return null;
    }

    public synchronized void release(Connection conn){
        pool.add(conn);
    }
}
