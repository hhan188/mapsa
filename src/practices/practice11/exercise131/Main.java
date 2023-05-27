package practices.practice11.exercise131;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {

    //Write a program that reads a list of integers from the user and calculates their sum using a try-with-resources block.
    // Use a Scanner to read the integers from the console.
    public static void main(String[] args) {
        System.out.println("sum of the number is: "+sum());
    }

    protected static int sum() {

        try (Scanner scanner = new Scanner(System.in)) {
            int sum = 0;
            int number;
            List<Integer> integers=new ArrayList<>();
            while (true) {
                System.out.print("Please Enter A Number: ");
               number=scanner.nextInt();
               if (number==-1){
                   break;
               }
               integers.add(number);
               sum+=number;
            }
            System.out.println(integers);
            return sum;
        } catch (InputMismatchException e) {
            System.err.println("ERROR:Just Digit Number");
        }
        return -1;
    }
}
