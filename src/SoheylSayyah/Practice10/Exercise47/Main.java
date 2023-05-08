package SoheylSayyah.Practice10.Exercise47;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Player pal = new Player();
        List<String> t = new ArrayList<>();
        List<String> s = pal.write();
        t.add("Soheyl");
        t.add("21");
        t.add("15");
        t.add("soposp");
        pal.read(t);
        pal.write();
        System.out.println(s);
    }
}
