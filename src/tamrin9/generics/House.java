package tamrin9.generics;

public class House implements Comparable<House> {

    private String uid;
    private float area;

    public House(String uid, float area) {
        this.uid = uid;
        this.area = area;
    }

    @Override
    public int compareTo(House o) {
        return (int)(this.area - o.area);
    }

    @Override
    public String toString() {
        return "House{" +
                "uid='" + uid + '\'' +
                ", area=" + area +
                '}';
    }
}
