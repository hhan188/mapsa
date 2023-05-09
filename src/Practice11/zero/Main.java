package Practice11.zero;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        Scanner sc=new Scanner(System.in);
       while (true){
           System.out.println("Enter any valid Integer: ");
           try {
               number = Integer.parseInt(sc.next());
               System.out.println("You entered: " + number);


           } catch (NumberFormatException e) {

               System.out.println("NumberFormatException occurred");
           }
       }

    }
}
