package Practice10.Ten;

public class Mitsubishi extends Car{


    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public void startEngine() {
        System.out.println("Mitsubishi is startEngine");
    }

    @Override
    public void accelerate() {
        System.out.println("Mitsubishi is accelerate");
    }

    @Override
    public void barke() {
        System.out.println("Mitsubishi is barke");
    }

}
