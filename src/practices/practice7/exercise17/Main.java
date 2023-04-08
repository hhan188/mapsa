package practices.practice7.exercise17;

import practices.practice7.exercise15.Student;

public class Main {
    public static void main(String[] args) {
        //variables
        Course math = new Course();
        int mathGrade = 18;
        int physicGrade = 17;

        //student1 objects
        Student student1 = new Student();
        int[] grades = new int[]{mathGrade, physicGrade};
        student1.setName("yaser");
        student1.setAge(36);
        student1.setGrades(grades);

        //student2 objects
        Student student2 = new Student();
        mathGrade = 17;
        physicGrade = 16;
        grades = new int[]{mathGrade, physicGrade};
        student2.setName("Reza");
        student2.setAge(27);
        student2.setGrades(grades);
        //student3 objects
        Student student3 = new Student();
        mathGrade = 12;
        physicGrade = 15;
        grades = new int[]{mathGrade, physicGrade};
        student3.setName("Mehdi");
        student3.setAge(37);
        student3.setGrades(grades);
        //Create Array type of Students
        Student[] students = {student1, student2, student3};
        //create Course object
        math.setName("Math");
        math.setStudents(students);
        System.out.println(math);

        System.out.println("***********************************");

        Course physic = new Course();
        physic.setName("Physic");
        physic.setStudents(students);
        System.out.println(physic);
    }
}
