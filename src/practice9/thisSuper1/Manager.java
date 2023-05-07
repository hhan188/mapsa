package practice9.thisSuper1;

import practice9.thisSuper1.Employee;

public class Manager extends Employee {
    private String department;

    public Manager(String name,int age, double salary,String department){
        super(name, age, salary);
        this.department=department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
