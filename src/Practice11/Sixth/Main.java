package Practice11.Sixth;

public class Main {
    public static void main(String[] args) {
        double[] grades = {50,60,80,90,111};

        try {
            Student student = new Student(grades);
            System.out.println(student.avgGrade());

        }catch (GradeOutOfRangeException e){

            System.out.println(e.getMessage());
        }
    }
}
