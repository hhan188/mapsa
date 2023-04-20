package SoheylSayyah.Practice5;

public class Eighteen {
    public static void main(String[] args) {
        int first = 12;
        int second = 23;
        System.out.println(hasSharedDigit(first,second));
    }
    public static boolean hasSharedDigit(int first,int second){
        return first <= 99 && first >= 10 && second <= 99 && second >= 10 && first / 10 == second / 10 || first % 10 == second % 10 || first / 10 == second % 10 || second / 10 == first % 10;
    }
}
