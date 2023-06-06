package practice9.interface2;

import practice9.interface2.Calculator;

public class BasicCalculator implements Calculator {
    private int firstNum;
    private int secondNum;
    private char operation;


    public BasicCalculator(int firstNum,int secondNum) {
        this.firstNum = firstNum;
        this.secondNum=secondNum;
    }

    public void setOperation(char operation) {
        this.operation = operation;
    }

    public char getOperation() {
        return operation;
    }

    @Override
   public void add(){
       System.out.println(firstNum+secondNum);

   };
   @Override
    public void subtract(){
        System.out.println(firstNum-secondNum);
    };
   @Override

    public void multiply(){
        System.out.println(firstNum*secondNum);
    };
   @Override
    public void divide(){
        System.out.println(firstNum/secondNum);
    };

}
