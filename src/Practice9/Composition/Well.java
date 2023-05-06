package Practice9.Composition;

public class Well {
    private String direction;

    public Well(String direction) {
        this.direction = direction;
    }

    public String getDirection() {
        return direction;
    }

    @Override
    public String toString() {
        return "Well{" +
                "direction='" + direction + '\'' +
                '}';
    }
}
