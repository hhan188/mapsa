package SoheylSayyah.Practice15.Exercise11;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Your Number :");
        int number = scanner.nextInt();
        System.out.println(perfectNumber(number));
    }
    public static boolean perfectNumber(int number){
        int sum = 0;
        for (int i = 1 ; i < number ; i++){
            if (number % i == 0){
                sum += i;
            }
        }
        return sum == number;
    }
}
