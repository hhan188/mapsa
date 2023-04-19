package Practice7.eighteen;

public class PersonObject {
    public static void main(String[] args) {
        Person[] persons = new Person[3];
        double average=0;
        for (int i = 0; i < 3; i++) {
            persons[i]  = new Person();
            persons[i].setAge(15);
            average += persons[i].getAge();
        }
        System.out.println(average/3);
    }
}
