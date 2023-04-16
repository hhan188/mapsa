package tamrin27far;

import java.util.Scanner;

public class p3 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("لطفا عدد خود را وارد کنید:");
        int n = scan.nextInt();
        int N = 2*n - 2  ;
        if ( n <= 0) {
            System.exit(0);
        }
        else {
            System.out.println (n+"مین" + " عدد زوج برابر است با :");
            System.out.println(N);
        }
    }

}
