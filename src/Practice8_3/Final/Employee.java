package Practice8_3.Final;

public class Employee {
    private final String name="Ali";
    private final int salary=20000;
    public void raiseSalary(double increases ){
        double newSalary=salary+increases;

    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
}
