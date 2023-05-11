package com.practice10;


import com.practice10.Exercise29.SimpleCalculator;
import com.practice10.Exercise30.Person;
import com.practice10.Exercise31.Wall2;
import com.practice10.Exercise32.Point;
import com.practice10.Exercise33.Calculator;
import com.practice10.Exercise33.Carpet;
import com.practice10.Exercise33.Floor;
import com.practice10.Exercise34.ComplexNumber;
import com.practice10.Exercise35.Circle;
import com.practice10.Exercise35.Cylinder;
import com.practice10.Exercise36.Cuboid;
import com.practice10.Exercise36.Rectangle;
import com.practice10.Exercise37.*;
import com.practice10.Exercise38.Printer;
import com.practice10.Exercise39.Car;
import com.practice10.Exercise39.Ford;
import com.practice10.Exercise39.Holden;
import com.practice10.Exercise39.Mitsubishi;
import com.practice10.Exercise47.Monster;
import com.practice10.Exercise47.Player;

import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        //------------------------------------------------------------------------------------
        //Tamrin 29
        System.out.println("\nTamrin 29");
        System.out.println("------------------------------------------------");

        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add = " + calculator.getAdditionResult());
        System.out.println("subtract = " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply = " + calculator.getMultiplicationResult());
        System.out.println("divide = " + calculator.getDivisionResult());



        //------------------------------------------------------------------------------------
        //Tamrin 30
        System.out.println("\n\nTamrin 30");
        System.out.println("------------------------------------------------");

        Person person = new Person();
        person.setFirstName("");   // firstName is set to empty string
        person.setLastName("");    // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName = " + person.getFullName());
        System.out.println("teen = " + person.isTeen());
        person.setFirstName("John");    // firstName is set to John
        person.setAge(18);
        System.out.println("fullName = " + person.getFullName());
        System.out.println("teen = " + person.isTeen());
        person.setLastName("Smith");    // lastName is set to Smith
        System.out.println("fullName = " + person.getFullName());



        //------------------------------------------------------------------------------------
        //Tamrin 31
        System.out.println("\n\nTamrin 31");
        System.out.println("------------------------------------------------");

        Wall2 wall = new Wall2(5,4);
        System.out.println("area = " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width = " + wall.getWidth());
        System.out.println("height = " + wall.getHeight());
        System.out.println("area = " + wall.getArea());



        //------------------------------------------------------------------------------------
        //Tamrin 32
        System.out.println("\n\nTamrin 32");
        System.out.println("------------------------------------------------");

        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());



        //------------------------------------------------------------------------------------
        //Tamrin 33
        System.out.println("\n\nTamrin 33");
        System.out.println("------------------------------------------------");

        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75, 4.0);
        Calculator carpetCalculator = new Calculator(floor, carpet);
        System.out.println("total= " + carpetCalculator.getTotalCost());
        carpet = new Carpet(1.5);
        floor = new Floor(5.4, 4.5);
        carpetCalculator = new Calculator(floor, carpet);
        System.out.println("total= " + carpetCalculator.getTotalCost());



        //------------------------------------------------------------------------------------
        //Tamrin 34
        System.out.println("\n\nTamrin 34");
        System.out.println("------------------------------------------------");

        ComplexNumber one = new ComplexNumber(1.0, 1.0);
        ComplexNumber number = new ComplexNumber(2.5, -1.5);
        one.add(1,1);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        one.subtract(number);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        number.subtract(one);
        System.out.println("number.real= " + number.getReal());
        System.out.println("number.imaginary= " + number.getImaginary());



        //------------------------------------------------------------------------------------
        //Tamrin 35
        System.out.println("\n\nTamrin 35");
        System.out.println("------------------------------------------------");

        Circle circle = new Circle(3.75);
        System.out.println("circle.radius= " + circle.getRadius());
        System.out.println("circle.area= " + circle.getArea());
        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("cylinder.radius= " + cylinder.getRadius());
        System.out.println("cylinder.height= " + cylinder.getHeight());
        System.out.println("cylinder.area= " + cylinder.getArea());
        System.out.println("cylinder.volume= " + cylinder.getVolume());




        //------------------------------------------------------------------------------------
        //Tamrin 36
        System.out.println("\n\nTamrin 36");
        System.out.println("------------------------------------------------");

        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("rectangle.width= " + rectangle.getWidth());
        System.out.println("rectangle.length= " + rectangle.getLength());
        System.out.println("rectangle.area= " + rectangle.getArea());
        Cuboid cuboid = new Cuboid(5,10,5);
        System.out.println("cuboid.width= " + cuboid.getWidth());
        System.out.println("cuboid.length= " + cuboid.getLength());
        System.out.println("cuboid.area= " + cuboid.getArea());
        System.out.println("cuboid.height= " + cuboid.getHeight());
        System.out.println("cuboid.volume= " + cuboid.getVolume());



        //------------------------------------------------------------------------------------
        //Tamrin 37
        System.out.println("\n\nTamrin 37");
        System.out.println("------------------------------------------------");

        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("North");

        Ceiling ceiling = new Ceiling(12, 55);

        Bed bed = new Bed("Modern",4, 3, 2, 1);

        Lamp lamp = new Lamp("Classic", false, 75);

        Bedroom bedroom = new Bedroom("Your Name Here", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
        bedroom.makeBed();
        lamp.turnOn();



        //------------------------------------------------------------------------------------
        //Tamrin 38
        System.out.println("\n\nTamrin 38");
        System.out.println("------------------------------------------------");

        Printer printer = new Printer(50, true);
        System.out.println(printer.addToner(50));
        System.out.println("Initial Page Count " + printer.getPrintPages());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages Printed was " + pagesPrinted + " New Total Print Count for Printer = " + printer.getPrintPages());
        pagesPrinted = printer.printPages(2);
        System.out.println("Pages Printed was " + pagesPrinted + " New Total Print Count for Printer = " + printer.getPrintPages());



        //------------------------------------------------------------------------------------
        //Tamrin 39
        System.out.println("\n\nTamrin 39");
        System.out.println("------------------------------------------------");

        Car car = new Car(8, "Base Car");
        car.startEngine();
        car.accelerate();
        car.brake();

        Mitsubishi mitsubishi = new Mitsubishi(6, "OutLander VRX 4WD");
        mitsubishi.startEngine();
        mitsubishi.accelerate();
        mitsubishi.brake();

        Ford ford = new Ford(6, "Ford Falcon");
        ford.startEngine();
        ford.accelerate();
        ford.brake();

        Holden holden = new Holden(6, "Holden Commodore");
        holden.startEngine();
        holden.accelerate();
        holden.brake();



        //------------------------------------------------------------------------------------
        //Tamrin 40
        System.out.println("\n\nTamrin 40");
        System.out.println("------------------------------------------------");



        //------------------------------------------------------------------------------------
        //Tamrin 47
        System.out.println("\n\nTamrin 47");
        System.out.println("------------------------------------------------");

        Player player = new Player();
        List<String> list = new ArrayList<>();
        list.add("Tim");
        list.add("10");
        list.add("15");
        player.read(list);
        player.write();
        System.out.println(player);

        Monster monster = new Monster();
        List<String> list2 = new ArrayList<>();
        list2.add("Werewolf");
        list2.add("20");
        list2.add("40");
        monster.read(list2);
        monster.write();
        System.out.println(monster);
    }
}
