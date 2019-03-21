import java.sql.*;
import java.util.*;


public class SelectWorkoutWithNotes extends DBConn {

    Statement selectstatement;
    ResultSet statementresult;

    public void SelectWorkoutWithnotes(int last){
        try{
            selectstatement = connection.createStatement();
            String q = "select * from workout where note IS NOT NULL" +
                    " order by workoutid desc limit " + last;
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
