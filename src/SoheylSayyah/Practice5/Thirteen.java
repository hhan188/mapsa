package SoheylSayyah.Practice5;

import java.util.Scanner;

public class Thirteen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Your Year :");
        int year = scanner.nextInt();
        System.out.println("Please Enter Your Month :");
        int month = scanner.nextInt();
        if (getDaysInMonth(year,month) == -1){
            System.out.println(-1);
        }else {
            System.out.println("Leap Year is " + isLeapYear(year));
            System.out.println("Days in This Month is " + getDaysInMonth(year,month));
        }
    }

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }
        if (year % 4 == 0 && year % 100 == 0){
            return false;
        }else if (year % 4 == 0 && year % 100 != 0){
            return false;
        } else if (year % 4 == 0 && year % 400 == 0) {
            return true;
        }else {
            return false;
        }
    }
    public static int getDaysInMonth(int year,int month){
        if (month < 1 || month > 12 && year < 1 || year > 9999){
            return -1;
        }else if (month < 7){
            return 31;
        }else if (month == 12 && isLeapYear(year) == true){
            return 29;
        }else {
            return 30;
        }
    }
}