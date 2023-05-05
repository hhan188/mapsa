package Practice9.Inface.Two;

public class BasicCalculator implements Calculator {

    public int add(int a, int b) {
        return a - b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }
    public static void main(String[] args) {
        BasicCalculator calculate = new BasicCalculator();
        calculate.add(2,3);

    }

}
