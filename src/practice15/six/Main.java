package practice15.six;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<String,String> mp=new TreeMap<>();
        mp.put("7","Ali");
        mp.put("4","soheila");
        mp.put("1","Ghader");
        mp.put("3","nader");

        ReturnKeys returnKeys=new ReturnKeys();
        returnKeys.returnKeys(mp);

    }
}
