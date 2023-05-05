package SoheylSayyah.Practice9.Generics;

import java.util.ArrayList;

public class Option<T> {
    private ArrayList<T> t;

    public Option(ArrayList<T> t) {
        this.t = t;
    }

    public Option() {
    }

    public void present(T[] t , Object s){
        for (int i = 0; i < t.length; i++) {
            if (t[i] == s){
                System.out.println(String.valueOf(t[i]));
            }
        }
        System.out.println("is Empty");
    }
    public void map(ArrayList<T> t){
        ArrayList<String> transformed = null;
        for (int i = 0; i < t.size(); i++) {
            transformed.add(t.toString());
        }
    }
}
