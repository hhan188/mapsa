package Practice8_3.jenerics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Pair<Integer,Integer> pair=new Pair<>();
        Integer[] integers={4,5,8,9,779,8,2};
        System.out.println(pair.max(integers));


        Pair<String,String> pair1=new Pair<>();
        String[] st={"Ali","reza","karim","soheil"};
        System.out.println(pair1.contains(st, "Ali"));
    }

}
