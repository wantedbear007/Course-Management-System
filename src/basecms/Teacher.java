package basecms;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;



class Teacher {
    
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
                Resources.welcome("Welcome to Teachers's Portal");
                break;
            }

            System.out.println("Try again !");
        }

        adminMenu();
    }
 

    // <- MODULE TO PRINT MENU ->
    static void adminMenu() {
        String[] items = {"1. Show enrolled Students ", "2. Total Courses Offered", "3. Add Course","4. Student Pending Fees", "5. <-Exit"};

        for (String str : items) {
            System.out.println(str);
        }

        System.out.print("Enter your choice: ");
        userInput = sc.nextInt();
        

        switch (userInput) {
            case 1:
                Resources.welcome(items[0]);
                enrolledStudents();
                break;
            case 2:
                Resources.welcome(items[1]);
                Students.availableCourses();
                break;
            case 3:
                Resources.welcome(items[2]);
//                addNewCourse();
                break;

            case 4: 
                Resources.welcome(items[3]);
                pendingFees();
                break;
        // case 4:
        //         Resources.welcome(items[3]);
        //         pendingFees();
        //         break;

        case 5:
                Resources.welcome(items[3]);
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

    // <- MODULE TO PRINT ENROLLED STUDENTS ->
    static void enrolledStudents() {
        System.out.println("Yet to be implemented !");

    }

    // <- MODULE TO SHOW STUDENTS PENDING FEES
    static ResultSet pendingFees() {
        
        ResultSet resultSet = null;
        try {
            resultSet = statement.executeQuery("SELECT * FROM FEE");
            return resultSet;
//            if (!resultSet.next()) {
//                System.out.println("No student with pending fees.");
//            } else {
//                System.out.println("Students with pending fees: ");
//                while (resultSet.next()) {
//                    System.out.println("Registration number: " + resultSet.getString("reg"));
//                    System.out.println("Pending dues: " + resultSet.getString("fees"));
//                }
//            }
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return resultSet;
    }

    // <- MODULE TO ADD NEW COURSE ->
    static void addNewCourse(String name, String author, String duration, String price, String rating, int certification, String enrolled) {
//        Scanner sc = new Scanner(System.in);

//        String name = null, author, price;
//        int duration, rating, certification, enrolled;
//
//        Resources.welcome("Enter the following details: ");
//        System.out.println("Enter the name of course: ");
//        name = sc.nextLine();
//        System.out.println("Enter University / Author name: ");
//        author = sc.nextLine();
//        System.out.println("Enter duration of course: ");
//        duration = sc.nextInt();
//        System.out.println("Enter subscription price: ");
//        price = sc.nextLine();
//        System.out.println("Enter the initial rating: ");
//        rating = sc.nextInt();
//        System.out.println("Certification: 0 for no 1 for yes ");
//        certification = sc.nextInt();
//        System.out.println("Enter the number of enrolled students: ");
//        enrolled = sc.nextInt();

        // INSERT INTO courses (name,author,duration, price, rating, certification, enroll)VALUES ('CS50 Introduction to Computer Science','Harvard',12,'12999',4,1,25322);

        try {
            String sqlQuery = "INSERT INTO courses (name,author,duration, price, rating, certification, enroll)VALUES ('"
                    + "" + name + "','" + author + "'," + duration + ",'" + price + "'," + rating + "," + certification + "," + enrolled + ");" ;
            statement.executeUpdate(sqlQuery);

            System.out.println("Course was successfully added ");
            
            // String sqlQuery = "INSERT INTO courses (name,author,duration, price, rating, certification, enroll)VALUES ('" + name + "','" + author + "'," + duration + ",'" + price + "'," + rating + "," + certification + "," + enrolled + ")" ;
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    
    
}
