package Practice15.PerfectSquerPath;

import java.util.ArrayList;

public class PerfectSquarerPath {
    public static void main(String[] args) {
    squarerPath(5);
    }
    public static void squarerPath(int n){
        ArrayList<Integer> print = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            print.add(n);
        }
        for (int i = 0; i < n; i++) {
            System.out.println(print);
        }
    }
}
