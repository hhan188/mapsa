import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Student2 {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(new File("pr5.txt"))){
            double sum=0;
            while (sc.hasNextLine()){
                String line=sc.nextLine();
                ArrayList<Double>nums=new ArrayList<>();
                nums.add(Double.parseDouble(line));
                System.out.println(nums.size());
                for(int i=0;i<nums.size();i++){
                    if(nums.get(i)>0 && nums.get(i)<100){
                        sum += nums.get(i);
                        double avr= sum/nums.size();
                        System.out.println(avr);
                    }else throw new GradeOutOfRangeException("Invalid number");
                }

            }
        } catch (FileNotFoundException | GradeOutOfRangeException e) {
            e.printStackTrace();
        }
    }
}
