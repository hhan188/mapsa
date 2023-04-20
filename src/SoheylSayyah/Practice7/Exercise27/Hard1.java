package SoheylSayyah.Practice7.Exercise27;

import java.util.Scanner;

public class Hard1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Your Text : ");
        String text = scanner.nextLine();
        String check = text.contains("a") || text.contains("e") || text.contains("i") || text.contains("o") || text.contains("u") ? "Vowel Present" : "No Vowel Present";
        System.out.println(check);
    }
}