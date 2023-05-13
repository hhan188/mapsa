import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Tamrin3 {
    public static void main(String[] args) {
        try(Scanner sc= new Scanner(new File("pr3.txt"))) {
            double sum = 0;
            while (sc.hasNextLine()){
                String line=sc.nextLine();
                String []nums= line.split(" ");
                for(int i=0;i<nums.length;i++){
                    double num =Double.parseDouble(nums[i]);
                     sum += num;
                     double avr= sum/nums.length;
                    System.out.println(avr);
                }
            }throw new NumberFormatException("Invalid number entered");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
