package tamrin6.P9;

public class UsingPersonInfo {
    public static void main(String[] args) {

        PersonInfo person = new PersonInfo("Mohammad", "Jalili", 24);
        System.out.println("Name: " + person.getFullName());
        System.out.println("Age: " + person.getAge());

    }
}

