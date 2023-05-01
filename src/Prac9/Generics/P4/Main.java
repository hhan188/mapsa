package Prac9.Generics.P4;

public class Main {
    public static void main(String[] args) {
        Option<String> stringOption = new Option<>();
        System.out.println(stringOption.getValue());
        Option<String> stringOption1 = new Option<>("sajjad");
        System.out.println(stringOption1.getValue());
    }
}
