package com.Practice15;

public class Tamrin10
{
    public static void rps(String firstPlayer, String secondPlayer)
    {
       String p1 = "Player 1";
       String p2 = "Player 2";

       if (firstPlayer.equalsIgnoreCase("paper") && secondPlayer.equalsIgnoreCase("rock"))
       {
           System.out.println(p1 + " " + "wins");
       }
       else if (firstPlayer.equalsIgnoreCase("rock") && secondPlayer.equalsIgnoreCase("scissors"))
       {
           System.out.println(p1 + " " + "wins");
       }
       else if (firstPlayer.equalsIgnoreCase("scissors") && secondPlayer.equalsIgnoreCase("paper"))
       {
           System.out.println(p1 + " " + "wins");
       }
       else if (firstPlayer.equalsIgnoreCase(secondPlayer))
       {
           System.out.println("TIE");
       }
       else
       {
           System.out.println(p2 + " " + "wins");
       }
    }
}
