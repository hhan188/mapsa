package tamrin10.s5p47;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Player player1 = new Player("Kay-ko",100,1000);
        List<String> tempArray = player1.write();

        Player player2 = new Player();
        player2.read(tempArray);

        System.out.println(player2);

    }
}
