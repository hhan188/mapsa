package practices.practice9.interface1.exercise2;

public class Main {
    public static void main(String[] args) {
        Calculator<Double,Double> calculator=new BasicCalculator();
        System.out.println(calculator.add(15.5, 12.0));
        System.out.println(calculator.subtract(15.5, 12.0));
        System.out.println(calculator.divide(15.5, 12.0));
        System.out.println(calculator.multiply(15.5, 12.0));
    }
}
