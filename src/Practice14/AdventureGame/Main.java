package Practice14.AdventureGame;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> map = new ArrayList<>();

        map.add("mountain");
        map.add("mountain");
        map.add("mountain");
        map.add("jungle");
        map.add("You are in front of a computer and learning java");
        map.add("Desert");
        map.add("Sea");
        map.add("Ocean");
        map.add("Sea");

        int location = 4;
        System.out.println("Welcome to the game");
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            if (location == 4){
                System.out.println("You can go anywhere you want");
                String transport = sc.next();

            }
        }





    }
}
