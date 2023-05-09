package Practice11.one;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;

        Scanner sc=new Scanner(System.in);
        while (true){
            System.out.println("pleas enter one integer: ");
            try {
                number = Integer.parseInt(sc.nextLine());
            }catch (NumberFormatException e){
                System.out.println("like");
            }

        }
    }
}
