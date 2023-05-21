package Practice11.First;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int number;
        while (true){
            try {
                number = sc.nextInt();
                System.out.println("your number is : "+ number);
            }catch (NumberFormatException e){
                System.err.println(e.getMessage());
                break;
            }

        }



    }
}
