package practices.practice9.interface1.exercise3;

import java.util.ArrayList;
import java.util.List;

public class Circle implements Drawable<Circle>{

    @Override
    public List<Circle> draw(Circle circle) {
        List<Circle> list = new ArrayList<>();
        list.add(circle);
        return list;
    }
}
