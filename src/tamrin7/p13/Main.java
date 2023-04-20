package tamrin7.p13;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Ali",25,"Tehran");
        Person person2 = new Person("Mona",35,"Kerman");
        Person person3 = new Person("Hani",23,"Tehran");
        Person person4 = new Person("Mahdi",50,"Bandar Abbas");
        Person person5 = new Person("Ehsan",40,"Karaj");

        Person[] people = new Person[5];
        people[0] = person1;
        people[1] = person2;
        people[2] = person3;
        people[3] = person4;
        people[4] = person5;

        for (Person p : people) {
            System.out.println(p.getName() + " is " + p.getAge());
        }

    }
}
