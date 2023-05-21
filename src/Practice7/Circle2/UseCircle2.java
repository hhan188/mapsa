package Practice7.Circle2;

public class UseCircle2 {
    public static void main(String[] args) {
        Circle[] circle= new Circle[3];
        circle[0]=new Circle(2);
        circle[1]=new Circle(5);
        circle[2]=new Circle(8);
        double sum = 0;
        for (Circle item:circle) {
            sum+= item.area();

        }
        System.out.println(sum);

    }


}
