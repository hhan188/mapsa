import java.util.Date;

public class Person {

    //variables
    String name = "Ali";
    String lastName = "Asadi";
    int age = 63;
    String Adderss="Tehran-Vanak";
    long phoneNumber = 912;
    Date birthdate;
    //0-1
    //true-false
    Boolean flag = true;

    //methods

    private void printPersonName(String N){
        System.out.println("person name: "+N);
    }

    public Boolean printPersonAge(int a,boolean f){
        System.out.println("Person.printPersonAge: "+a);
        f=false;
        printPersonName("Hanieh");
        printPersonName(this.name);
        System.out.println("Person.printPersonAge.flag: "+f);
        return f;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Person p = new Person();
        Boolean flag= p.printPersonAge(p.age , p.flag);

    }

}
