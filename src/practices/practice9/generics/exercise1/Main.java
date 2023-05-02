package practices.practice9.generics.exercise1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //exercise1 of generics
        Pair<String, Integer> pair1 = new Pair<>("Yaser", 130);
        System.out.println(pair1.getT() + " " + pair1.getU());

        System.out.println("*********************************");

        //exercise2 of generics
        Pair<Integer, Integer> pair2 = new Pair<>();
        Integer[] integers = {12, 15, 14, 17, 18, 19, 12, 2, 1, 7, 8};
        System.out.println(pair2.max(integers));

        //exercise3 of generics
        System.out.println("*********************************");
        Pair<String, Object> pair3 = new Pair<>();

        String s1 = "Yaser";
        String s2 = "Ali";
        String s3 = "Hasan";
        String s4 = "Hosein";
        List<String> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);

        String contain = "Ali";
        System.out.println(pair3.contains(list, contain));

        contain = "Naser";
        System.out.println(pair3.contains(list, contain));


        //exercise4 of generics
        System.out.println("*********************************");
        Option<Double> option=new Option<>();
        System.out.println(option.isExist(null));
        System.out.println(option.isExist(17.5));






        //exercise5 of generics

    }
}
