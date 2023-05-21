package Practice10.First;

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
    public double getAdd(){
        double add = firstNumber+secondNumber;
        return add;
    }
    public double getDivide(){
        if (secondNumber==0){
            return 0;
        }
        double divide = firstNumber/secondNumber;
        return divide;
    }
    public double getSub(){
        double sub = firstNumber-secondNumber;
        return sub;
    }
    public double getMul(){
        double mul = firstNumber*secondNumber;
        return mul;
    }
}
