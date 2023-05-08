package SoheylSayyah.Practice10.Exercise40;

import java.util.ArrayList;
import java.util.List;

public class HealthyBurger extends Hamburger {
    private String healthyExtra1Name;
    private String healthyExtra2Name;
    private double healthyExtra1Price;
    private double healthyExtra2Price;

    public HealthyBurger(String meat,double price) {
        super(meat, price);
    }
    public double addHealthyAddition1(){
        List<Double> list = new ArrayList<>(2);
        double temp = 0;
        if (healthyExtra1Name != null){
            list.add(healthyExtra1Price);
            temp += healthyExtra1Price;
        }
        if (healthyExtra2Name != null){
            list.add(healthyExtra2Price);
            temp += healthyExtra2Price;
        }
        return temp;
    }
    public double addHealthyAddition2(){
        List<Double> list = new ArrayList<>(2);
        double temp = 0;
        if (healthyExtra1Name != null){
            list.add(healthyExtra1Price);
            temp += healthyExtra1Price;
        }
        if (healthyExtra2Name != null){
            list.add(healthyExtra2Price);
            temp += healthyExtra2Price;
        }
        return temp;
    }
}