package Prac11.P2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        try {
            num = Integer.parseInt(sc.next());
        } catch (NumberFormatException e) {
            System.out.println("entered value not number");
        }
        System.out.println(num);
    }
}
