package Prac10.P40;

public class DeluxeBurger extends Hamburger{
    public DeluxeBurger() {
        super("deluxe", "meat", "white", 19.10);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("cannot add additional item to delux burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("cannot add additional item to delux burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("cannot add additional item to delux burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("cannot add additional item to delux burger");
    }
}
