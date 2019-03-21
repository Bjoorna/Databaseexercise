import java.sql.*;
import java.util.*;

public class AddExerciseGroup extends DBConn {

    String EGroupName;
    int inEGroupID;
    String inEGroupName;


    public void InsertExerciseGroup(){
        try{
            exerciseGroup = connection.createStatement();
            String insert = "INSERT INTO exercisegroups(name) values (" + getEGroupName() +");";
            exerciseGroup.executeUpdate(insert);
            System.out.println(insert);
        }catch (Exception e){
            throw new RuntimeException("Feil i addeq", e);
        }
        try{
            inExerciseGroup = connection.createStatement();
            String insert = "INSERT INTO inexercisegroup(exerciseid, name) values (" + getInEGroupID() +","+ getinEGroupName() +");";
            inExerciseGroup.executeUpdate(insert);
            System.out.println(insert);

        }catch (Exception e){
            throw new RuntimeException("Feil i insert", e);

        try{
            if (connection!=null){
                connection.close();
                System.out.println("Connection closed");
            }
        }catch (Exception e){
            throw new RuntimeException("t", e);
        }
    }
    public int getInEGroupID() {
        return inEGroupID;
    }
    public void setEGroupName(String EGroupName) {
        EGroupName = "\"" + EGroupName + "\"";
        this.EGroupName = EGroupName;
    }

    public void setInEGroupID(int inEGroupID) {
        this.inEGroupID = inEGroupID;
    }
    public String getEGroupName() {
        return EGroupName;
    }

    public String getinEGroupName() {
        return inEGroupName;
    }
    public void setinEGroupName(String inEGroupName) {
        inEGroupName = "\"" + inEGroupName + "\"";
        this.inEGroupName = inEGroupName;
    }
}
