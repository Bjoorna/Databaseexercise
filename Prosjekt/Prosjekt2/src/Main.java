import java.sql.*;
import java.util.Properties;

public class Main {

    public static void main(String[] args) {
        AddEquipment newequipment = new AddEquipment();

        newequipment.connect();
        newequipment.SetEquipmentID(1);
        newequipment.SetEquipmentName("\"Power Rack\"");
        newequipment.SetEqDescription("\"For squat etc\"");
        // newequipment.startEq(1);
        newequipment.AddEquipment();
    }

    // TODO For later if necessary
/*
    String url = "jdbc:mysql://localhost:3306/treningsdagbok?autoReconnect=true&useSSL=false&useUnicode=true" +
            "&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false" +
            "&serverTimezone=UTC";
    String username = "java";
    String password = "password";


        System.out.println("Connecting database...");
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            System.out.println("Database connected!");
        } catch (SQLException e) {
            throw new IllegalStateException("Cannot connect the database!", e);
        }
    }catch (Exception e) {
        throw new RuntimeException("baopsda", e);
    }*/
}
