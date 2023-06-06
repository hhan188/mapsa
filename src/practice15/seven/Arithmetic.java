package practice15.seven;

public class Arithmetic {
    public static double arithmetic(int int1,int int2,String str){
        double temp=0;
        if (str.equals("add")){
           temp= int1+int2;
        } else if (str.equals("subtract")) {
            temp= int1-int2;
            
        }else if (str.equals("divide")){
            temp=int1/int2;
        }return temp;
    }
}
