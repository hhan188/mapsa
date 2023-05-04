package Practice8_3.jenerics;

import java.util.Arrays;
import java.util.List;

public class Pair <T,U>{

    private T t;
    private U u;

    public Pair(T t, U u) {
        this.t = t;
        this.u = u;
    }

    public Pair() {
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public U getU() {
        return u;
    }

    public void setU(U u) {
        this.u = u;
    }
    public T max(T[] list) {
        Arrays.sort(list);
        return list[list.length - 1];
    }


    public boolean contains(T[] ts, T t) {
        for (int i = 0; i < ts.length; i++) {
            if (ts[i]==t){
                return true;
            }
        }return false;

    }


}
