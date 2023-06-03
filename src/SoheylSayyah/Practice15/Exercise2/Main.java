package SoheylSayyah.Practice15.Exercise2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Your Element :");
        while (scanner.hasNextInt()){
            System.out.println("Please Enter Your Element :");
            arrayList.add(scanner.nextInt());
        }
        System.out.println(arrayList);
        check(arrayList);
    }
    public static void check(ArrayList<Integer> arrayList){
        int sumEvens = 0;
        int sumOdds = 0;
        ArrayList<Integer> evens = new ArrayList<>();
        ArrayList<Integer> odds = new ArrayList<>();
        for (int i = 0 ; i < arrayList.size() ; i++){
            if (arrayList.get(i) % 2 == 0){
                evens.add(arrayList.get(i));
            } else if (arrayList.get(i) % 2 != 0) {
                odds.add(arrayList.get(i));
            }
        }
        for (int i = 0; i < evens.size(); i++) {
            sumEvens += evens.get(i);
        }
        for (int i = 0; i < odds.size(); i++) {
            sumOdds += odds.get(i);
        }
        if (sumOdds - sumEvens > 0)
        {
            System.out.println("Odds Win by The Difference of " + (sumOdds - sumEvens));
        } else if (sumOdds - sumEvens < 0) {
            System.out.println("Evens Win by The Difference of " + (sumEvens - sumOdds));
        }else {
            System.out.println("Both Sides Are Equal!");
        }
    }
}
