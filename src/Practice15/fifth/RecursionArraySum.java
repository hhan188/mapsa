package Practice15.fifth;

public class RecursionArraySum {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        System.out.println(method(arr));

    }
    public static int method(int[] array){
        int sum=0;
        for (int i = 0; i < array.length+1; i++) {
            sum+=i;

        }
        return sum;

    }
}
