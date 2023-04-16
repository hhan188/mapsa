package tamrin6.P8;

public class UsingEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee("Ali Samsami", "Manager", 50000);
        System.out.println("Employee name: " + emp.getName());
        System.out.println("Position: " + emp.getPosition());
        System.out.println("Salary: $" + emp.getSalary());

        emp.raiseSalary(10);
        System.out.println("Salary after 10% raise: " + emp.getSalary() + "$");
    }
}


