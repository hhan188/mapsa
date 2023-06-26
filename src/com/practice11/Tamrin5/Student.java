package com.practice11.Tamrin5;

public class Student
{
    private double [] grades;

    public Student(double[] grade) throws GradeOutOfRangeException
    {
        for (double g: grade)
        {
            if (g < 0 || g > 100)
            {
                throw new GradeOutOfRangeException("Entered Grade " + g + " Is Not Allowable");
            }

        }
        this.grades = grade;
    }

    public double[] getGrade() {
        return grades;
    }

    public double avgGrade ()
    {
        double sum = 0;
        for (double g : grades)
        {
            sum += g;
        }

        return sum / grades.length;
    }
}
