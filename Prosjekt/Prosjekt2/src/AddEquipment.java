import java.sql.*;
import java.util.*;


public class AddEquipment extends DBConn {
    private int eqID;
    private String eqName;
    private String description;
    private Statement equipment;
   // String addEq = "insert into equipment values ("+ \"eqID"\ + eqName+ description+")";

    public void SetEquipmentID(int ID){
        // TODO add scanner etc
        this.eqID = ID;
    }

    public void SetEquipmentName(String name){
        this.eqName = name;
    }

    public void SetEqDescription(String des){
        this.description = des;
    }

    public void AddEquipment(){
        try{
            equipment = connection.createStatement();
            String insert = "INSERT INTO equipment values (" + eqID +"," + eqName + ","
                    + description +");";
            equipment.executeUpdate(insert);
        }catch (Exception e){
            throw new RuntimeException("Feil i addeq", e);
        }

        try{
            if (connection!=null){
                connection.close();
            }
        }catch (Exception e){
            throw new RuntimeException("t", e);
        }

        /*try {
            equipment.setInt(1, eqID);
            equipment.setString(2, eqName);
            equipment.setString(3, description);

        }catch (Exception e){
            System.out.println(e);
        }*/


    }

    public void startEq(int id){
        SetEquipmentID(id);
        try{
            equipment = connection.prepareStatement("INSERT INTO equipment VALUES ((?), (?), (?)));");
        }catch (Exception e){
            throw new RuntimeException(("Feil i start"), e);
        }

    }

}
