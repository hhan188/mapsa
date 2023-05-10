package practices.practice10.exercise37;

public class Wall {
    private String direction;

    public Wall() {
    }

    public Wall(String direction) {
        this.direction = direction;
    }

    public String getDirection() {
        return direction;
    }

    public Wall setDirection(String direction) {
        this.direction = direction;
        return this;
    }
}
