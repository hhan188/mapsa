package Practice15.RockPapperScisser;

import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("You are first player enter your move");
        String firstPlayer= sc.next();
        System.out.println("You are second player enter your move");
        String secondPlayer=sc.next();
        if (firstPlayer.equalsIgnoreCase("rock")&&secondPlayer.equalsIgnoreCase("scissor")){
            System.out.println("first player is win");
        } else if (firstPlayer.equalsIgnoreCase("scissor")&& secondPlayer.equalsIgnoreCase("paper")) {
            System.out.println("first player is win");
        } else if (firstPlayer.equalsIgnoreCase("paper")&&secondPlayer.equalsIgnoreCase("rock")) {
            System.out.println("first player is win");
        } else if (firstPlayer.equalsIgnoreCase(secondPlayer)) {
            System.out.println("nobody win");
        } if (firstPlayer != "rock" || firstPlayer != "scissor" || firstPlayer != "paper") {
            System.out.println("Player move is not available");

        } else if (secondPlayer != "rock" || secondPlayer != "scissor" || secondPlayer != "paper") {
            System.out.println("Player move is not available");
        } else System.out.println("second player is win");

    }

}
