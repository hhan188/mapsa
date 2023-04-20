package SoheylSayyah.Practice7.Exercise21;

public class UsingStudent {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("Soheyl",18);
        students[1] = new Student("Ehsan",20);
        students[2] = new Student("Reza",19);
        System.out.println(highGPA(students));
    }
    public static String highGPA(Student[] students) {
        int high = 0;
        String name = "";
        for (Student student : students) {
            if (student.getGpa() > high) {
                high = student.getGpa();
                name = student.getName();
            }
        }
        return name;
    }
}
