package Practice7.Student;

import Practice7.Student.Student;

public class UseStudent {
    public static void main(String[] args) {
        int [] grade1= {19,20,19,19};
        int [] grade2= {20,19,18,19};
        int [] grade3= {12,15,18,19};
        int [] grade4= {12,15,20,19};
    Student[] student=new Student[4];
    student [0] = new Student("Ehsan" , 26);
    student [1] = new Student("soheyl" , 26);
    student [2] = new Student("ali" , 30);
    student [3] = new Student("mohhamad" , 20);
        for (int i = 0; i < student.length; i++) {
            System.out.println(student[i].getAge());
            System.out.println(student[i].getName());
        }
        System.out.println("Ehsan average is "+ avrage(grade1));
        System.out.println("Soheyl average is "+ avrage(grade2));
        System.out.println("ali average is " + avrage(grade3));
        System.out.println("Mohammad average is "+ avrage(grade4));



    }
    public static int avrage(int [] grade){
        int sum = 0;
        for (int i = 0; i < grade.length; i++) {
            sum+=grade[i];

        }
        return sum/grade.length;

    }
}
