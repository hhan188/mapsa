package Practice10.Eleven;

public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("basic","sausage",3.56,"white");
        hamburger.addHamburgerAddition1("tomato",0.27);
        hamburger.addHamburgerAddition2("lettuce",0.75);
        hamburger.addHamburgerAddition3("cheese",1.13);
        System.out.println("total burger price is : "+hamburger.itemizehamburger());
        HealthyBurger healthyBurger = new HealthyBurger("bacon",5.76);
        healthyBurger.addHamburgerAddition1("Egg",5.43);
        healthyBurger.addHealthyAddition1("lentils",3.41);
        System.out.println("total healthy burger price is : " +healthyBurger.itemizehamburger());

    }
}
