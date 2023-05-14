package tamrin11.p5;

import java.util.ArrayList;

public class Student {

    private int SID;

    private String name;
    private ArrayList<Float> grade;

    public Student(int SID, String name) {
        this.SID = SID;
        this.name = name;
        this.grade = new ArrayList();
    }

    public ArrayList<Float> getGrade() {
        return grade;
    }

    public void setGrade(ArrayList<Float> grade) {
        this.grade = grade;
    }

    public float calcAverage() throws GradeOutOfRangeException {
        float sum = 0;
        for (int i = 0; i < grade.size(); i++) {
            if (grade.get(i) < 0 || grade.get(i) > 100)
                throw new GradeOutOfRangeException(grade.get(i).toString() + " is out of range");
            sum += grade.get(i);
        }
        return sum / grade.size();
    }
}
