package Practice7.Student2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("ehsan", 4);
        Student student2 = new Student("soheyl", 19);
        Student student3 = new Student("reza", 18);
        Student[] students = {student1,student2,student3};
        System.out.println(Arrays.toString(students));
        StudentUtils utils=new StudentUtils();
        System.out.println("Best Average Goes To: "+utils.getMaxAvg(students));



    }

}
