package practice9.final4;

public class EmployeeFinal {
    private final String name;
    private final double salary;

    public EmployeeFinal(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double raiseSalary(double amount){
        if (amount>0){
            return salary+amount;
        }
        else{
            return 0.0;
        }
    }
}
