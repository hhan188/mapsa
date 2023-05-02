package practices.practice9.finaltxt.employee;

public class Main {
    public static void main(String[] args) {
        Employee employee=new Employee("Yaser",1780000);
        double raise=150000;
        System.out.println(employee.getSalary());
        System.out.println(employee.raiseSalary(raise));
        System.out.println(employee.getSalary());
    }
}
