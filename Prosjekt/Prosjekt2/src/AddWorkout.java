import java.sql.*;

import java.util.*;

public class AddWorkout extends DBConn {

    int workoutID;
    int date;
    int length;
    int personalScore;
    int performance;

    public int getWorkoutID() {
        return workoutID;
    }

    public void setWorkoutID(int workoutID) {
        this.workoutID = workoutID;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getPersonalScore() {
        return personalScore;
    }

    public void setPersonalScore(int personalScore) {
        this.personalScore = personalScore;
    }

    public int getPerformance() {
        return performance;
    }

    public void setPerformance(int performance) {
        this.performance = performance;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        note = "\"" + note + "\"";
        this.note = note;
    }

    String note;
    Statement workout;

    public void Insertworkout(){
        try{
            workout = connection.createStatement();
            String insert = "INSERT INTO workout(workoutid, date, length, personalscore" +
                    ", performance) values (" + getWorkoutID() +"," + getDate()
                    + "," + getLength() + "," + getPersonalScore() + "," + getPerformance() + ");";
            workout.executeUpdate(insert);
            System.out.println(insert);
        }catch (Exception e){
            throw new RuntimeException("Feil i addworkout", e);
        }

        try{
            if (connection!=null){
                connection.close();
                System.out.println("Connection closed");
            }
        }catch (Exception e){
            throw new RuntimeException("workout", e);
        }
    }
    public void InsertworkoutWithNote(){
        try{
            workout = connection.createStatement();
            String insert = "INSERT INTO workout(workoutid, date, length, personalscore" +
                    ", performance, note) values (" + getWorkoutID() +"," + getDate()
                    + "," + getLength() + "," + getPersonalScore() + "," + getPerformance() +
            "," + getNote()+");";
            // insert into workout(workoutid, name, kilo, sets) values (2, "Squat", 100, 3);
            workout.executeUpdate(insert);
            System.out.println(insert);
        }catch (Exception e){
            throw new RuntimeException("Feil i addworkout", e);
        }

        try{
            if (connection!=null){
                connection.close();
                System.out.println("Connection closed");
            }
        }catch (Exception e){
            throw new RuntimeException("workout", e);
        }
    }
}
