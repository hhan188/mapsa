package Practice10.Composition;

public class Main {
    public static void main(String[] args) {
        Lamp lamp=new Lamp("A",true,123);
        System.out.println(lamp.toString());

        Bed bed=new Bed("b",12,20,52,80);
        System.out.println(bed.toString());

        Ceiling ceiling=new Ceiling(50,80);
        System.out.println(ceiling.toString());

        Well well=new Well("G");
        System.out.println(well.toString());

        Bedroom bedroom=new Bedroom("A","B","C","s");
        System.out.println(bedroom.toString());

    }
}
