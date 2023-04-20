package tamrin7.p17;


public class Main {
    public static void main(String[] args) {

        Student ali = new Student("Ali", 21);
        Student Yasna = new Student("Yasna", 24);
        Student Taha = new Student("Taha", 23);
        Student Parsa = new Student("Parsa", 20);
        Student Masoomeh = new Student("Masoomeh", 38);
        Student Maryam = new Student("Maryam", 35);

        Student[] mathStudents = new Student[3];
        mathStudents[0] = ali;
        mathStudents[0] = Taha;
        mathStudents[0] = Parsa;

        Student[] historyStudents = new Student[]{Yasna, Masoomeh, Maryam};

        Course mathCourse = new Course("Math 1",mathStudents);
        mathCourse.setGrades(new double[]{18.5,17.75,20});

        Course historyCourse = new Course("Iran History",historyStudents);
        historyCourse.setGrades(new double[]{18,17,19.5});

        Course[] courses = new Course[]{mathCourse, historyCourse};
        for (Course c:courses ) {
            System.out.printf("%-22s", (c.getName() + " average: "));
            System.out.printf("%5.2f%n",c.calculateAvgCourse());
        }
    }
}
