package package01;

import java.io.Serializable;

public class Employee {

    private int id;
    private String name;
    private int age;
    private String desination;
    private String Department;
    private double salary;

    /* id for getter and setter */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    /* name for getter and setter */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /* age getter and stters */

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /* designation getter and setters */

    public String getDesignation() {
        return desination;
    }

    public void setDesignation(String desination) {
        this.desination = desination;
    }

    /* department getter and settre */

    public String getDepartmant() {
        return Department;
    }

    public void setDepartmant(String Department) {
        this.Department = Department;
    }

    /* sallry getter and setters */

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee[id=" + id + ", name= " + name + ", age=" + age + ", desination=" + desination
                + ", department= " + Department + ", salary= " + salary + "]";
    }

    public Employee(int id, String name, int age, String desination, String Department, double salary) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
        this.desination = desination;
        this.Department = Department;
        this.salary = salary;
    }

}
