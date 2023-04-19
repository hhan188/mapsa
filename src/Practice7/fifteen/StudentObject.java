package Practice7.fifteen;

import Practice7.nineteen.Circle;

import java.util.Arrays;

public class StudentObject {
    public static void main(String[] args) {
        Student[] students = new Student[4];

        for (int i=0;i<4;i++){
            students[i] = new Student();

            int[] grades = {9,7,0,20,13};
            students[i].setAge(18);
            students[i].setName("mm");
            students[i].setGrades(grades);

            System.out.println(students[i].getAge());
            System.out.println(students[i].getName());
            System.out.println(Arrays.toString(students[i].getGrades()));
        }
    }
}
