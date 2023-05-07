package tamrin10.s6p34;

public class ComplexNumber {

    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void add(double real, double imaginary){
        this.real += real;
        this.imaginary += imaginary;
    }

    public void add(ComplexNumber complexNumber){
        add(complexNumber.getReal(),complexNumber.getImaginary());
    }

    public void subtract(double real, double imaginary){
        subtract(new ComplexNumber(real,imaginary));
    }

    public void subtract(ComplexNumber complexNumber){
        this.real -= complexNumber.getReal();
        this.imaginary -= complexNumber.getImaginary();
    }



}
