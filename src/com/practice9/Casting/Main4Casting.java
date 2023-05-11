package com.practice9.Casting;

public class Main4Casting
{
    public static void main(String[] args)
    {

        //-----------------------------------------------------
        //First Part

        Shape [] circles = new Circle [3];

        Shape [] rectangles = new Rectangle [3];

        for (int i = 0; i < circles.length; i++)
        {
            circles[i] = new Circle();
            circles[i].draw();
        }

        for (int i = 0; i < rectangles.length; i++)
        {
            rectangles[i] = new Rectangle();
            rectangles[i].draw();
        }

        System.out.println("-----------------------------------");

        Circle [] newCircles = (Circle[]) circles;
        Rectangle [] newRectangles = (Rectangle[]) rectangles;

        for (int i = 0; i < newCircles.length; i++)
        {
            newCircles[i] = new Circle();
            newCircles[i].enlarge();
        }

        for (int i = 0; i < newRectangles.length; i++)
        {
            newRectangles[i] = new Rectangle();
            newRectangles[i].shrink();
        }

        System.out.println("-----------------------------------");

        //-----------------------------------------------------
        //Second Part

        Person teacher = new Teacher();
        Person student = new Student();

        teacher.introduce();
        student.introduce();

        Teacher newTeacher = (Teacher) teacher;
        newTeacher.introduce();

    }
}
