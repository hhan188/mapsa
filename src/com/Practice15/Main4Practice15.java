package com.Practice15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public class Main4Practice15
{
    public static void main(String[] args)
    {
        System.out.println("Tamrin 1");
        System.out.println("------------------------------------");
        Tamrin1.arrayOfMultiple(12,10);
        System.out.println("------------------------------------\n");


        System.out.println("Tamrin 2");
        System.out.println("------------------------------------");
        Tamrin2.warOfNumbers(new int[]{12, 90, 75});
        System.out.println("------------------------------------\n");


        System.out.println("Tamrin 3");
        System.out.println("------------------------------------");
        Tamrin3.perfectSquare(4);
        System.out.println("------------------------------------\n");



        System.out.println("Tamrin 5");
        System.out.println("------------------------------------");
        System.out.println(Tamrin5.recursiveSum(new int []{2, 4, 4}, 3));
        System.out.println("------------------------------------\n");



        System.out.println("Tamrin 6");
        System.out.println("------------------------------------");
        Tamrin6.separatedArrays(Map.of("a","1", "b", "2", "c","3"));
        System.out.println("------------------------------------\n");



        System.out.println("Tamrin 7");
        System.out.println("------------------------------------");
        Tamrin7.basicOperation("3", "3", "add");
        System.out.println("------------------------------------\n");



        System.out.println("Tamrin 8");
        System.out.println("------------------------------------");
        Tamrin8.letterCounter(new ArrayList <>(Arrays.asList(
                Arrays.asList("D", "A", "C", "G", "R"),
                Arrays.asList("X", "Y", "W", "F", "B"),
                Arrays.asList("Q", "U", "H", "D", "N"),
                Arrays.asList("P", "L", "T", "O", "P"),
                Arrays.asList("K", "J", "D", "V", "M")

        )), "D");
        System.out.println("------------------------------------\n");



        System.out.println("Tamrin 9");
        System.out.println("------------------------------------");
        Tamrin9.digitsCounter(54654585);
        System.out.println("------------------------------------\n");



        System.out.println("Tamrin 10");
        System.out.println("------------------------------------");
        Tamrin10.rps("paper", "scissors");
        Tamrin10.rps("paper", "rock");
        Tamrin10.rps("scissors", "rock");
        Tamrin10.rps("paper", "paper");
        System.out.println("------------------------------------\n");



        System.out.println("Tamrin 11");
        System.out.println("------------------------------------");
        Tamrin11.isPerfect(496);
        System.out.println("------------------------------------\n");




        System.out.println("Tamrin 12");
        System.out.println("------------------------------------");
        Tamrin12.flipEndChar("Cat, dog and mouse.");
        Tamrin12.flipEndChar("ada");
        Tamrin12.flipEndChar("Ada");
        Tamrin12.flipEndChar("z");
        System.out.println("------------------------------------\n");



        System.out.println("Tamrin 13");
        System.out.println("------------------------------------");
        Tamrin13.dnaToRna("CGATATA");
        Tamrin13.dnaToRna("GTCATACGACGTA");
        System.out.println("------------------------------------\n");



        System.out.println("Tamrin 14");
        System.out.println("------------------------------------");
        Tamrin14.stateName(new String[]{"Arizona", "CA", "NY", "Nevada",}, "abb");
        Tamrin14.stateName(new String[]{"Arizona", "CA", "NY", "Nevada",}, "full");
        System.out.println("------------------------------------\n");


        System.out.println("Tamrin 15");
        System.out.println("------------------------------------");
        Tamrin15.totalVolume(new int [][] {{2, 3, 2}, {6, 6, 7}, {1, 2, 1}});
        Tamrin15.totalVolume(new int [][] {{4, 2, 4}, {3, 3, 3}, {1, 1, 2}, {2, 1, 1}});
        Tamrin15.totalVolume(new int [][] {{2, 2, 2}, {2, 1, 1}});
        System.out.println("------------------------------------\n");



        System.out.println("Tamrin 16");
        System.out.println("------------------------------------");
        Tamrin16.reorderDigits(new int[]{515, 341, 98, 44, 211}, "asc");
        Tamrin16.reorderDigits(new int[]{515, 341, 63251, 78221}, "desc");
        System.out.println("------------------------------------\n");



        System.out.println("Tamrin 17");
        System.out.println("------------------------------------");

        Tamrin17.maxPoss(9328, 456);
        Tamrin17.maxPoss(523, 76);
        Tamrin17.maxPoss(9132, 5564);
        Tamrin17.maxPoss(8732, 91255);
        System.out.println("------------------------------------\n");



        System.out.println("Tamrin 18");
        System.out.println("------------------------------------");
        Tamrin18.palindromeDescendant(11211230);
        Tamrin18.palindromeDescendant(13001120);
        Tamrin18.palindromeDescendant(23336014);
        Tamrin18.palindromeDescendant(23336014);
        Tamrin18.palindromeDescendant(123312);
        System.out.println("------------------------------------\n");


        System.out.println("Tamrin 20");
        System.out.println("------------------------------------");
        Tamrin20.missingNum(new ArrayList<>(Arrays.asList(4,2,1,3,9,8,6,5,7)));
        System.out.println("------------------------------------\n");
    }
}
