package practices.practice9.interface1.exercise3;

import java.util.ArrayList;
import java.util.List;

public class Rectangle implements Drawable<Rectangle>{

    @Override
    public List<Rectangle> draw(Rectangle rectangle) {
        List<Rectangle> list = new ArrayList<>();
        list.add(rectangle);
        return list;
    }
}
