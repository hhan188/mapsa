package tamrin9.Final.p4;

public class Employee {
    private final String name;
    private double salary;

    public Employee(String name) {
        this(name,0.0);
    }

    public Employee(String name, double salary) {
        this.name = name;
        setSalary(salary);
    }

    private void setSalary(double salary) {
        if (salary >= 0)
            this.salary = salary;
    }

    public final void raiseSalary(double amount) {
        if (amount > 0)
            salary += amount;
    }
}
