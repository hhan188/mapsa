package Practice7.TowenySeven;

import java.util.Scanner;

public class Medium2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your grade");
        int grade = sc.nextInt();
        String check = grade>=60?"Pass":"fail";
        System.out.println(check);
    }
}
