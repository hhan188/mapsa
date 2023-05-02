package practices.practice9.interface1.exercise2;

public class BasicCalculator implements Calculator<Double, Double> {
    @Override
    public Double add(Double u1, Double u2) {
        return u1 + u2;
    }

    @Override
    public Double subtract(Double u1, Double u2) {
        return Math.abs(u1 - u2);
    }

    @Override
    public Double multiply(Double u1, Double u2) {
        if (u2 != 0) {
            return u1 / u2;
        }
        return null;
    }

    @Override
    public Double divide(Double u1, Double u2) {
        return u1*u2;
    }
}
