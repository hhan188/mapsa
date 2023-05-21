package Practice11.Sixth;

public class Student {
    private double[] grade;

    public Student(double[] grade) throws GradeOutOfRangeException
    {
        for (int i = 0; i < grade.length; i++) {
            if (grade[i] > 100 || grade[i]<0) {
                throw new GradeOutOfRangeException("grade is out of range");
            }
        }
        this.grade = grade;

    }

    public Student() {
    }

    public double[] getGrade() {
        return grade;
    }

    public double avgGrade(){
        double sum =0;

        for (int i = 0; i <grade.length ; i++) {
        sum+=grade[i];


        }
         double avg=sum/grade.length;
        return avg;
    }
}
