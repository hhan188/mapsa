package SoheylSayyah.Practice15.Exercise3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Your Number :");
        int number = scanner.nextInt();
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < number; i++)
        {
            integers.add(number);
        }
        for (int i = 0; i < number; i++)
        {
            System.out.println(integers);
        }
    }
}
