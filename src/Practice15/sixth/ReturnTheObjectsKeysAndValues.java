package Practice15.sixth;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class ReturnTheObjectsKeysAndValues {
    public static void main(String[] args) {
        Map<String, String> in = new TreeMap<>() ;
        in.put("a","1");
        in.put("d","5");
        in.put("c","3");
            method(in);

    }
        public static void method (Map < String, String > input){
            ArrayList<String> keys = new ArrayList<>();
            for (String key : input.keySet()) {
                keys.add(key);

            }
            System.out.println(keys);
            ArrayList<String> values = new ArrayList<>();
            for (String value : input.values()) {
                values.add(value);
                values.stream().sorted();
            }
            System.out.println(values);
        }


}
