package Prac10.P47;

public class Main {
    public static void main(String[] args) {
        Player player = new Player("sajjad", 100, 10);
        Monster monster = new Monster("babr", 150, 25);
        System.out.println(player.toString());
        System.out.println(monster.toString());
    }
}
