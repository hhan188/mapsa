package Practice10.tamrine3;

public class Using {
    public static void main(String[] args) {
        Wall wall1=new Wall("North");
        Wall wall2=new Wall("South");
        Wall wall3=new Wall("East");
        Wall wall4=new Wall("West");
        Ceiling ceiling=new Ceiling(12,43);
        Bed bed=new Bed("modern",4,3,2,1);
        Lamp lamp=new Lamp("classic" ,false,75);
        Bedroom bedroom=new Bedroom(wall1.getDirection(), wall2.getDirection(),wall3.getDirection(),wall4.getDirection(),ceiling,bed,lamp);//injash moheme
        bedroom.makeBed();
        bedroom.getlamp().turnOn();

    }
}
