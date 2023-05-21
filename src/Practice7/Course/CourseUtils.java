package Practice7.Course;

public class CourseUtils {
    public double[] courseGrade(Studentt[] studentts, String courseName) {
        int number=0;
        if (courseName.equalsIgnoreCase("Math")){
            number=0;
        }else number=1;
        double[] grades=new double[studentts.length];
        for (int i = 0; i <studentts.length ; i++) {
            grades[i]=studentts[i].getGrade()[number];
        }
        return grades;
    }
    public double courseAvg(Studentt[] studentts,String courseName){
        double avg=0;
        for (int i = 0; i <studentts.length ; i++) {
            avg+=courseGrade(studentts,courseName)[i];
        }
        return avg/studentts.length;
    }

}
