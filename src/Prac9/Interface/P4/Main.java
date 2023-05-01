package Prac9.Interface.P4;

public class Main {
    public static void main(String[] args) {
        Flyable bird = new Bird();
        Flyable plane = new Plane();
        Flyable superMan = new Superman();
        bird.fly();
        plane.fly();
        superMan.fly();
    }
}
