package SoheylSayyah.Practice7.Exercise25;

public class Employee {
    private String name;
    private double salary;
    private double bonusPercentage;

    public Employee(String name, double salary, double bonusPercentage) {
        this.name = name;
        this.salary = salary;
        this.bonusPercentage = bonusPercentage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonusPercentage() {
        return bonusPercentage;
    }

    public void setBonusPercentage(double bonusPercentage) {
        this.bonusPercentage = bonusPercentage;
    }
}
