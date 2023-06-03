package SoheylSayyah.Practice15.Exercise14;

import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Arizona");
        stringArrayList.add("CA");
        stringArrayList.add("NY");
        stringArrayList.add("Nevada");

        ArrayList<String> stringArrayList1 = new ArrayList<>();
        stringArrayList1.add("MT");
        stringArrayList1.add("NJ");
        stringArrayList1.add("TX");
        stringArrayList1.add("ID");
        stringArrayList1.add("IL");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Your Function :");
        String function = scanner.nextLine();
        System.out.println(filterStateName(stringArrayList1, function));
    }
    public static ArrayList<String> filterStateName(ArrayList<String> strings, String function){
        ArrayList<String> newList = new ArrayList<>();
        switch (function){
            case "abb":
                for (String item : strings){
                    if (item.length() == 2){
                        newList.add(item);
                    }
                }
                break;
            case "full":
                for (String item : strings){
                    if (item.length() > 2){
                        newList.add(item);
                    }
                }
                break;
        }
        return newList;
    }
}
