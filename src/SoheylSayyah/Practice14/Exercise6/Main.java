package SoheylSayyah.Practice14.Exercise6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        int size = readInteger();
        ArrayList<Integer> integers = readElements(size);
        int min = findMinimum(integers);
        System.out.println("Minimum Number of Your Array is :" + min);
    }
    public static int readInteger()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter The Size in Your Array :");
        return scanner.nextInt();
    }
    public static ArrayList<Integer> readElements(int size)
    {
        ArrayList<Integer> integers = new ArrayList<>(size);
        try {
            System.out.println("*Your Array Needs To Have " + size + " Elements*");
            System.out.println("-----------------------------------------------");
            Scanner scanner = new Scanner(System.in);
            for (int i = 0; i < size; i++) {
                System.out.println("Please Enter Number For Index " + i + " :");
                integers.add(scanner.nextInt());
            }
            throw new Exception();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return integers;
    }
    public static int findMinimum(ArrayList<Integer> integers){
        return Collections.min(integers);
    }
}
