package tamrin6.P3;

public class UsingFruit {
    public static void main(String args[]) {
        Fruit f1 = new Fruit( "Apple" , 15 );
        Fruit f2 = new Fruit( "Orange" , 20 );
        System.out.println("Fruit Name : " + f1.getName());
        System.out.println("Price :" + f1.getPrice() + "$");
        System.out.println( "**********************************************");
        System.out.println("Fruit Name : " + f2.getName());
        System.out.println("Price :" + f2.getPrice() + "$");


    }
}
