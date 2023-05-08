package Practice10.io;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
       int number;
       File file=new File("text.txt");
       try {
           Scanner scanner=new Scanner(System.in);
           String str=scanner.nextLine();
           number=Integer.parseInt(str);
           if (number<0&&number>100){
               System.out.println("number is valid");
           }else throw new Exception("Invalid");
       }catch (Exception e){
           throw new RuntimeException(e);
       }


    }
}
