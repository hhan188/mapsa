package Prac9.Final.P4;

public class Employee {
    private final String name;
    private final MutableDouble salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = new MutableDouble(salary);
    }

    public String getName() {
        return name;
    }

    public MutableDouble getSalary() {
        return salary;
    }

    public void raiseSalary(double amount) {
        if (amount < 0)
            return;

        salary.setValue(salary.getValue() + amount);
    }
}
