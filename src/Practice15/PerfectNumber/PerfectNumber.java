package Practice15.PerfectNumber;

public class PerfectNumber {
    public static void main(String[] args) {
        int number = 97;
        System.out.println(perfectNumber(number));

    }
    public static boolean perfectNumber(int number){
        int temp = 0;
        for (int i = 1; i <number ; i++) {
            if (number%i==0){
              temp+=i;
            }

        }
        if (temp==number){
            return true;
        }else return false;
    }
}
