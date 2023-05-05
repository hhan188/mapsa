package SoheylSayyah.Practice9.Interface.Exercise1;

public class Main {
    public static void main(String[] args) {
        Sortable[] sortables = new Sortable[3];

        sortables[0] = new Person();
        sortables[1] = new Home();
        sortables[2] = new Car();
        for (int i = 0; i < sortables.length; i++) {
            sortables[i].compare();
        }
    }
}
