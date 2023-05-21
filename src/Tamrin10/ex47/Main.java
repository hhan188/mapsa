package Tamrin10.ex47;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Player pal = new Player();
        List<String> t = new ArrayList<>();
        t.add("hshhshshshhsh");
        t.add("21");
        t.add("15");
        t.add("wipon");
        pal.read(t);
        List<String> listOfPal = pal.write();
        for (String
                s :
                listOfPal) {
            System.out.println(s);
        }
        pal.toString();
    }
}