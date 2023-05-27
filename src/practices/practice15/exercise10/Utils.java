package practices.practice15.exercise10;

import static practices.practice15.exercise10.Game.*;

public class Utils {

    protected static String rps(Game game1, Game game2) {
        int result = rolls(game1, game2);

        switch (result) {

            case 1:
                return "Player 1 wins ";
            case -1:
                return "Player 2 wins";
            case 0:
                return "TIE";
            default:
                return "undefined";

        }

    }

    private static int rolls(Game game1, Game game2) {

        if (game1 == Rock && game2 == Scissor || game1 == Scissor && game2 == Paper || game1 == Paper && game2 == Rock) {
            return 1;

        } else if (game1 == Rock && game2 == Paper || game1 == Scissor && game2 == Rock || game1 == Paper && game2 == Scissor) {
            return -1;
        } else return 0;

    }

}
