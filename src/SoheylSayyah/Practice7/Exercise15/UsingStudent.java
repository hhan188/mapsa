package SoheylSayyah.Practice7.Exercise15;

public class UsingStudent {
    public static void main(String[] args) {
        Student[] students = new Student[4];
        students[0] = new Student("Soheyl",26);
        students[1] = new Student("Ali",30);
        students[2] = new Student("Ehsan",26);
        students[3] = new Student("Mohammad",20);
        int[] soheyl = {10,15,17,20};
        int[] ali = {11,15,18,19};
        int[] ehsan = {19,18,17,20};
        int[] mohammad = {20,19,18,20};
        for (int i = 0; i < students.length ; i++) {
            System.out.println(students[i].getName());
            System.out.println(students[i].getAge());
        }
        System.out.println(average(soheyl));
        System.out.println(average(ali));
        System.out.println(average(ehsan));
        System.out.println(average(mohammad));
    }
    public static int average(int[] grades){
        int sum = 0;
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }
        return sum / grades.length;
    }
}
