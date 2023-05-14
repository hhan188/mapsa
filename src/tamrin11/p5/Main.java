package tamrin11.p5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Student ali = new Student(1001,"Ali");
        ArrayList<Float> aliGrades = new ArrayList<>();
        aliGrades.add(50F);
        aliGrades.add(60F);
        aliGrades.add(95F);
        ali.setGrade(aliGrades);
        try {
            System.out.println(ali.calcAverage());
        } catch (GradeOutOfRangeException e) {
            System.out.println(e.getMessage());
        }

        Student sina = new Student(1002,"Sina");
        ArrayList<Float> sinaGrades = new ArrayList<>();
        sinaGrades.add(50F);
        sinaGrades.add(60F);
        sinaGrades.add(101F);
        sina.setGrade(sinaGrades);
        try {
            System.out.println(sina.calcAverage());
        } catch (GradeOutOfRangeException e) {
            System.out.println(e.getMessage());
        }


    }
}
