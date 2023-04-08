package practices.practice7.exercise15;

import practices.practice7.exercise21.StudentUtils;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student student1;
        student1 = new Student();
        int[] grades = {18, 17, 12, 8};
        student1.setName("Yaser");
        student1.setAge(36);
        student1.setGrades(grades);
        grades = new int[]{15, 16, 17, 20};
        Student student2;
        student2 = new Student();
        student2.setName("Reza");
        student2.setAge(27);
        student2.setGrades(grades);
        grades = new int[]{12, 15, 18, 7};
        Student student3;
        student3 = new Student();
        student3.setName("Mehdi");
        student3.setAge(37);
        student3.setGrades(grades);
        grades = new int[]{20, 12, 19, 18};
        Student student4;
        student4 = new Student();
        student4.setName("Mona");
        student4.setAge(29);
        student4.setGrades(grades);

        //Exercise 15
        System.out.println("****Exercise 15****");
        Student[] students = {student1, student2, student3, student4};
        Student student = new Student();
        student.setStudents(students);
        System.out.println(Arrays.toString(students));

        System.out.println("****Exercise 21****");
        //Exercise 21
        StudentUtils studentUtils = new StudentUtils();
        System.out.println("Best Average goes To: " + studentUtils.maxGrade(students));

    }
}
