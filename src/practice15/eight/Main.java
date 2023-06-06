package practice15.eight;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> str1=new ArrayList<>();
        str1.add("A");
        str1.add("B");
        str1.add("C");
        str1.add("D");

        ArrayList<String> str2=new ArrayList<>();
        str1.add("A");
        str1.add("B");
        str1.add("C");
        str1.add("D");

        ArrayList<String> str3=new ArrayList<>();
        str1.add("A");
        str1.add("B");
        str1.add("B");
        str1.add("D");


        System.out.println("Your String counts is :"+CountLetters.countLetter(str1, str2, str3, "B"));

    }
}
