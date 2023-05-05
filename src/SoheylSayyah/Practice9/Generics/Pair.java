package SoheylSayyah.Practice9.Generics;

import java.util.Arrays;

public class Pair <T,U>{
    private T t;
    private U u;

    public Pair(T t, U u) {
        this.t = t;
        this.u = u;
    }

    public T getT() {
        return t;
    }

    public U getU() {
        return u;
    }
    public T max(T[] t){
        Arrays.sort(t);
        return t[t.length - 1];
    }

    public Pair() {
    }
    public boolean contain(T[] t,Object s){
        for (int i = 0 ; i < t.length ; i++){
            if (t[i] == s){
                return true;
            }
        }
        return false;
    }
}
