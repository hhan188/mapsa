package tamrin27far;

import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the ditance ( Greater than zero ) :");
        int distance = scanner.nextInt();
        int fuel = distance * 10 ;
        if (distance <= 0){
           System.exit(0);
        }
        if (fuel < 100) {
            System.out.println("100");
        } else {
            System.out.println(fuel);;
        }
    }
}
