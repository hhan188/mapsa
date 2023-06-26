package com.Practice15;
import java.util.List;

public class Tamrin8
{
    public static <T extends String> void letterCounter (List <List <T>> letters, String target)
    {
        System.out.println('\''+ target + '\'' + " Repeated : " + letters.stream().flatMap(List::stream).filter(i -> i.equalsIgnoreCase(target)).count());
    }
}
