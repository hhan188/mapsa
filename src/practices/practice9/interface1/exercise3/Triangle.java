package practices.practice9.interface1.exercise3;

import java.util.ArrayList;
import java.util.List;

public class Triangle implements Drawable<Triangle> {
    @Override
    public List<Triangle> draw(Triangle triangles) {
        List<Triangle> list = new ArrayList<>();
        list.add(triangles);
        return list;
    }
}
