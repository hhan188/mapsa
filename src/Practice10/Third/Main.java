package Practice10.Third;

public class Main {
    public static void main(String[] args) {
        Wall wall1 = new Wall("west");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("north");
        Wall wall4 = new Wall("south");
        Ceiling ceiling = new Ceiling(12,55);
        Bed bed = new Bed("king size bed",4,3,2,1);
        Lamp lamp = new Lamp("classic",true,12);
        BedRoom bedRoom = new BedRoom("ehsan",wall1,wall2,wall3,wall4,ceiling,bed,lamp);
        bedRoom.getLamp().turnOn();


    }
}
