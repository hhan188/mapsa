package SoheylSayyah.Practice5;

import java.util.Scanner;

public class TwentySix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Your Number");
        int number = scanner.nextInt();
        drawStars(number);
    }
    public static void drawStars(int number){
        for (int i = 1 ; i <= number ; i++){
            for (int j = 1 ; j <= number ; j++){
                if (i == 1 || i == number || j == 1 || j == number || i == j || j == number - i + 1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
