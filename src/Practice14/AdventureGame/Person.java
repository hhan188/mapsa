package Practice14.AdventureGame;

import java.util.IllegalFormatCodePointException;
import java.util.Scanner;

public class Person {
    int location;
    Scanner sc = new Scanner(System.in);

    public void locationChanger(String locationChanger) {
        if (locationChanger.equalsIgnoreCase("q")) {
            System.out.println("GoodBye!");
        }
        if (locationChanger.equalsIgnoreCase("n"))
            location -= 3;
        if (locationChanger.equalsIgnoreCase("e"))
            location++;
        if (locationChanger.equalsIgnoreCase("w"))
            location--;
        if (locationChanger.equalsIgnoreCase("s"))
            location += 3;

    }
    public void transport(String NEWSQ) {
        if (location == 4) {
            System.out.println("You can go anywhere you want!!");
            System.out.println("Choose direction from \"NEWS\"");
            locationChanger(sc.next());
        }

    }


}
