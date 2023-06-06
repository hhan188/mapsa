package practice15.eleven;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum= sc.nextInt();
        System.out.println(perfectNumber(sum));

    }
    public static boolean perfectNumber(int number){
        int sum=0;
        for (int i = 1; i < number; i++) {
            if(number%i==0){
                sum+=i;
            }
        }if (number==sum){
            return true;
        }else return false;
    }
}
