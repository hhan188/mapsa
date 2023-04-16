package tamrin6.P2;

public class UsingStudentRecord {
    public static void main(String [] args){
        StudentRecord S1 = new StudentRecord("ali" , 154946, 21 , 60);
        System.out.println("name is : " + S1.getName());
        System.out.println("age is : " + S1.getAge());
        System.out.println("his ID number is : " + S1.getID());
        System.out.println("his gpa number is : " + S1.getGpa());
    }


}
