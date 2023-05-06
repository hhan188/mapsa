package Practice9.SumCalculator;

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
    public double getAdditionResult(){
        this.firstNumber=firstNumber;
        this.secondNumber=secondNumber;
        return firstNumber+secondNumber;
    }
    public double getSubtractionResult(){
        this.firstNumber=firstNumber;
        this.secondNumber=secondNumber;
        return firstNumber-secondNumber;
    }
    public double getMultiplicationResult(){
        this.firstNumber=firstNumber;
        this.secondNumber=secondNumber;
        return firstNumber*secondNumber;
    }

    public double getDivisionResult(){
        this.firstNumber=firstNumber;
        this.secondNumber=secondNumber;
        return firstNumber/secondNumber;
    }





}
