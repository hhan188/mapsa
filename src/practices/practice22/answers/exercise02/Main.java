package practices.practice22.answers.exercise02;

import static practices.practice22.answers.exercise02.FindAllPerson.findAllPerson;

public class Main {
    public static void main(String[] args) {
       findAllPerson().forEach(System.out::println);
    }
}

