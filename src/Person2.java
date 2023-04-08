import java.util.Date;

public class Person2 {

    //variables
    String name = "Ali";
    String lastName = "Asadi";
    int age = 63;
    String Adderss="Tehran-Vanak";
    long phoneNumber = 912;

    //0-1
    //true-false
    Boolean flag = true;

    //methods

    public void printPersonName(String N){
        System.out.println("person name: "+N);
    }

    public  Boolean printPersonAge(int a,boolean f){
        System.out.println("Person.printPersonAge: "+a);
        f=false;
        printPersonName("Hanieh");

        System.out.println("Person.printPersonAge.flag: "+f);
        return f;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
       // int a = 6;
       // printPersonAge(a,true);
        Person2 p = new Person2();
        Boolean flag= p.printPersonAge(p.age , p.flag);

    }

}
