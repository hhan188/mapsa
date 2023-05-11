package com.practice9.thisVSsuper;

public class Manager extends Employee
{
    private String department;

    public Manager(String name, int age, double salary, String department) {
        super(name, age, salary);
        this.department = department;
    }
}
