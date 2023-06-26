package com.practice11.Tamrin5;

public class Tamrin5
{
    public static void main(String[] args)
    {
        try
        {
            Student student = new Student(new double[]{20, 50, 110, 90});
            System.out.println(student.avgGrade());
        }
        catch (GradeOutOfRangeException e)
        {
            System.err.println(e.getMessage());
        }
    }
}
