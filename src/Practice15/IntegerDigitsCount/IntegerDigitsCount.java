package Practice15.IntegerDigitsCount;

public class IntegerDigitsCount {
    public static void main(String[] args) {
        int number = 0;
        count(number);
    }
    public static void count(int number){
        int counter=0;
    counter= (int) (Math.log10(number)+1);
    if (number==0){
        System.out.println(1);
    }
    else System.out.println(counter);
    }
}
