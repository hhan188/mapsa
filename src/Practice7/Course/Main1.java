package Practice7.Course;

import java.util.Arrays;

public class Main1 {
    public static void main(String[] args) {

        int[] grades={15,16,20,12};
        Studentt studentt1=new Studentt("Ali",grades);
        grades=new int[]{12,14,8,19};
        Studentt studentt2=new Studentt("Reza",grades);
        grades=new int[]{17,14,15,20};
        Studentt studentt3=new Studentt("Hadi",grades);
        grades=new int[]{8,15,16,17};
        Studentt studentt4=new Studentt("Mona",grades);
//        System.out.println(studentt1);
        Studentt[] studentts={studentt1,studentt2,studentt3,studentt4};
        Course math=new Course("Math",studentts);
        System.out.println(Arrays.toString(studentts));
        CourseUtils utils=new CourseUtils();
        System.out.println((utils.courseAvg(studentts,"Math")));
        System.out.println(math);


    }





}