package Practice7.thirteen;

public class PersonObjects {
    public static void main(String[] args) {
        Person[] persons = new Person[5];
        for (int i = 0; i < 5; i++) {
            persons[i] = new Person();

            persons[i].setAddress("kkkkkk");
            persons[i].setAge(18);
            persons[i].setName("Mohmmad");

            System.out.println(persons[i].getAddress());
            System.out.println(persons[i].getAge());
            System.out.println(persons[i].getName());
        }
    }
}
