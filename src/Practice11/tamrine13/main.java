package Practice11.tamrine13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int sum=0;
        while(true){
                    int counter=0;
                    try{
                        System.out.println("enter your number: ");
                        int number= scanner.nextInt();
                        if(number!=0){
                        sum+=number;
                    }
                        else{
                            System.out.println(sum);
                            break;
                        }
                    } catch(InputMismatchException e){
                        System.out.println("your exception is :"+ e.getMessage());
                        break;
                    }
        }
    }
}
