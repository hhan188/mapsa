package Practice10.tamrine8;

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
    public void add(double real,double imaginary){
        this.real=this.real+real;
        this.imaginary=this.imaginary+imaginary;
    }
    public double add(ComplexNumber complexnumber){//?
        return complexnumber.getImaginary()+imaginary;
    }
    public double Subtarct(double real,double imaginary){
        return 0.0;

    }
    public void Subtarct(ComplexNumber complexNumber){
       this.real=this.real-complexNumber.real;
       this.imaginary=this.imaginary-complexNumber.imaginary;

    }

}
