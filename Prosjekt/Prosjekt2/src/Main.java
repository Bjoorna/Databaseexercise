import java.sql.*;
import java.util.Properties;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        AddEquipment newequipment = new AddEquipment();
        AddExercise newexercise = new AddExercise();
        AddWorkout newworkout = new AddWorkout();
        SelectWorkoutWithNotes selectWorkouts = new SelectWorkoutWithNotes();
        boolean check = true;
        Scanner sc = new Scanner(System.in);
        while(check){
            check = false;
            System.out.println("Would you like to: \n" +
                    "Insert new records: Insert\n" +
                    "Find from database: Find");
            String firstanswer = sc.nextLine();
            System.out.println(firstanswer+ " selected");
            switch (firstanswer){
                case "Insert":
                    System.out.println("Would you like to add new: \n" +
                            "Equipment: A\n" +
                            "Exercise: B\n" +
                            "Workout: C");
                    String answertoinsert = sc.nextLine();
                    // TODO REFACTOR DETTE
                    switch (answertoinsert) {
                        case "A":
                            // TODO litt buggy
                            System.out.println("EquipmentID: ");
                            int eID = sc.nextInt();
                            newequipment.SetEquipmentID(eID);
                            System.out.println("Equipmentname: ");
                            String eName = sc.next();
                            newequipment.SetEquipmentName(eName);
                            System.out.println("Equipment description: ");
                            String desc = sc.next();
                            newequipment.SetEqDescription(desc);
                            newequipment.connect();
                            newequipment.AddEquipment();
                            break;
                        case "B":
                            System.out.println("ExerciseID");
                            int exerciseID = sc.nextInt();
                            newexercise.setExerciseID(exerciseID);
                            System.out.println("Exercisename: ");
                            String exerciseName = sc.next();
                            newexercise.setEName(exerciseName);
                            System.out.println("How many Kilos: ");
                            int kilos = sc.nextInt();
                            newexercise.setKilo(kilos);
                            System.out.println("How many Sets: ");
                            int sets = sc.nextInt();
                            newexercise.setKilo(sets);
                            System.out.println("Exercise description: ");
                            String exerciseDesc = sc.next();
                            newexercise.setDesc(exerciseDesc);
                            newexercise.connect();
                            newexercise.InsertExercise();
                            break;
                        case "C":
                            System.out.println("Do you wish to add a note to the workout (y/n)?");
                            String answertoinsertNote = sc.nextLine();
                            switch (answertoinsertNote) {
                                case "n":
                                    System.out.println("WorkoutID");
                                    int wid = sc.nextInt();
                                    newworkout.setWorkoutID(wid);
                                    System.out.println("Date: ");
                                    int date = sc.nextInt();
                                    newworkout.setDate(date);
                                    System.out.println("Workout length; ");
                                    int wLength = sc.nextInt();
                                    newworkout.setLength(wLength);
                                    System.out.println("PersonalScore: ");
                                    int personal = sc.nextInt();
                                    newworkout.setPersonalScore(personal);
                                    System.out.println("Performance: ");
                                    int perfomance = sc.nextInt();
                                    newworkout.setPerformance(perfomance);
                                    newworkout.connect();
                                    newworkout.Insertworkout();
                                    break;
                                case "y":
                                    System.out.println("WorkoutID");
                                    int widn = sc.nextInt();
                                    newworkout.setWorkoutID(widn);
                                    System.out.println("Date: ");
                                    int daten = sc.nextInt();
                                    newworkout.setDate(daten);
                                    System.out.println("Workout length; ");
                                    int wLengthn = sc.nextInt();
                                    newworkout.setLength(wLengthn);
                                    System.out.println("PersonalScore: ");
                                    int personaln = sc.nextInt();
                                    newworkout.setPersonalScore(personaln);
                                    System.out.println("Performance: ");
                                    int perfomancen = sc.nextInt();
                                    newworkout.setPerformance(perfomancen);
                                    System.out.println("Note: ");
                                    String note = sc.next();
                                    newworkout.setNote(note);
                                    newworkout.connect();
                                    newworkout.InsertworkoutWithNote();
                                    break;
                            }
                    }
                    break;
                case "Find":
                    System.out.println("Find Selected");
                    System.out.println("Find N last workouts: ");
                    int lastworkouts = sc.nextInt();
                    // TODO add SELECT statements
                    selectWorkouts.connect();
                    selectWorkouts.SelectWorkoutWithnotes(lastworkouts);
                    break;
            }
        }
    }
}


/*
    newexercise.connect();
        newexercise.setEqID(1);
        newexercise.setEName("\"Squat\"");
        newexercise.setKilo(40);
        newexercise.setSets(1000);
        newexercise.InsertExercise();*/

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
