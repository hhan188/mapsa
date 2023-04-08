package practices.practice7.exercise19;

import practices.practice7.exercise16.Circle;

public class CircleUtils {

    private Circle[] circles;

    public Circle[] getCircles() {
        return circles;
    }

    public void setCircles(Circle[] circles) {
        this.circles = circles;
    }
    public double generateArea(Circle circle){
        return Math.PI*Math.pow(circle.getRadius(),2);
    }
    public double[] areaArrayOfCircles(Circle[] circles){
        double[] areas=new double[circles.length];
        for (int i = 0; i <circles.length ; i++) {
            areas[i]=generateArea(circles[i]);
        }return areas;
    }
}
