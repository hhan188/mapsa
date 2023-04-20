package SoheylSayyah.Practice7.Exercise13;

public class UsingPerson {
    public static void main(String[] args) {
        Person[] people = new Person[5];
        people[0] = new Person("Soheyl",26,"Sattarkhan");
        people[1] = new Person("Ehsan",26,"Heravi");
        people[2] = new Person("Ali",30,"Afsariye");
        people[3] = new Person("Mohammad",20,"Shahrak");
        people[4] = new Person("Saji",20,"Dadman");
        for (int i = 0; i < 5; i++) {
            System.out.println(people[i].getName());
            System.out.println(people[i].getAge());
        }
    }
}
