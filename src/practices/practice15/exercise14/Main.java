package practices.practice15.exercise14;

import java.util.ArrayList;
import java.util.List;

import static practices.practice15.exercise14.Utils.filterStateNames;

public class Main {
    public static void main(String[] args) {

        List<String> strings=new ArrayList<>();
        strings.add("Arizona");
        strings.add("CA");
        strings.add("NY");
        strings.add("Nevada");
        String role="abb";
        System.out.println(filterStateNames(strings, role));
        role="full";
        System.out.println(filterStateNames(strings, role));

        System.out.println("************************************");
        List<String> strings1 =new ArrayList<>();
        strings1.add("MT");
        strings1.add("CA");
        strings1.add("NY");
        strings1.add("TX");
        strings1.add("ID");
         role="abb";
        System.out.println(filterStateNames(strings1, role));
        role="full";
        System.out.println(filterStateNames(strings1, role));


    }
}
