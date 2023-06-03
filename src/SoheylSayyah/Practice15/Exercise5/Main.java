package SoheylSayyah.Practice15.Exercise5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Integer> integers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Your Array Elements :");
        while (scanner.hasNextInt()){
            System.out.println("Please Enter Your Array Elements :");
            integers.add(scanner.nextInt());
        }
        System.out.println(sumOfArray(integers));
    }
    public static int sumOfArray(ArrayList<Integer> integers){
        int sum = 0;
        if (integers.isEmpty()){
            return sum;
        }else {
            for (int i = 0; i < integers.size(); i++)
            {
                sum += integers.get(i);
            }
        }
        return sum;
    }
}
