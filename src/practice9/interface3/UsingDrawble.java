package practice9.interface3;

import practice9.interface3.Circle4;
import practice9.interface3.Drawable;
import practice9.interface3.Rectangle4;
import practice9.interface3.Traingle4;

import java.util.ArrayList;
import java.util.List;

public class UsingDrawble {
    public static void main(String[] args) {
        List<Drawable> drawing=new ArrayList<>();

        Traingle4 traingle=new Traingle4();
        Circle4 circle=new Circle4();
        Rectangle4 rectangle=new Rectangle4();

        drawing.add(traingle);
        drawing.add(circle);
        drawing.add(rectangle);
        for (Drawable items:drawing){
            items.draw();
        }


    }
}
