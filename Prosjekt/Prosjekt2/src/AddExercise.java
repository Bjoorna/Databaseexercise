import java.sql.*;
import java.util.*;

public class AddExercise extends DBConn {

    int ExerciseID;
    String EName;
    int EqID;
    int Kilo;
    int Sets;
    String desc;
    Statement exercise;

    public void InsertExercise(){
        try{
            exercise = connection.createStatement();
            String insert = "INSERT INTO exercise(exerciseid, name, kilo, sets) values (" + getExerciseID() +"," + getEName()
                    + "," + getKilo() + "," + getSets() +");";
            // insert into exercise(exerciseid, name, kilo, sets) values (2, "Squat", 100, 3);
            exercise.executeUpdate(insert);
            System.out.println(insert);
        }catch (Exception e){
            throw new RuntimeException("Feil i addeq", e);
        }

        try{
            if (connection!=null){
                connection.close();
                System.out.println("Connection closed");
            }
        }catch (Exception e){
            throw new RuntimeException("t", e);
        }
    }

    public int getExerciseID() {
        return ExerciseID;
    }

    public void setExerciseID(int exerciseID) {
        ExerciseID = exerciseID;
    }

    public String getEName() {
        return EName;
    }

    public void setEName(String EName) {
        this.EName = EName;
    }

    public int getEqID() {
        return EqID;
    }

    public void setEqID(int eqID) {
        EqID = eqID;
    }

    public int getKilo() {
        return Kilo;
    }

    public void setKilo(int kilo) {
        Kilo = kilo;
    }

    public int getSets() {
        return Sets;
    }

    public void setSets(int sets) {
        Sets = sets;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }



}
