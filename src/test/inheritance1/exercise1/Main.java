package test.inheritance1.exercise1;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(36);
        person.setName("Yaser");
        System.out.println("Name:" + person.getName() + " , age:" + person.getAge());
    }
}
