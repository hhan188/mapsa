package SoheylSayyah.Practice15.Exercise1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        createArray();
    }
    public static void createArray(){
        ArrayList<Integer> multiples = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter a Number For Beginning :");
        int number = scanner.nextInt();
        System.out.println("Please Enter Your Array Length :");
        int length = scanner.nextInt();
        for (int i = 1 ; i <= length ; i++){
            multiples.add(i * number);
        }
        System.out.println(multiples);
    }
}
