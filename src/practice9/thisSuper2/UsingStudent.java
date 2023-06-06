package practice9.thisSuper2;

import practice9.thisSuper2.Student;

public class UsingStudent {
    public static void main(String[] args){
        Student student=new Student("mersedeh",34,"female","computer science");
        System.out.println(student.getName()+" "+student.getAge()+ " "+student.getGender()+" "+student.getMajor());
    }
}
