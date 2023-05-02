package practices.practice9.generics.exercise1;

import java.util.Arrays;
import java.util.List;

public class Pair<T, U> {


    //exercise1 of generics
    private T t;
    private U u;

    public Pair() {
    }

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

    //exercise2 of generics
    public T max(T[] list) {
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
        return list[list.length - 1];
    }


    //exercise3 of generics
    public boolean contains(List<T> list, T t) {
        return list.contains(t);

    }
}
