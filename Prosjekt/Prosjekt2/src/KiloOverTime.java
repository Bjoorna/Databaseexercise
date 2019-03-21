import java.sql.*;
import java.util.*;

public class KiloOverTime extends DBConn{
    Statement selectstatement;
    ResultSet statementresult;

    public void FindKiloResults(int date1, int date2){
        try{
            selectstatement = connection.createStatement();
            String q = "select date, kilo from exercise " +
                    "join performsexercise on exercise.exerciseID = performsexercise.exerciseid " +
                    "join workout on workout.workoutID = performsexercise.workoutid " +
                    "where workout.date>" + date1 + " and workout.date<" + date2;

            statementresult = selectstatement.executeQuery(q);
            while(statementresult.next()){
                System.out.println("Lifted: " + statementresult.getInt("Kilo")+
                        " at date: " + statementresult.getInt("Date"));
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
            throw new RuntimeException("FindKilosInworkout", e);
        }
    }
}
