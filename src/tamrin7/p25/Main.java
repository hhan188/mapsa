package tamrin7.p25;

import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {

        Employee[] employees = new Employee[3];

        employees[0] = new Employee("Ali", 10000);
        employees[1] = new Employee("Shima", 7500);
        employees[2] = new Employee("Solmaz", 12750);

        double totalBonusAdded = bonusIncrementer(employees, 10.0);

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String currencyStr = currency.format(totalBonusAdded);
        System.out.println("Total bonus added: " + currencyStr);
    }

    private static double bonusIncrementer(Employee[] employees, double bonusPercent) {

        double totalBonus = 0;
        double employeeBonus = 0;
        for (int i = 0; i < employees.length; i++) {
            employeeBonus = employees[i].getSalary() * bonusPercent / 100;
            totalBonus += employeeBonus;
            employees[i].setSalary(employees[i].getSalary() + employeeBonus);
        }
        return totalBonus;
    }
}
