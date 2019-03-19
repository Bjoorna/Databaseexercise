import java.sql.*;
import java.util.Properties;

public class Main {

    public static void main(String[] args) {
        AddEquipment newequipment = new AddEquipment();
        AddExercise newexercise = new AddExercise();
/*
        newexercise.connect();
        newexercise.setEqID(1);
        newexercise.setEName("\"Squat\"");
        newexercise.setKilo(40);
        newexercise.setSets(1000);
        newexercise.InsertExercise();*/

        newequipment.connect();
        newequipment.SetEquipmentID(3);
        newequipment.SetEquipmentName("\"Dumbell\"");
        newequipment.SetEqDescription("\"Push, flies, rows etc\"");
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
