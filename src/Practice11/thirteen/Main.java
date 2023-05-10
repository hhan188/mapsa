package Practice11.thirteen;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sum = 0;

        try(Scanner scanner=new Scanner(new BufferedInputStream(new FileInputStream("thirteen.txt")))){
            while (scanner.hasNextInt()){
                sum+=scanner.nextInt();

            }
            System.out.println(sum);
        }catch (IOException e){
            System.out.println("IOException e ");
        }

    }
}
