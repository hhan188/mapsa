package Practice10.Eight;

public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
//        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }
    public void add(double real , double imaginary){
        this.real+=this.real;
        this.imaginary+=this.imaginary;

    }
    public void add(ComplexNumber complexNumber){
        real+=complexNumber.getReal();
        imaginary+= complexNumber.getImaginary();
    }
    public void subtract(double real , double imaginary){
        real+=real;
        imaginary+=imaginary;
    }
    public void subtract(ComplexNumber complexNumber){
        real+=complexNumber.getReal();
        imaginary+=complexNumber.getImaginary();
    }
}
