package practices.practice7.exercise27;

public class TernaryUtils {
    public String statusEasy(Boolean status){
        String str=status?"yes":"no";
        return str;
    }
    public int minEasy(int number1,int number2){
        int min=(number1>number2)?number2:number1;
        return min;
    }
    public int maxMedium(int number1,int number2,int number3){
        int max=(number1>number2?number1:number2)>number3?(number1>number2?number1:number2):number3;
        return max;
    }
//    public String student(int grade){}
}
