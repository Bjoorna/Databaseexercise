import java.sql.*;
import java.util.Properties;

public abstract class DBConn {
    protected Connection connection;

    public DBConn() {
    }

    public void connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/treningsdagbok?autoReconnect=true&useSSL=false&useUnicode=true" +
                    "&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false" +
                    "&serverTimezone=UTC";
            String username = "java";
            String password = "password";
            System.out.println("Connecting database...");
            try(Connection connection = DriverManager.getConnection(url, username, password)){
                System.out.println("Database Connected");
                // conn = DriverManager.getConnection(url, username, password);
            } catch (Exception e) {
                throw new RuntimeException("Cant connect", e);
            }
        } catch (Exception e) {
            throw new RuntimeException("Generisk feil", e);
        }
    }
}