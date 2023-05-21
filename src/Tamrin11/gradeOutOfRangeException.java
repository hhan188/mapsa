package Tamrin11;

public class gradeOutOfRangeException extends Exception {

  //  Write a program that simulates a student grading system.
    //  Create a Student class with a method for calculating the average grade of the student,
    //  and a GradeOutOfRangeException class that extends Exception.
    //  If any of the grades are outside the allowable range of 0-100,
    //  throw a GradeOutOfRangeException and display an error message.

    public gradeOutOfRangeException(String message) {
        super(message);

    }
}
