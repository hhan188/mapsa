package SoheylSayyah.Practice5;

public class Nineteen {
    public static void main(String[] args) {
        int first = 9;
        int second = 99;
        int third = 999;
        System.out.println(hasSameLastDigit(first,second,third));
    }
    public static boolean hasSameLastDigit(int first,int second,int third){
        if (isValid(first,second,third) == true){
            return first % 10 == second % 10 || first % 10 == third % 10 || second % 10 == third % 10;
        }
        return false;
    }
    public static boolean isValid(int first,int second,int third){
        return first >= 10 && first <=1000 && second >= 10 && second <= 1000 && third >= 10 && third <= 1000;
    }
}
