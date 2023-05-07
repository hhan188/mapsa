package practices.practice10.exercise29;

public class SimpleCalculator {
    //names firstNumber and secondNumber both of type double.
    private double firstNumber;
    private double secondNumber;

    public SimpleCalculator() {
    }

    public SimpleCalculator(double firstNumber, double secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }


    protected double getAdditionResult() {
        return getFirstNumber() + getSecondNumber();
    }

    protected double getSubtractionResult() {
        return getFirstNumber() - getSecondNumber();
    }

    protected double getMultiplicationResult() {
        return getFirstNumber() * getSecondNumber();
    }

    protected double getDivisionResult() {
        if (getSecondNumber()==0)return 0;
        return getFirstNumber() / getSecondNumber();
    }
}
