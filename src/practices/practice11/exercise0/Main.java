package practices.practice11.exercise0;

import java.io.File;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        try{
            while (true){
                System.out.print("please enter a  number:");
                sc.nextInt();
            }
        }catch (InputMismatchException e){
            System.err.println("ENTER DIGIT NUMBER");
        }

    }
}
