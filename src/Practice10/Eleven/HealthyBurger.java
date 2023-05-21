package Practice10.Eleven;

import java.util.ArrayList;
import java.util.List;

public class HealthyBurger extends Hamburger {
    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;
    private String healthyExtra3Name;
    private double healthyExtra3Price;
    public HealthyBurger(String meat, double price) {
        super(meat, price);
    }
    public double addHealthyAddition1(String name,double price){
        List<Double> list = new ArrayList<>(2);
        double temp = 0;
        if (healthyExtra1Name!=null){
            list.add(healthyExtra1Price);
            temp+=healthyExtra1Price;
        }
        if (healthyExtra2Name!=null){
            list.add(healthyExtra2Price);
            temp+=healthyExtra2Price;
        }
        return temp;
    }
    public double addHealthyAddition2(){
        List<Double> list =new ArrayList<>(2);
        double temp = 0;
        if (healthyExtra1Name!=null){
            list.add(healthyExtra1Price);
            temp+=healthyExtra1Price;
        }
        if (healthyExtra2Name!=null){
            list.add(healthyExtra2Price);
            temp+=healthyExtra2Price;
        }
        return temp;
    }
}
