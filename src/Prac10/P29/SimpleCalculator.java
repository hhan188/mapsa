package Prac10.P29;

public class SimpleCalculator {
    private double firstNum;
    private double secondNum;

    public double getFirstNum() {
        return firstNum;
    }

    public void setFirstNum(double firstNum) {
        this.firstNum = firstNum;
    }

    public double getSecondNum() {
        return secondNum;
    }

    public void setSecondNum(double secondNum) {
        this.secondNum = secondNum;
    }

    public double getAdditionResult() {
        return firstNum + secondNum;
    }

    public double getSubtractionResult() {
        return firstNum - secondNum;
    }

    public double getMultiplicationResult() {
        return firstNum * secondNum;
    }

    public double getDivisionResult() {
        if (secondNum == 0)
            return 0;

        return firstNum / secondNum;
    }
}
