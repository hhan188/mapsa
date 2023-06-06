package practice15.ten;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please Enter your Name :");
        String firstPlayer= sc.nextLine();
        System.out.println("please Enter your Name :");
        String secondPlayer= sc.nextLine();
        System.out.println("please chose 1: roch,2:paper,3:scissors :");
        String p1=sc.nextLine();
        String p2=sc.nextLine();
        if (p1.equalsIgnoreCase("roch")&&p2.equalsIgnoreCase("paper")){
            System.out.println(" firstPlayer is whine:");
        } else if (p1.equalsIgnoreCase("roch")&&p2.equalsIgnoreCase("scissors")) {
            System.out.println("second Player is whine");
        } else if (p1.equalsIgnoreCase("scissors")&&p2.equalsIgnoreCase("roch")) {
            System.out.println("second Player is whine");
        } else if (p1.equalsIgnoreCase("paper")&&p2.equalsIgnoreCase("scissors")){
            System.out.println("second Player is whine");
        } else System.out.println("pleas Enter true Data");




    }
}
