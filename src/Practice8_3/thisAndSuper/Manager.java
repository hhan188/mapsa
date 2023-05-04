package Practice8_3.thisAndSuper;

public class Manager extends Employee{
    private String departman;

    public Manager(String name, int age, double salary, String departman) {
        super(name, age, salary);
        this.departman = departman;
    }
}
