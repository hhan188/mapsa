package tamrin27far;

import java.util.Scanner;

public class p10 {
    public static void main(String args []) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your numbers :");
        String n1 = scan.nextLine();
        String n2 = scan.nextLine();
        int nn1 = Integer.parseInt(n1);
        int nn2 = Integer.parseInt(n2);

        if ( nn1 > nn2 ){
            System.out.println(nn2);
        } else if (nn2 > nn1) {
            System.out.println(nn1);
        } else if (nn1 == nn2) {
            System.out.println(nn1);
            
        }
    }
    }