package tamrin7.p21;

public class Main {
    public static void main(String[] args) {

        Student[] students = new Student[3];
        students[0] = new Student("Damoon", 15.25);
        students[1] = new Student("Sahar", 17.36);
        students[2] = new Student("Ali", 16.55);

        String highGPAName = highestGPAFinder(students);
        System.out.println("Result: " + highGPAName);
    }

    private static String highestGPAFinder(Student[] students) {

        int indexOfTarget = 0;
        double temp = students[0].getGPA();
        for (int i = 1; i < students.length; i++) {
            if (students[i].getGPA() > temp) {
                indexOfTarget = i;
                temp = students[i].getGPA();
            }
        }
        return students[indexOfTarget].getName();
    }
}
