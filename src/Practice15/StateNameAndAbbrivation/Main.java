package Practice15.StateNameAndAbbrivation;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your function");
        String function= sc.nextLine();

        ArrayList<String> filter=new ArrayList<>();
        filter.add("Arizona");
        filter.add("CA");
        filter.add("NY");
        filter.add("Arizona");
        filter.add("Nevada");
        System.out.println(filterStateNames(filter, function));
    }
    public static ArrayList<String> filterStateNames(ArrayList<String> filter,String function){
        ArrayList<String> newList = new ArrayList<>();
        switch (function){
            case "abb":
                for (String item:filter) {
                    if (item.length()==2){
                        newList.add(item);
                    }
                }
                break;
            case "full":
                for (String item:filter) {
                    if (item.length()>2){
                        newList.add(item);
                    }
                }
                break;
        }
        return newList;
    }
}
