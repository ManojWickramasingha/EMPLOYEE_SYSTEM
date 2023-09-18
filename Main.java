package package01;

import java.util.Scanner;

public class Main {

    HRManager sevice = new HRManager();
    static boolean select = true;

    public static void menu() {
        System.out.println("--------------------welcome Employee Manegment System"
                + "\n1.Add Employee"
                + "\n2.view Employee"
                + "\n3.Update Employee"
                + "\n4.Delete Employee"
                + "\n5.view all Employee"
                + "\n6.Exist");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HRManager sevice = new HRManager();

        do {
            menu();
            System.out.println("Enter your choice");
            int choice = input.nextInt();
            switch (choice) {

                case 1:
                    System.out.println("Add Employee");
                    sevice.addEmployee();
                    break;
                case 2:
                    System.out.println("View Employee");
                    sevice.viewBasedId();
                    break;
                case 3:
                    System.out.println("Update Employee");
                    sevice.UpdateEmployee();
                    break;
                case 4:
                    System.out.println("Delete Employee");
                    sevice.deleteEmployee();
                    break;
                case 5:
                    System.out.println("View all Employee");
                    sevice.VewAllEmployyes();
                    break;
                case 6:
                    System.out.println("Thank for user");
                    System.exit(0);

                default:
                    System.out.println("pleace enter valide choice");
                    break;

            }
        } while (select);
    }
}