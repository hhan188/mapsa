package tamrin9.interfaces.p1;

public class House implements Sortable<House> {

    private String uid;
    private float area;

    public House(String uid, float area) {
        this.uid = uid;
        this.area = area;
    }

    @Override
    public String toString() {
        return "House{" +
                "uid='" + uid + '\'' +
                ", area=" + area +
                '}';
    }

    @Override
    public boolean compare(House other) {
        return area < other.area;
    }
}
