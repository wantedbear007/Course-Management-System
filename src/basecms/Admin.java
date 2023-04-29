package basecms;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
//import javax.swing.table.*;

class Admin {
    static Statement statement = Resources.connect();

    static int userInput;

    static Scanner sc = new Scanner(System.in);
    static void index() {
        String username;
        String password;

        while (true) {

            System.out.println("Enter Username: ");
            username = sc.next();
            System.out.println("Enter Password: ");
            password = sc.next();
            
            System.out.println("username " + username + " password " +  password);
            if (username.equalsIgnoreCase("root") && password.equalsIgnoreCase("root")) {
                System.out.println("Successfully logged in. ");
                adminMenu();
                break;
            } else {
                System.out.println("Enter");
                System.out.println("Wrong credentials !\n1. Try again\n2. to exit.");

                // int userInput;
                userInput = sc.nextInt();

                if (userInput == 2) break;
            }
        }
    }


    // lists out admin menu items 
    static void adminMenu() {
        String[] items = {"1. Register New User", "2. View courses", "3. View Registered Teachers", "4. View Registered Students", "5. <- Go back"};

        for (String str : items) {
            System.out.println(str);
        }

        System.out.print("Enter your choice: ");
        userInput = sc.nextInt();
        

        switch (userInput) {
            case 1:
                Resources.welcome("Register New User: ");
//                newRegistration();
                break;
            case 2:
                Resources.welcome("View Available Courses: ");
                availableCourses();
                break;
            case 3:
                Resources.welcome("View Registered Teachers: ");
                // Students.index();     
                registeredUsers(false);           
                break;
        case 4:
                Resources.welcome("View Registered Students");
                registeredUsers(false);
                break;

        case 5:
                Resources.welcome("<- Exit");
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
    

    // user registration
    static void newRegistration(String uRegistration, String uName, String uContact, String uEmail, String uDept, String uAge, String uGender, String uPassword ) {
        
        
        System.out.print("reg: " + uRegistration + " name: " + uName + " contact " + uContact + " email " + uEmail + " dept " + uDept + " age " + uAge + " gender " + uGender + " password: " + uPassword  );
        

//        String number = null;
//        
//        
//        String regNumber = null;
//        while (true) {
//            System.out.println("Enter Registration number: ");
//            regNumber = sc.nextLine();
//            if (regNumber.length() == 8) {
//                break;
//            } 
//        }
//
//        System.out.println("Enter your name: ");
//        String name = sc.nextLine();
//        while (true) {
//            System.out.println("Enter phone number (10 digits):");
//            number = sc.nextLine();
//            if (number.matches("\\d{10}")) {
//                break;
//            }
//            System.out.println("Invalid phone number. Please enter 10 digits.");
//        }
//
//        String email = null;
//        while (true) {
//            System.out.println("Enter email address:");
//            email = sc.nextLine();
//            if (email.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")) {
//                break;
//            }
//            System.out.println("Invalid email address. Please enter a valid email address.");
//        }
//
//        System.out.println("Enter your school Dept: ");
//        
//        String school = null;
//        school = sc.nextLine();
//        System.out.println("Enter age:");
//        int age = sc.nextInt();
//
//        System.out.println("Enter M/F");
//        char ch = sc.next().charAt(0);
//
//        sc.nextLine();
//      
//        System.out.println("Enter password");
//        String password = sc.next();   
//
        String teacher = "false";
//
//        // <- UPLOADING TO DATABASE ->
       
//        String sqlQuery = "INSERT INTO REGISTED_USER (name ,reg,phone, email, schooldep, age, sex, pass, teacher)VALUES ("  + "'" 
//        + name + "','"  
//        + regNumber + "','" + number + "','" + email + "','" + school + "'," + age + ",'" + ch + "','" + password + "'," + teacher 
//         + ");";
//        try {
//            statement.executeUpdate(sqlQuery);
//
//        } catch (Exception e) {
//            System.out.println(e);
//            System.out.println("Database error" + e.getMessage());
//            System.exit(0);
//        }
//        Resources.welcome("You are successfully registered !");

//String uRegistration, String uName, String uContact, String uEmail, String uDept, String uAge, String uGender, String uPassword )
 String sqlQuery = "INSERT INTO REGISTED_USER (name ,reg,phone, email, schooldep, age, sex, pass, teacher)VALUES ("  + "'" 
        + uName + "','"  
        + uRegistration + "','" + uContact + "','" + uEmail + "','" + uDept + "'," + uAge + ",'" + uGender + "','" + uPassword + "'," + teacher 
        + ");";
 
         try {
            statement.executeUpdate(sqlQuery);

        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Database error" + e.getMessage());
            System.exit(0);
        }
        Resources.welcome("You are successfully registered !");
        
        
    }

    // Available courses module
    static ResultSet availableCourses() {
        Resources.welcome("Available Courses");

//        String id, name, author, duration, price, rating, certification, enroll;
//        String[] headers = {"id", "name", "author", "duration", "price", "rating", "certification", "enroll"};
//        ArrayList<String> data = 
        try {
            ResultSet resultSet = statement.executeQuery("SELECT * FROM COURSES");
            
            
            return resultSet;

//        while (resultSet.next()) {
//            
//            String id = resultSet.getString("id");
//            String name = resultSet.getString("name");
//            String author = resultSet.getString("author");
//            String duration = resultSet.getString("duration");
//            String price = resultSet.getString("price");
//            String rating = resultSet.getString("rating");
//            String cerification = resultSet.getString("enroll");
//            
//            String[] headData = {id, name, author, duration, price, rating, cerification};
//            
//            return headData;
////            DefaultTableModel tableModel = (DefaultTableModel)coursesTable.getModel();
//            
//            
////            sno = resultSet.getString("id");
////            name=  ;
////            author = resultSet.getString("author");
////            
////            System.out.println("--------------------------------------------------------------");
////            System.out.println("Name: " + resultSet.getString("name"));
////            System.out.println("University / Author: " + resultSet.getString("author"));
////            System.out.println("Course Duration: " + resultSet.getString("duration") + " Weeks");
////            System.out.println("Subscription charges: " + resultSet.getString("price"));
////            System.out.println("Rating: " + resultSet.getString("rating"));
////            System.out.println("Certification available: " + resultSet.getString("certification"));
////            System.out.println("Enrolled students: " + resultSet.getString("enroll"));
//            
//        }
    } catch (Exception e) {System.out.println(e);}
        
        return null;

    }

    // VIEW REGISTERED USERS
    static void registeredUsers(boolean isTeacher) {
        String user = isTeacher ? "Teachers" : "Students";
        Resources.welcome("Registered "  + user);

        try {

            
            ResultSet resultSet = statement.executeQuery("SELECT * FROM REGISTED_USER");
            // ResultSetMetaData metaData = resultSet.getMetaData();
            
            // int columns  = metaData.getColumnCount();
            while (resultSet.next()) {
              
        System.out.println("Name: " + resultSet.getString("name"));
        System.out.println("Registration number: " + resultSet.getString("reg"));         
        System.out.println("Contact number: " + resultSet.getString("phone"));
        System.out.println("Email Address: " + resultSet.getString("email"));
        System.out.println("Department: " + resultSet.getString("schooldep"));
        System.out.println("Age: " + resultSet.getString("sex"));
        System.out.println("==========================================================\n");
            }
        } catch (Exception e) {System.out.println(e);}
        
    }
    
}
