package Prac11.P6;

import java.util.ArrayList;

public class Student {
    private ArrayList<Integer> grades;

    public Student(ArrayList<Integer> grades) {
        this.grades = grades;
    }

    public void addGrade(int grade) throws GradeOutOfRangeException{
        if (grade < 0 || grade > 100)
            throw new GradeOutOfRangeException("grade out of bound");

        grades.add(grade);
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }

    public double calcAvg() throws GradeOutOfRangeException{
        double sum = 0;
        for (Integer grade : grades) {
            if (grade < 0 || grade > 100)
                throw new GradeOutOfRangeException("grade out bound");

            sum += grade;
        }
        return sum / grades.size();
    }
}
