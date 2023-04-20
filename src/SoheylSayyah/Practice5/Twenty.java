package SoheylSayyah.Practice5;

public class Twenty {
    public static void main(String[] args) {
        int first = 33;
        int second = 66;
        System.out.println(getGreatestCommonDivisor(first,second));
    }
    public static int getGreatestCommonDivisor(int first,int second){
        int greatestCommonDivisor = 1;
        if (first < 10 || second < 10){
            return -1;
        }else {
            for (int i = 1 ; i <= first && i <= second ; i++){
                if (first % i == 0 && second % i == 0){
                    greatestCommonDivisor = i;
                }
            }
        }
        return greatestCommonDivisor;
    }
}
