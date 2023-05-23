package Prac14.P50;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    static AdventureGame game = new AdventureGame();
    public static void command(String command) {
        HashMap<String, Places> avPlaces = game.getAvailablePlaces();
        if (avPlaces.get(command) != null) {
            game.setCurrentPlace(avPlaces.get(command));
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        String  menuChoice;
        while (!exit) {
            game.PrintAvailablePlaces();
            System.out.println("****************");
            System.out.println("enter exit to exit program");
            System.out.println("****************");
            menuChoice = scanner.next();
            if (!menuChoice.equalsIgnoreCase("exit"))
                command(game.vocabulary.get(menuChoice.toUpperCase()));
            else {
                System.out.println("Goodbye!");
                exit = true;
            }
        }
    }
}
