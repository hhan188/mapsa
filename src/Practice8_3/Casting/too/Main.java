package Practice8_3.Casting.too;

public class Main {
    public static void main(String[] args) {
        Person person1 =new Teacher();
        Person person2=new Student();
        person1.introduce();
        person2.introduce();;

        Person student1=(Person) new Student();
        Person student2=(Person) new Teacher();
        student1.introduce();
        student2.introduce();
    }
}
