package Practice15.ReturnObjectKeyAndValue;

import java.lang.reflect.Array;
import java.security.Key;
import java.util.*;

public class ReturnObjectKeyAndValue {
    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<>();
        map1.put("a", "apple");
        map1.put("b", "microsoft");
        map1.put("c", "google");
        List<String> values = new ArrayList<>(map1.values());
        Collections.sort(values);
        System.out.println(values);
    }
}
