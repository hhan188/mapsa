package practices.practice22.answers.exercise19;

public class Main {

private final static String query="update person\n" +
        "set email='old_Email@gmail.com'\n" +
        "where age in (select * from (select max(age) from person) as max_age)";

    public static void main(String[] args) {

    }
}
