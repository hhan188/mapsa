package SoheylSayyah.Practice7.Exercise18;

public class UsingPerson {
    public static void main(String[] args) {
        Person[] people = new Person[3];
        people[0] = new Person("Soheyl",26);
        people[1] = new Person("Ehsan",26);
        people[2] = new Person("Ali",29);
        double sum = 0;
        for (Person item:people) {
            sum += item.age();
        }
        double average = sum / people.length;
        System.out.println(average);
    }
}