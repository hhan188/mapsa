package tamrin6;
//Problem 8 solution
import java.text.NumberFormat;

public class Employee {

    private String name;
    private String position;
    private double salary;

    public Employee (String name, String position, double salary){
        this.name = name;
        this.position = position;
        setSalary(salary);
    }

    public void setSalary(double salary) {
        if (salary < 0)
            throw new IllegalArgumentException("Salary cannot be negative!");
        this.salary = salary;
    }

    public void raiseSalary(float raisePercentage){
        if (raisePercentage < 0){
            System.err.println("Percentage should be positive!");
            return;
        }
        setSalary(salary * (1 + (raisePercentage / 100)));
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String salaryTxt = currency.format(salary);
        System.out.println("New salary after increase is " + salaryTxt);
    }


}
