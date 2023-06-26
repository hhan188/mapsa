package com.Practice15;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Tamrin6
{
    public static <K extends String, V extends String> void separatedArrays (Map <K, V> kvMap)
    {
        List <String> keys = new ArrayList<>(kvMap.keySet().stream().sorted().toList());
        List <String> values = new ArrayList<>(kvMap.values().stream().sorted().toList());

        System.out.println(keys);
        System.out.println(values);

    }
}
