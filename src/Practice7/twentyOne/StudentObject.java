package Practice7.twentyOne;

public class StudentObject {
    public static void main(String[] args) {
        Student[] students = {new Student("AA", 19), new Student("BB", 20), new Student("CC", 17), new Student("ZZ", 10)};
        double highestGPA = 0;
        String highestGpaName = "";
        for (int i = 0; i < 4; i++) {
            if (highestGPA < students[i].getGPA()) {
                highestGPA = students[i].getGPA();
                highestGpaName = students[i].getName();
            }
        }
        System.out.println("\"" + highestGpaName + "\"" + " has the highest GPA with grade of :" + highestGPA);
    }

}
