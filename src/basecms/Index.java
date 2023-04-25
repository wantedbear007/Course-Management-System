package basecms;
import java.util.*;



public  class Index {
    public static void main(String[] args) {
        // System.out.println("hello, world");
        Resources.connect();
        menuOptions();
    }


    // Main menu
    static void menuOptions()  {

        while (true) {
            Resources.welcome("Welcome to Course Management System");
            System.out.println("Please select an option\n");
            String options[] = {"1. Admin", "2. Teacher", "3. Student"};
            for (String str : options) {
                System.out.println(str + " Login");
            }
            System.out.println("4. Developers");
            System.out.println("5. Exit");

            System.out.println("----------------------------------------");
            System.out.print("Option: ");
            
            Scanner sc = new Scanner(System.in);
                int choice = sc.nextInt();  
                switch (choice) {
                    case 1:
                        Resources.welcome("Enter your Credentials as Admin: ");
                        Admin.index();
                        break;
                    case 2:
                        Resources.welcome("Enter your credentials as Teacher: ");
                        Teacher.index();
                        break;
                    case 3:
                        Resources.welcome("Enter your credentials as Student: ");
                        Students.index();                
                        break;
                case 4:
                        Resources.welcome("Developer's Team");
                        Resources.credits();
                        break;
                case 5:
                        Resources.welcome("Thankyou for using Course Management System\nHave a great day !");
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
        }



}

