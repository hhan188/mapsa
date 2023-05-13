import java.awt.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class tamrin0 {
    public static void main(String[] args) {
        int number;
        try(Scanner sc=new Scanner(System.in)) {
            number = sc.nextInt();
             if(number == Integer.parseInt(String.valueOf(number))){
                System.out.println(number);
            }else throw new InputMismatchException();

        }catch (InputMismatchException e){
            e.printStackTrace();
            System.out.println("invalids number");
        }
    }
}
