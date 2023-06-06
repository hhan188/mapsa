package practice15.fourteen;

import java.util.ArrayList;

public class StateName {
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
