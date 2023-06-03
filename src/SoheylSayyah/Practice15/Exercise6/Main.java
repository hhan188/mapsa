package SoheylSayyah.Practice15.Exercise6;

import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Map<String, String> map = new HashMap<>();
        map.put("a","Apple");
        map.put("b","Microsoft");
        map.put("c","Google");
        List<String> values = new ArrayList<>(map.values());
        Collections.sort(values);
        System.out.println(values);
    }
}
