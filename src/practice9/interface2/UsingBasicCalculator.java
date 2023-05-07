package practice9.interface2;

import practice9.interface2.BasicCalculator;

public class UsingBasicCalculator {
    public static void main(String[] args){
        BasicCalculator calculator=new BasicCalculator(4,2);
        calculator.setOperation('*');
        if (calculator.getOperation()=='*'){
            calculator.multiply();
        }
        else if(calculator.getOperation()=='/'){
            calculator.divide();

        }
        else if(calculator.getOperation()=='+'){
            calculator.add();
        }
        else{
            calculator.subtract();
        }
    }
}
