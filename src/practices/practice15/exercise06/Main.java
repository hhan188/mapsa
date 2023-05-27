package practices.practice15.exercise06;

import java.util.HashMap;
import java.util.Map;

import static practices.practice15.exercise06.Utils.getValues;

public class Main {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("a", "1");
        map.put("b", "2");
        map.put("c", "3");
        System.out.println(getValues(map));
        Map<String, String> map1 = new HashMap<>();
        map1.put("a", "apple");
        map1.put("b", "microsoft");
        map1.put("c", "google");
        System.out.println(getValues(map1));
        Map<String, String> map2 = new HashMap<>();
        map2.put("key1", "true");
        map2.put("key2", "false");
        map2.put("key3", "undefined");
        System.out.println(getValues(map2));

    }
}
