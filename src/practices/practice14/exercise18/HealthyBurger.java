package practices.practice14.exercise18;

public class HealthyBurger extends Hamburger{
    public HealthyBurger() {
    }

    public HealthyBurger(String meat, double price) {
        super(meat, price);
        System.out.println(" Healthy hamburger on a brown roll with "+meat+" price is $"+price);

    }

    private String healthyExtra1Name;
private String healthyExtra2Name;
private double healthyExtra1Price;
private double healthyExtra2Price;

    public String getHealthyExtra1Name() {
        return healthyExtra1Name;
    }

    public HealthyBurger setHealthyExtra1Name(String healthyExtra1Name) {
        this.healthyExtra1Name = healthyExtra1Name;
        return this;
    }

    public String getHealthyExtra2Name() {
        return healthyExtra2Name;
    }

    public HealthyBurger setHealthyExtra2Name(String healthyExtra2Name) {
        this.healthyExtra2Name = healthyExtra2Name;
        return this;
    }

    public double getHealthyExtra1Price() {
        return healthyExtra1Price;
    }

    public HealthyBurger setHealthyExtra1Price(double healthyExtra1Price) {
        this.healthyExtra1Price = healthyExtra1Price;
        return this;
    }

    public double getHealthyExtra2Price() {
        return healthyExtra2Price;
    }

    public HealthyBurger setHealthyExtra2Price(double healthyExtra2Price) {
        this.healthyExtra2Price = healthyExtra2Price;
        return this;
    }

    public void addHealthyAddition1(String meal, double addPrise) {
        double price=getHealthyExtra1Price()+addPrise+super.getPrice();
        setHealthyExtra1Price(price);
        System.out.println("Added "+meal+" for an extra "+addPrise);
    }
    public void addHealthyAddition2(String meal, double addPrise) {
        double price=getHealthyExtra2Price()+addPrise;
        setHealthyExtra2Price(price);
        System.out.println("Added "+meal+" for an extra "+addPrise);
    }


    public double itemizeHamburger() {
        return getHealthyExtra1Price();
    }
}
