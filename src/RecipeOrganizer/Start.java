package RecipeOrganizer;

import RecipeOrganizer.Main.UserCommandLineInterface;

public class Start{
    public static void main(String[] args) {
        UserCommandLineInterface cli = new UserCommandLineInterface();
        cli.welcome();
        cli.start();
    }
}
