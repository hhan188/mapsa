package Practice10.SumCalculator;

public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;

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

    public double getAdditionResult() {
        return secondNumber + firstNumber;
    }

    public double getSubtractionResult() {
        return firstNumber - secondNumber;
    }
    public double getMultiplicationResult(){
        return firstNumber * secondNumber;
    }
    public double getDivisionResult(){
        if (secondNumber==0)
            return 0;
        return firstNumber/secondNumber;
    }

}
