package package01;

import java.util.HashSet;
import java.util.Scanner;

public class HRManager {

    HashSet<Employee> empset = new HashSet<Employee>();

    Employee emp1 = new Employee(101, "manoj", 24, "IT", "Developer", 25000);
    Employee emp2 = new Employee(102, "manoj", 25, "CSE", "Developer", 75000);
    Employee emp3 = new Employee(103, "manoj", 23, "IT", "Developer", 85000);
    Employee emp4 = new Employee(104, "manoj", 20, "CSE", "Developer", 75000);

    Scanner input = new Scanner(System.in);
    boolean found = false;
    int id;
    String name;
    int age;
    String department;
    String desination;
    double sal;

    public HRManager() {

        empset.add(emp1);
        empset.add(emp2);
        empset.add(emp3);
        empset.add(emp4);
    }

    // view all employee method
    public void VewAllEmployyes() {
        for (Employee emp : empset) {
            System.out.println(emp);
        }
    }

    // view one employee base on theire id

    public void viewBasedId() {
        found = false;
        System.out.println("Enter ID");
        id = input.nextInt();
        for (Employee emp : empset) {
            if (emp.getId() == id) {
                System.out.println(emp);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Employee id not a enter current time");
        }
    }

    // update employee details
    public void UpdateEmployee() {
        found = false;
        System.out.println("Enter ID: ");
        id = input.nextInt();
        for (Employee emp : empset) {
            if (emp.getId() == id) {
                System.out.println("Enter name: ");
                name = input.next();
                System.out.println("Enter new salary: ");
                sal = input.nextDouble();
                // essential your add another details------
                emp.setName(name);
                emp.setSalary(sal);
                System.out.println("Employee are updated details ");
                System.out.println(emp);
                found = true;
            }
        }
        if (!found) {
            System.out.println("employee id not a current time");
        } else {
            System.out.println("Update the succesfuly");
        }
    }

    // delete employee daetails

    public void deleteEmployee() {
        System.out.println("Enter ID: ");
        id = input.nextInt();
        Employee empdelete = null;
        found = false;
        for (Employee emp : empset) {
            if (emp.getId() == id) {
                empdelete = emp;
                found = true;
            }
        }
        if (!found) {
            System.out.println("Employee not current time ");
        } else {
            empset.remove(empdelete);
            System.out.println("Employee delete successfully");
        }
    }

    // add the new employee

    public void addEmployee() {
        System.out.println("Enter id: ");
        id = input.nextInt();
        System.out.println("Enter name");
        name = input.next();
        System.out.println("Enter age: ");
        age = input.nextInt();
        System.out.println("Enter desination");
        desination = input.next();
        System.out.println("Enter Department");
        department = input.next();
        System.out.println("Enter salary");
        sal = input.nextDouble();

        Employee emp = new Employee(id, name, age, desination, department, sal);

        empset.add(emp);
        System.out.println(emp);
        System.out.println("Employee added sucessfully");

    }

}
