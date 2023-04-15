package Prac6;

public class Employee {
    private String name;
    private String position;
    private double salary;
    public Employee(String name, String position, double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public void raiseSalary(double percentage) {
        salary = salary * (1 + percentage / 100);
        System.out.println("salary " + salary);
    }
}
