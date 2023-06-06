package practice14.reverse;

public class Reverse {
    public static void PrintOriginalArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    };
    public static void   reverse(int[] arr){
        for (int i = arr.length-1; i >=0; i--) {
            System.out.println(arr[i]);

        }
    };
}
