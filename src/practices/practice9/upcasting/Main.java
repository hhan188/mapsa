package practices.practice9.upcasting;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapeList=new ArrayList<>();
        shapeList.add(new Circle());
        shapeList.add(new Circle());
        shapeList.add(new Circle());
        shapeList.add(new Circle());
        shapeList.add(new Circle());
        shapeList.add(new Rectangle());
        shapeList.add(new Rectangle());
        shapeList.add(new Rectangle());
        shapeList.add(new Rectangle());
        shapeList.add(new Rectangle());
        shapeList.add(new Rectangle());
        for(Shape shape:shapeList){
            shape.draw();
        }

    }
}
