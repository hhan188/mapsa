package SoheylSayyah.Practice7.Exercise25;

public class UsingEmployee {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new Employee("Soheyl",2000,10);
        employees[1] = new Employee("Ehsan",5000,20);
        employees[2] = new Employee("Ali",3500,25);
        System.out.println(totalSalary(employees));
    }
    public static double totalSalary(Employee[] employees){
        double total = 0;
        for (Employee employee : employees){
            total += (employee.getSalary() + (employee.getSalary() * (employee.getBonusPercentage() / 100)));
        }
        return total;
    }
}
