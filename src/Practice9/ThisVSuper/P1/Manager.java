package Practice9.ThisVSuper.P1;

public class Manager extends Employee{
    String department;

    public Manager( String name, int age, double salary, String department) {
        super(name, age, salary);
        this.department = department;
    }
}
