package com.practice14.Excercise50;

import java.util.Scanner;

public class Game
{
    public static void command ()
    {
        Map newMap = new Map();
        Scanner sc = new Scanner(System.in);
        System.out.println("You are in the House.");
        int loc = 4;
        boolean flag = true;
        while (flag)
        {
            System.out.println("Available exits are Q, S, E, N, W");
            String dir = sc.nextLine();
            if (dir.equalsIgnoreCase("S") || dir.contains("south"))
            {
                loc += 3;
                if (newMap.southChecker(loc))
                {
                    System.out.println("You are at " + newMap.getMyMap().get(loc));
                }
                else
                {
                    System.out.println("You cannot go in that direction");
                    loc -= 3;
                }
            }
            else if (dir.equalsIgnoreCase("E") || dir.contains("east"))
            {
                loc += 1;
                if (newMap.eastChecker(loc))
                {
                    System.out.println("You are at " + newMap.getMyMap().get(loc));
                }
                else
                {
                    System.out.println("You cannot go in that direction");
                    loc -= 1;
                }
            }
            else if (dir.equalsIgnoreCase("N") || dir.contains("north"))
            {
                loc -= 3;
                if (newMap.northChecker(loc))
                {
                    System.out.println("You are at " + newMap.getMyMap().get(loc));
                }
                else
                {
                    System.out.println("You cannot go in that direction");
                    loc += 3;
                }
            }
            else if (dir.equalsIgnoreCase("W") || dir.contains("west"))
            {
                loc -= 1;
                if (newMap.westChecker(loc))
                {
                    System.out.println("You are at " + newMap.getMyMap().get(loc));
                }
                else
                {
                    System.out.println("You cannot go in that direction");
                    loc += 1;
                }
            }
            else if (dir.equalsIgnoreCase("Q") || dir.contains("quit"))
            {
                System.out.println("You are sitting in front of a computer learning Java");
                flag = false;
            }
            else
            {
                System.out.println("Wrong Command");
            }
        }
    }
}
