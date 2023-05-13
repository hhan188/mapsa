import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(new File("pr5.txt"))){
            double sum=0;
            double num;
            int t=0;
            while (sc.hasNextLine()){
                String line=sc.nextLine();
               num = Double.parseDouble(line);
               if(num>0 && num<100){
                t++;
                 sum +=num;
                 double avr= sum/t;
                    System.out.println(avr);

                }else throw new GradeOutOfRangeException("Invalid number");

            }
        } catch (FileNotFoundException | GradeOutOfRangeException e) {
            e.printStackTrace();
        }
    }
}
