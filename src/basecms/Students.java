package basecms;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

class Students {

    static Statement statement = Resources.connect();
    static int userInput;
    static Scanner sc = new Scanner(System.in);
    // <- CLASS MAIN FUNCTION ->
    static void index() {
        while (true) {
            String[] credentials = Resources.credentialsManger();
            ArrayList<String> authorization = Resources.isValidUser(credentials, false);
            
            if (!authorization.isEmpty()) {
                System.out.println("Success");
                Resources.loginSession(authorization);
                Resources.welcome("Welcome to Student Portal");
                break;
            }

            System.out.println("Try again !");
        }

        adminMenu();
    }

    // <- MODULE TO PRINT MENU ->
    static void adminMenu() {
        // todo -> To develop a completed course module.
        String[] items = {"1. Available Courses.", "2. Enrolled Courses", "3. Profile Details", "4. Pending fees", "5. <-Exit"};

        for (String str : items) {
            System.out.println(str);
        }

        System.out.print("Enter your choice: ");
        userInput = sc.nextInt();
        

        switch (userInput) {
            case 1:
                Resources.welcome(items[0]);
                availableCourses();
                break;
            case 2:
                Resources.welcome(items[1]);
                viewEnrolledCourses();
                break;
            case 3:
                Resources.welcome(items[2]);
                profileDetails();
                break;
        case 4:
                Resources.welcome(items[3]);
                pendingFees();
                break;

        case 5:
                Resources.welcome(items[4]);
                System.exit(0);
                break;
        default:
            System.out.println("Invalid choice");
            System.out.println("Please Select a valid option");
            System.out.println("Press any key to continue");
            sc.nextLine();
            sc.nextLine();
            break;
    }
}

    // <- MODULE FOR VIEWING AVAILABLE COURSES ->
    static void availableCourses() {
        Admin.availableCourses();
    }

    // <- MODULE FOR VIEWING ENROLLED COURSES ->
    static void viewEnrolledCourses() {
        System.out.print("Yet to be implemented.");
    }

    // <- MODULE FOR VIEWING PROFILE DETAILS ->
    static void profileDetails() {

        ArrayList<String> userData = Resources.getLoginSession();

        // for (String str : userData) {
        //     System.out.println(str);
        // }
        Resources.welcome("Your Profile data is: ");
                System.out.println("Name: " + userData.get(0));
                System.out.println("Registration number: " + userData.get(1));         
                System.out.println("Contact number: " + userData.get(2));
                System.out.println("Email Address: " + userData.get(3));
                System.out.println("Department: " + userData.get(4));
                System.out.println("Age: " + userData.get(5));

         try {
             System.out.println("Enter your registration number: ");
             Scanner sc = new Scanner(System.in);
             String reg = sc.nextLine();
         System.out.println(reg);
             String sqlQuery = "SELECT * FROM REGISTED_USER WHERE reg=" + reg + ";"; 
             // String sqlQString 
             ResultSet resultSet = statement.executeQuery(sqlQuery); 
             
             while (resultSet.next()) {
                 System.out.println("Name: " + resultSet.getString("name"));
                 System.out.println("Registration number: " + resultSet.getString("reg"));         
                 System.out.println("Contact number: " + resultSet.getString("phone"));
                 System.out.println("Email Address: " + resultSet.getString("email"));
                 System.out.println("Department: " + resultSet.getString("schooldep"));
                 System.out.println("Age: " + resultSet.getString("sex"));
                 System.out.println("==========================================================\n");
             } 
         } catch (Exception e) {
             System.out.println(e);
         }
    }
    // <- MODULE FOR VIEWING PENDING FEES ->
    static ResultSet pendingFees() {
        ArrayList<String> userData = Resources.getLoginSession();

        
        ResultSet resultSet = null;
        try {
            resultSet = statement.executeQuery("SELECT * FROM FEE WHERE REG='" + userData.get(1) +"'");

//            if (!resultSet.next()) {
//                System.out.println("No dues");
//            } else {
//                System.out.println("Your pending fee is: ");
//                System.out.println("Rs. : " + resultSet.getString("fees") );
//            }
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return resultSet;


    }
    
}
