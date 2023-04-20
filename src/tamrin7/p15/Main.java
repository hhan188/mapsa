package tamrin7.p15;

public class Main {
    public static void main(String[] args) {

        Student[] students = {new Student("Ali", 21),
                new Student("Yasna", 24),
                new Student("Taha", 23),
                new Student("Parsa", 20)
        };
        //Set grades
        students[0].setGrades(new int[]{15, 19, 18, 16});
        students[1].setGrades(new int[]{18, 20, 19});
        students[2].setGrades(new int[]{18, 19});
        students[3].setGrades(new int[]{20, 20, 20, 16, 18});

        for (Student student: students) {
            System.out.println(student.getName() + " > " + student.getAge() + " > " +
                    student.calculateAvg());
        }

    }
}
