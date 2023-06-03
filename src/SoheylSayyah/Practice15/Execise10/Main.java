package SoheylSayyah.Practice15.Execise10;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Your Name as First Player :");
        String firstPlayerName = scanner.nextLine();
        System.out.println("Please Enter Your Name as Second Player :");
        String secondPlayerName = scanner.nextLine();
        System.out.println("*****************************************");
        System.out.println("Game is Between " + firstPlayerName + " and " + secondPlayerName + "!");
        System.out.println("Let's Begin :)");
        System.out.println("*****************************************");
        System.out.println(firstPlayerName + " Please Choose Between These (Rock , Paper or Scissors) :");
        String firstPlayerMove = scanner.nextLine();
        System.out.println(secondPlayerName + " Please Choose Between These (Rock , Paper or Scissors) :");
        String secondPlayerMove = scanner.nextLine();
        if (firstPlayerMove.equalsIgnoreCase(secondPlayerMove)){
            System.out.println("Tie!");
        }else if (firstPlayerMove.equalsIgnoreCase("Rock") && secondPlayerMove.equalsIgnoreCase("Scissors")){
            System.out.println(firstPlayerName + " Wins!");
        }else if (firstPlayerMove.equalsIgnoreCase("Paper") && secondPlayerMove.equalsIgnoreCase("Rock")){
            System.out.println(firstPlayerName + " Wins!");
        }else if (firstPlayerMove.equalsIgnoreCase("Scissors") && secondPlayerMove.equalsIgnoreCase("Paper")){
            System.out.println(firstPlayerName + " Wins!");
        }else {
            System.out.println(secondPlayerName + " Wins!");
        }
    }
}
