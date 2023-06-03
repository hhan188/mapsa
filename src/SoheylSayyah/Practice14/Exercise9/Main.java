package SoheylSayyah.Practice14.Exercise9;

import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<String> map = new ArrayList<>();
        map.add("Mountain");
        map.add("Lake");
        map.add("Buildings");
        map.add("Jungle");
        map.add("You are Sitting in Front of a Computer Learning Java");
        map.add("Desert");
        map.add("Sea");
        map.add("Ocean");
        map.add("Sea");
        System.out.println("*Welcome To The Game*");
        System.out.println("Please Enter a Beginning Point Between 0 to 8 :");
        Scanner scanner = new Scanner(System.in);
        int location = scanner.nextInt();
        boolean resume = true;
        while (resume){
            System.out.println(map.get(location));
            System.out.println("Please Enter Your Word :");
            String controlPanel = scanner.next();
            switch (controlPanel){
                case "q":
                    System.err.println("Goodbye!");
                    resume = false;
                    break;
                case "n":
                    if (location <= 2){
                        System.err.println("You Can't Go North Anymore!");
                        break;
                    }else {
                        location -= 3;
                        break;
                    }
                case "s":
                    if (location >= 6){
                        System.err.println("You Can't Go South Anymore!");
                        break;
                    }else {
                        location += 3;
                        break;
                    }
                case "e":
                    if (location == 2 || location == 5 || location == 8){
                        System.err.println("You Can't Go East Anymore!");
                        break;
                    }else {
                        location += 1;
                        break;
                    }
                case "w":
                    if (location == 0 || location == 3 || location == 6){
                        System.err.println("You Can't Go West Anymore!");
                        break;
                    }else {
                        location -= 1;
                        break;
                    }
            }
        }
    }

}
