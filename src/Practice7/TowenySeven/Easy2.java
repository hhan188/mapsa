package Practice7.TowenySeven;

import java.util.Scanner;

public class Easy2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number one");
        int number1= sc.nextInt();
        System.out.println("enter number two");
        int number2 = sc.nextInt();
        int min=number1>number2?number2:number1;
        System.out.println(min);
    }
}
