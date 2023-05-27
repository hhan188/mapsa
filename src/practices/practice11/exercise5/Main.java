package practices.practice11.exercise5;


// Write a program that simulates a student grading system.
// Create a Student class with a method for calculating the average grade of the student,
// and a GradeOutOfRangeException class that extends Exception.
// If any of the grades are outside the allowable range of 0-100,
// throw a GradeOutOfRangeException and display an error message.

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws GradeOutOfRangeException {
        Student ali = new Student("ali", 15.6);
        Student yaser = new Student("Yaser", 99);
        Student fati = new Student("Fati", 85);
        Student hosein = new Student("Hosein", 125);
        Student naser = new Student("Naser", 52);
        List<Student> list = new ArrayList<>();
        list.add(ali);
        list.add(yaser);
        list.add(fati);
        list.add(hosein);
        list.add(naser);
        try {
            FileWriter fw = new FileWriter("D:\\my-new-projects-intellige\\mapsa\\ershadbakhsh\\mapsa\\src\\practices\\practice11\\exercise5\\database.txt");

            for (Student student : list) {
                fw.append(String.valueOf(student)).append("\n");
            }
            fw.close();
        } catch (GradeOutOfRangeException e) {
            System.out.println(e.getException(e));


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
