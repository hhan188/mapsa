package Practice14.Game;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        ArrayList<String> map = new ArrayList<>();
        map.add("North1");
        map.add("North2");
        map.add("North3");
        map.add("Middle1");
        map.add("Middle2");
        map.add("Middle3");
        map.add("South1");
        map.add("South2");
        map.add("South3");
        System.out.println("Welcome to the new word");
        System.out.println("Pleas enter your location that is between 0-8");
        boolean resume = true;
        Scanner sc = new Scanner(System.in);
        int location = sc.nextInt();

        while (resume){
            System.out.println(map.get(location));
            System.out.println("Pleas enter your word : ");
            String controlPanel = sc.next();
            switch (controlPanel){
                case "q":
                    resume=false;
                    System.out.println("GoodBye");
                    break;
                case "n":
                    if (location<=2){
                        System.err.println("you can go to the north");
                        break;
                    }
                    else {
                        location-=3;
                        break;
                    }
                case "w":
                    if (location==0|| location==3|| location==6){
                        System.err.println("you can go to the west");
                        break;
                    }
                    else {
                        location-=1;
                        break;
                    }
                case "e":
                    if (location==2 || location ==5 || location==8){
                        System.err.println("you can go east");
                        break;
                    }else {
                        location+=1;
                        break;
                    }
            }
        }
    }
}
