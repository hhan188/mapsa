package SoheylSayyah.Practice9.Final.Employee;

public class Employee {
    private final String name;
    private final double salary;

    public Employee(String name,double salary) {
        this.name = name;
        this.salary = salary;
    }
    public double raiseSalary(double amount){
        if (amount < 0){
            return salary;
        }
        double newSalary = salary + amount;
        return newSalary;
    }
}
