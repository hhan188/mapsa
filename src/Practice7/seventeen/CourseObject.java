package Practice7.seventeen;

import java.util.Arrays;

public class CourseObject {
    public static void main(String[] args) {
        Course[] courses = new Course[2];
        int[] stuGrades = {20,19,18};
        for (int i =0 ; i<2;i++){
            courses[i]=new Course();
            courses[i].setName("");
            courses[i].setStudents(stuGrades);
            System.out.println(courses[i].getName());
            System.out.println(courses[i].getAv());
            System.out.println(Arrays.toString(courses[i].getStudents()));
        }
    }
}
