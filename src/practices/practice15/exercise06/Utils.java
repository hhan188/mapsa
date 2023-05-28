package practices.practice15.exercise06;

import java.util.*;

class Utils {
    protected static List<String> getValues(Map<String, String> map) {
        List<String> list = new ArrayList<>(map.values());
        list.add(map.values().toString());
        Collections.sort(list);
        for (int i = 0; i < list.size() ; i++) {
            if (list.get(i).contains("[")||list.get(i).contains("]")){
                list.remove(i);
            }
        }
        return list;
    }
}
