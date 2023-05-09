package Practice11.five;

import java.util.ArrayList;

public class Student {
    private ArrayList<Integer> grades;

    public Student(ArrayList<Integer> grades) {
        this.grades = grades;
    }

    public Student() {
    }

    public void addGrade(int grade) throws GradeOutOfRangeException{
        if (grade < 0 || grade > 100)
            throw new GradeOutOfRangeException("grade out of bound");

        grades.add(grade);
        System.out.println(grades);
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }
    public void calcAvg() throws GradeOutOfRangeException{
        double sum = 0;
        for (Integer grade : grades) {
            if (grade < 0 || grade > 100)
                throw new GradeOutOfRangeException("grade out bound");

            sum += grade;

        }
        System.out.println(sum / grades.size());
    }
}
