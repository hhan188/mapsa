package Prac9.ThisAndSuperCalls.P1;

public class Manager extends Employee{
    String department;
    public Manager(String name, int age, double salary, String department) {
        super(name, age, salary);
        this.department = department;
    }
}
