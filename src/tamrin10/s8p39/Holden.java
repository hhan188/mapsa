package tamrin10.s8p39;

public class Holden extends Car{

    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    public String startEngine(){
        return "Holden -> startEngine()";
    }

    public String accelerate(){
        return "Holden -> accelerate()";
    }

    public String brake(){
        return "Holden -> brake()";
    }


}
