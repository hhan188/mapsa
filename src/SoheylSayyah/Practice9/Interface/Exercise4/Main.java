package SoheylSayyah.Practice9.Interface.Exercise4;

public class Main {
    public static void main(String[] args) {
        Flyable[] flyables = new Flyable[3];
        flyables[0] = new Bird();
        flyables[1] = new Plane();
        flyables[2] = new Superman();
        for (int i = 0; i < flyables.length; i++) {
            flyables[i].fly();
        }
    }
}
