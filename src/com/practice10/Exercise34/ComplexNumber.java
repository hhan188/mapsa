package com.practice10.Exercise34;

public class ComplexNumber
{
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


    public void add (double real, double imaginary)
    {
        this.real += real;
        this.imaginary += imaginary;
    }

    public void add (ComplexNumber num)
    {
        add(num.real, num.imaginary);
    }

    public void subtract (double real, double imaginary)
    {
        this.real -= real;
        this.imaginary -= imaginary;
    }

    public void subtract (ComplexNumber num)
    {
        subtract(num.real, num.imaginary);
    }
}
