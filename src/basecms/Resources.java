package basecms;
import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;


public class Resources {

    static Statement statement = connect();
    public static ArrayList<String> sessionData;
    static Scanner sc = new Scanner(System.in);

    // <- DATABASE CONNECTIVITY ->
    static Statement connect() {
        String dbURL = "jdbc:mysql://localhost:3306/cms";
       
     try{  
            // Class.forName("com.mysql.jdbc.Driver");  
           Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con=DriverManager.getConnection(  
            "jdbc:mysql://localhost:3306/cms","root","9907224577");  
            Statement stmt=con.createStatement();  
            System.out.println("connected");
            return stmt;
            // ResultSet rs=stmt.executeQuery("select * from users");  
            // while(rs.next())  
            // System.out.println(rs.getInt(1));  
            // con.close();  
            }
        catch (Exception e) {
            System.out.println("hello " + e.getMessage());
        }
       
       return null;
    }


    // <- MODULE TO CHECK USER VALIDITY ->
    public static ArrayList<String> isValidUser(String[] credentials, boolean isTeacher) {

        ArrayList<String> userData = new ArrayList<>();
        String[] headers = {"name", "reg", "phone", "email", "schooldep", "age", "sex", "pass"};
        try {
            String sqlQuery = "SELECT * FROM REGISTED_USER WHERE reg='" + credentials[0] +  "' AND pass='" + credentials[1] + "';"; 
            ResultSet resultSet = statement.executeQuery(sqlQuery);

            if (resultSet.next()) {
                for (String head : headers) {
                    userData.add(resultSet.getString(head));
                }
            }
            
            return userData;
        } catch (Exception e) {
            System.out.println(e);
        }
        // if (credentials[0].equalsIgnoreCase("12212215") && credentials[1].equalsIgnoreCase("12212215")) {
        //     return true;
        // }

        return userData;
    }

    // <- CREDENTIALS FORM / MANGER ->
    static String[] credentialsManger() {
        String regNumber = null, password = null; 
        
        while (true) {
            System.out.println("Enter Registration number: ");
            regNumber = sc.nextLine();
            if (regNumber.length() == 8) {
                break;
            } 
        }

        while (true) {
            System.out.println("Enter Password: ");
            password = sc.nextLine();
            if (!password.isEmpty()) {
                break;
            }
        }

        String[] cred = {regNumber, password};

        return cred;
    }

    // login session
    public static void loginSession(ArrayList<String> userData) {
        sessionData = userData;
    }

    // get login data
    static ArrayList<String> getLoginSession() {
        return sessionData;
    }

    // System developers
    static void credits() {
        welcome("Course Management System to Manage Online Courses for Teachers and Students\n            Developers:\nRupali Sinha (12213891)\nAnkit Kumar (12213886)\nAmartya Sharma (12213885)");

    }


     //  fancy print
     public static void welcome(String statement) {
        System.out.println("========================================");
        System.out.println(statement);
        System.out.println("========================================");
    }
}