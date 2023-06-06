package Practice15.seventh;

import static java.lang.Math.min;

public class BasicArithmeticOperations {
    public static void main(String[] args) {
        method(1,2,"add");
        method(4,5,"subtract");
        method(6,3,"divide");
        method(6,0,"divide");


    }
    public static void method(int num1,int num2,String operator){
        if(operator.equals("add")){
            add(num1,num2,operator);
        } else if (operator.equals("subtract")) {
            subtract(num1,num2,operator);

        }
        else{
            divide(num1,num2,operator);
        }

    }

    public static void add(int num1,int num2,String operator){
        if (operator.equals("add")){
            System.out.println(num1+num2);

        }
    }

    public static void subtract(int num1,int num2,String operator){
        if(operator.equals("subtract")){
            System.out.println(num1-num2);
        }
    }
    public static void divide(int num1,int num2,String operator){
        if(num2==0){
            System.out.println(Integer.MIN_VALUE);
        }
        else{
            System.out.println(num1/num2);

        }
    }


}
