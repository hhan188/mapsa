package Practice10.tamrine4;

import java.util.List;

public class main {
    public static void main(String[] args) {

                Player player1 = new Player("Kay-ko",100,1000);
                List<String> tempArray = player1.write();

                Player player2 = new Player();
                player2.read(tempArray);

                System.out.println(player2);

            }

}
