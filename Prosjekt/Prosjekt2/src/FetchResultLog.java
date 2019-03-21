import java.sql.*;
import java.util.*;



public class FetchResultLog extends DBConn {


    Statement selectstatement;
    ResultSet statementresult;


    public void Fetchlog(int date1, int date2){
        try{
            selectstatement = connection.createStatement();
            String q = "select * from workout " +
                    "where date> " + date1+" and date<"+date2;

            statementresult = selectstatement.executeQuery(q);
            System.out.println("Last workouts: ");
            int rownr = 1;
            while(statementresult.next()){
                System.out.println("Workout nr: " + rownr++ +
                        " Date: " + statementresult.getInt("Date") +
                        " Length: " + statementresult.getInt("Length") +
                        " PersonalScore: " + statementresult.getInt("PersonalScore") +
                        " Performance: " + statementresult.getInt("Performance") +
                        " Note: " + statementresult.getString("Note"));
            }
        }catch (Exception e){
            throw new RuntimeException(e);
        }
        try{
            if (connection!=null){
                connection.close();
                System.out.println("Connection closed");
            }
        }catch (Exception e){
            throw new RuntimeException("SelectWorkout", e);
        }

    }

}
