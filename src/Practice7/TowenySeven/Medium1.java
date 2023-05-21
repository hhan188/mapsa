package Practice7.TowenySeven;

import java.util.Scanner;

public class Medium1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your first number");
        int firstNumber=sc.nextInt();
        System.out.println("enter your second number");
        int secondNumber=sc.nextInt();
        System.out.println("enter your third number");
        int thirdNumber= sc.nextInt();

        int maxOneAndTow = firstNumber>secondNumber?firstNumber:secondNumber;
        int maxThird = maxOneAndTow>thirdNumber?maxOneAndTow:thirdNumber;
        System.out.println(maxThird);
    }
}
