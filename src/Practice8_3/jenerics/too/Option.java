package Practice8_3.jenerics.too;

public class Option<T> {
    T[] t;
    T t1;

    public boolean PresenceOrAbsence(T[] t,T t1){

        for (int i = 0; i < t.length; i++) {
            if (t[i]== t1){
                return true;
            }

        }return false;
    }

    public Option(T[] t, T t1) {
        this.t = t;
        this.t1 = t1;
    }

    public Option() {
    }

    public T[] getT() {
        return t;
    }

    public void setT(T[] t) {
        this.t = t;
    }

    public T getT1() {
        return t1;
    }

    public void setT1(T t1) {
        this.t1 = t1;
    }
}
