package practices.practice15.exercise06;

import java.util.*;

class Utils {
    protected static List<String> getValues(Map<String, String> map) {
        List<String> list = new ArrayList<>(map.values());
        Collections.sort(list);
        return list;
    }
}
