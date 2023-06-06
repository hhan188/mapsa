package practice9.upcastingdowncasting.first;

import practice9.upcastingdowncasting.first.Circle;
import practice9.upcastingdowncasting.first.Rectangle;
import practice9.upcastingdowncasting.first.Shape;

import java.util.ArrayList;

public class UsingShape {
    public static void main(String[] args){
        ArrayList<Shape> shape=new ArrayList<>();
        Rectangle rectangle=new Rectangle();
        Circle cirle=new Circle();
        shape.add(rectangle);
        shape.add(cirle);
        for (Shape items:shape){
            items.draw();


        }

     //   Shape rectangle=new Rectangle(); ino nemikhad
        Rectangle myRectangle1=(Rectangle) rectangle;
        myRectangle1.shrink();

        Circle myCircle=(Circle) cirle;
        myCircle.enlarge();
//        Animal myAnimal = new Dog();
//        Dog myDog = (Dog) myAnimal;







        ////////





    }
}
