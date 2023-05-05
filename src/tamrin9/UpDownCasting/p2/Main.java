package tamrin9.UpDownCasting.p2;

public class Main {
    public static void main(String[] args) {

        Person person = new Person();
        Teacher teacher = new Teacher();
        Student student = new Student();

        Person p1 = teacher;
        p1.introduce();
        Person p2 = student;
        p2.introduce();

        Teacher t1 = (Teacher) p1;
        t1.introduce();


    }
}

