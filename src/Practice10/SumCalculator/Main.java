package Practice10.SumCalculator;

public class Main {
    public static void main(String[] args) {
        SimpleCalculator si=new SimpleCalculator();
        si.setFirstNumber(25.5);
        si.setSecondNumber(8.5);
        System.out.println("Add="+si.getAdditionResult());
        System.out.println("Subtract="+si.getSubtractionResult());
        System.out.println("Multiplication="+si.getMultiplicationResult());
        System.out.println("Division="+si.getDivisionResult());
    }
}
