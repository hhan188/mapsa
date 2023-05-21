package Practice11.Two;

import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int number;
        while (true){
            try {
                number = Integer.parseInt(sc.nextLine());
                System.out.println("your number is : "+ number);
            }catch (NumberFormatException e){
                System.err.println(e.getMessage());
                break;
            }

        }



    }
    }

