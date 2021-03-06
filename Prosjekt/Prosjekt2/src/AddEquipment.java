import java.sql.*;
import java.util.*;


public class AddEquipment extends DBConn {
    private int eqID;
    private String eqName;
    private String description;
    private Statement equipment;
   // String addEq = "insert into equipment values ("+ \"eqID"\ + eqName+ description+")";

    public void SetEquipmentID(int ID){
        this.eqID = ID;
    }

    public void SetEquipmentName(String name)
    {
        name = "\"" + name + "\"";
        this.eqName = name;
    }

    public void SetEqDescription(String des){
        des = "\"" + des + "\"";
        this.description = des;
    }

    public void AddEquipment(){
        try{
            equipment = connection.createStatement();
            String insert = "INSERT INTO equipment values (" + eqID +"," + eqName + ","
                    + description +");";
            equipment.executeUpdate(insert);
            System.out.println(insert);
        }catch (Exception e){
            throw new RuntimeException("Feil i addequipment", e);
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
}
