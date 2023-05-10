package SoheylSayyah.Practice11.Exercise5;

public class Student {
    private double[] grade;

    public Student(double[] grade) throws GradeOutOfRangeException {
        for (int i = 0 ; i < grade.length ; i++){
            if (grade[i] < 0 || grade[i] > 100){
                throw new GradeOutOfRangeException("Grade Out Of Range");
            }else {
                this.grade = grade;
            }
        }
    }
    public Student() {
    }
    public double[] getGrade() {
        return grade;
    }
    public void setGrade(double[] grade) {
        this.grade = grade;
    }
    public double average(){
        double sum = 0;
        for (double s : grade) {
            sum += s;
        }
        return sum / grade.length;
    }
}
