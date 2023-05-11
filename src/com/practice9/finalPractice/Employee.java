package com.practice9.finalPractice;

public class Employee
{
    private final String name;
    private final double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void raiseSalary (double amount)
    {
        if (amount < 0)
        {
            System.out.println("Salary Can't Decrease");
        }

        else
        {
            System.out.println(this.salary + amount);
        }

    }
}
