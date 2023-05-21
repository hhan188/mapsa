package Practice7.Person1;

public class Main2 {
    public static void main(String[] args) {
        Person1[] people = new Person1[3];
        people[0] = new Person1("soheyl",26);
        people[1] = new Person1("Ehsan",26);
        people[2] = new Person1("ali",30);
        double sum = 0;
        for (Person1 item:people) {
            sum+=item.age();
        }
        double avrage = sum/ people.length;
        System.out.println(avrage);
    }
}
