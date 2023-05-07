package practices.practice10.exercise34;

public class ComplexNumber {

    private double real;
    private double imaginary ;

    public ComplexNumber() {
    }

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }
    protected void add(double real,double imaginary){
      this.imaginary+=imaginary;
      this.real+=real;
    }
    protected void add(ComplexNumber complexNumber){
        this.imaginary+=complexNumber.getImaginary();
        this.real+=complexNumber.real;
    }


    protected void subtract(double real,double imaginary){
        this.imaginary-=imaginary;
        this.real-=real;
    }
    protected void subtract(ComplexNumber complexNumber){
        this.imaginary-=complexNumber.getImaginary();
        this.real-=complexNumber.real;

    }
}
