package practice9.interface4;

public class UsingFlyable {
    public static void main(String[] args) {
        Superman superman=new Superman();
        superman.fly();

        Plane plane=new Plane();
        plane.fly();

        Bird bird=new Bird();
        bird.fly();
    }
}
