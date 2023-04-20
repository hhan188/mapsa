package SoheylSayyah.Practice5;

import java.util.Scanner;

public class TwentyFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Count of Big Flour Bags");
        int bigCount = scanner.nextInt();
        System.out.println("Please Enter Count of Small Flour Bags");
        int smallCount = scanner.nextInt();
        System.out.println("Please Enter Count of Goal Flour Bags");
        int goal = scanner.nextInt();
        System.out.println(canPack(bigCount,smallCount,goal));
    }
    public static boolean canPack(int bigCount,int smallCount,int goal){
        if (bigCount < 0 || smallCount < 0 || goal < 0){
            return false;
        }else if(bigCount * 5 <= goal || bigCount == 0 && smallCount >= goal){
            return true;
        }else {
            return false;
        }
    }
}