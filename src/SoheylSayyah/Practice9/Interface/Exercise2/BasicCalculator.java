package SoheylSayyah.Practice9.Interface.Exercise2;

public class BasicCalculator implements Calculator{
    private int number1;
    private int number2;
    private char sign;
    private int result = 0;

    public BasicCalculator(int number1, int number2, char sign) {
        this.number1 = number1;
        this.number2 = number2;
        this.sign = sign;
        switch (this.sign){
            case '+':
                add();
                break;
            case '-':
                subtract();
                break;
            case '*':
                multiply();
                break;
            case '/':
                divide();
                break;
        }
    }


    @Override
    public void add() {
        result = this.number1 + this.number2;
    }

    @Override
    public void subtract() {
        result = this.number1 - this.number2;
    }

    @Override
    public void multiply() {
        result = this.number1 * this.number2;
    }

    @Override
    public void divide() {
        result = this.number1 / this.number2;
    }

    @Override
    public String toString() {
        return "BasicCalculator{" +
                "number1=" + number1 +
                ", number2=" + number2 +
                ", sign=" + sign +
                ", result=" + result +
                '}';
    }
}
