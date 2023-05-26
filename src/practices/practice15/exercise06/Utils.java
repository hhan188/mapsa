package practices.practice15.exercise06;

import java.util.*;

class Utils {
    protected static List<String> getValues(Map<String, String> map) {
        List<String> list = new ArrayList<>();
        list.add(map.values().toString());
        Collections.sort(list);
        return list;
    }
}
