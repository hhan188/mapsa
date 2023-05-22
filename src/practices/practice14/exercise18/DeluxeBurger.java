package practices.practice14.exercise18;

public class DeluxeBurger extends HealthyBurger {


    public DeluxeBurger() {
        System.out.println("Deluxe hamburger on a White roll with Sausage & Bacon, price is 14.54 ");
        System.out.println("Added Drink for an extra "+1.81);
        System.out.println("Added Chips for an extra "+2.75);
    }

    @Override
    public void addHamburgerAddition1(String meal, double addPrise) {
    }

    @Override
    public void addHamburgerAddition2(String meal, double addPrise) {

    }

    @Override
    public void addHamburgerAddition3(String meal, double addPrise) {
    }

    @Override
    public void addHamburgerAddition4(String meal, double addPrise) {
    }

    @Override
    public double itemizeHamburger() {
        return 19.10;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
