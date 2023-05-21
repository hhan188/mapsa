package Practice11.Eighth;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Eighth {
    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);

            System.out.println("enter your list size");
            int size = sc.nextInt();
            int [] num = new int[size];
            int sum =0 ;
            for (int i = 0; i < num.length; i++) {
                System.out.println("enter your number");
                num[i]= sc.nextInt();
                sum+=num[i];
            }
            System.out.println(sum);

        }catch (InputMismatchException e){
            System.err.println("your number is non-metric");
        }
        catch (NumberFormatException e){
            System.out.println("ridi");
            System.out.println(e.getMessage());
        }




    }
}
