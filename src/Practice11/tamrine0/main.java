package Practice11.tamrine0;

import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter your input:");

        try {
           int input= scanner.nextInt();
            System.out.println("your input is a valid integer  " +input);

        }catch(InputMismatchException e){
            System.out.println("input mismatch exception: "+e.getMessage());
        }
    }
}


//import java.util.InputMismatchException;
//import java.util.Scanner;
//
//public class main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Please Enter a Number :");
//        int number;
//        while (true){
//            try {
//                number = scanner.nextInt();
//                System.out.println("Your Number is a Valid Integer : " + number);
//            } catch (InputMismatchException e) {
//                System.err.println("User Input Was Not Valid.");
//                break;
//            }
//        }
//    }
//}
