package Practice10.tamrine1;

import Practice10.tamrine1.SumCalculator;

public class UsingSumCalculator {
    public static void main(String[] args) {
        SumCalculator calculator=new SumCalculator();
        calculator.setFirstNumber(8);
        calculator.setSecondNumber(2);
        System.out.println(calculator.getAdditionResult());
        System.out.println(calculator.getSubtractionResult());
        System.out.println(calculator.getMultiplicationResult());
        System.out.println(calculator.getDivisionResult());

    }
}
