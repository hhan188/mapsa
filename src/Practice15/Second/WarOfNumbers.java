package Practice15.Second;

public class WarOfNumbers {
    public static void main(String[] args) {
        int[] arr={12,90,75};
        war(arr);

    }
    public static void war(int[] array){
        int sumOdds=0;
        int sumEvens=0;
        for(int number:array) {
            if (number % 2 == 0) {
                sumEvens+=number;
            }
            else {
                sumOdds+=number;
            }
        }
        if (sumEvens>sumOdds){
            System.out.println(sumEvens-sumOdds);
        }
        else {
            System.out.println(sumOdds-sumEvens);
        }
    }
}
