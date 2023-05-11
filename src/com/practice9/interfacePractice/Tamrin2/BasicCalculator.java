package com.practice9.interfacePractice.Tamrin2;

public class BasicCalculator implements Calculator
{
    private int num1;
    private int num2;
    private char sign;
    private int result = 0;

    public BasicCalculator(int num1, int num2, char sign) {
        this.num1 = num1;
        this.num2 = num2;
        this.sign = sign;

       switch (this.sign)
       {
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
        result = this.num1 + this.num2;
    }

    @Override
    public void subtract() {
        result = this.num1 - this.num2;
    }

    @Override
    public void multiply() {
        result = this.num1 * this.num2;
    }

    @Override
    public void divide() {
        result = this.num1 / this.num2;
    }

    @Override
    public String toString() {
        return this.num1 + " " + this.sign + " " + this.num2 + " = " + result;
    }
}
