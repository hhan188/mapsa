package SoheylSayyah.Practice10.Exercise34;

public class Main {
    public static void main(String[] args) {
        ComplexNumber one = new ComplexNumber(1.0,1.0);
        ComplexNumber number = new ComplexNumber(2.5,-1.5);
        one.add(1,1);
        System.out.println("One Real = " + one.getReal());
        System.out.println("One Imaginary = " + one.getImaginary());
        one.subtract(number);
        System.out.println("One Real = " + one.getReal());
        System.out.println("One Imaginary = " + one.getImaginary());
        number.subtract(one);
        System.out.println("Number Real = " + number.getReal());
        System.out.println("Number Imaginary = " + number.getImaginary());
    }
}
