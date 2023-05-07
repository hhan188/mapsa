package practice9;

public class Pair<T,U>{
    private T contents1;
    private U contents2;

    public T getContents1() {
        return contents1;
    }

    public void setContents1(T contents1) {
        this.contents1 = contents1;
    }

    public U getContents2() {
        return contents2;
    }

    public void setContents2(U contents2) {
        this.contents2 = contents2;
    }

    public Pair(T contents1, U contents2) {
        this.contents1 = contents1;
        this.contents2 = contents2;


    }





}
