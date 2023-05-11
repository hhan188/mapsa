package com.practice9.finalPractice;

public class Main4Final
{
    public static void main(String[] args)
    {
        //-------------------------------------------------
        //Tamrin 2
        Circle circle = new Circle(4);
        System.out.println(circle);


        //-------------------------------------------------
        //Tamrin 3
        Rectangle rectangle = new Rectangle(5, 6);
        rectangle.calcArea();
        rectangle = new Rectangle(8);
        rectangle.calcArea();


        //-------------------------------------------------
        //Tamrin 4
        Employee emp = new Employee("Ramin", 20000);
        emp.raiseSalary(2000);


        //-------------------------------------------------
        //Tamrin 5
        System.out.println((MathUtils.factorial(6)));
        System.out.println(MathUtils.isPrime(17));
    }
}
