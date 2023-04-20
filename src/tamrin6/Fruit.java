package tamrin6;
//Problem 3 solution
public class Fruit {
    private String name;
    private double pricePerPound;

    public Fruit(String name, double pricePerPound){
        setName(name);
        setPricePerPound(pricePerPound);
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setPricePerPound(double pricePerPound){
        if (pricePerPound < 0)
            throw new IllegalArgumentException("Price cannot be negative");
        this.pricePerPound = pricePerPound;
    }

    public double getPricePerPound() {
        return pricePerPound;
    }
}
