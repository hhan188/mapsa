package practices.practice7.exercise16;

import practices.practice7.exercise19.CircleUtils;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        circle1.setRadius(1);
        Circle circle2 = new Circle();
        circle2.setRadius(2);
        Circle circle3 =new Circle();
        circle3.setRadius(3);
        Circle circle4 = new Circle();
        circle4.setRadius(4);
        Circle circle5 = new Circle();
        circle5.setRadius(5);
        Circle circle6 = new Circle();
        circle6.setRadius(6);
        Circle circle7 = new Circle();
        circle7.setRadius(7);
        Circle circle8 = new Circle();
        circle8.setRadius(8);
        Circle circle9 = new Circle();
        circle9.setRadius(9);
        Circle[] circles={circle1,circle2,circle3,circle4,circle5,circle6,circle7,circle8,circle9};
        System.out.println(Arrays.toString(circles));

        System.out.println("*************************************");
        CircleUtils circleUtils=new CircleUtils();
        System.out.println("Array of the Areas: "+ Arrays.toString(circleUtils.areaArrayOfCircles(circles)));

    }
}
