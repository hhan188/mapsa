package Practice14.Six;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Six {
    public static void main(String[] args) {
        int size = readInt();
        ArrayList<Integer> integers = readElement(size);
        int min = findMin(integers);
        System.out.println(min);

    }
    public static int readInt(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your array size");
        return sc.nextInt();
    }
    public static ArrayList<Integer> readElement(int size){
        ArrayList<Integer> integers ;
            integers =new ArrayList<>(size);
            System.out.println("your array size is :"+ size+" have length");
            Scanner sc = new Scanner(System.in);
            for (int i = 0; i < size; i++) {
                System.out.println("Enter your number for index "+i);
                if (sc.hasNextInt())
                integers.add(sc.nextInt());
                else System.out.println("Enter invalid integer");
            }
        return integers;
    }
    public static int findMin(ArrayList<Integer> integers){
        return Collections.min(integers);
    }

}
