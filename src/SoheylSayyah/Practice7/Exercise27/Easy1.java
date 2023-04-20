package SoheylSayyah.Practice7.Exercise27;

import java.util.Scanner;

public class Easy1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter True or False : ");
        boolean yesOrNo = scanner.nextBoolean();
        String check = yesOrNo ? "Yes" : "No";
        System.out.println(check);
    }
}
