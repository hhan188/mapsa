package tamrin43;

import java.util.Arrays;

public class Main {
    private static void reverse(int [] numbers){
        System.out.println(" array is " + Arrays.toString(numbers));
        int j=numbers.length-1;
        for(int i=0;i<numbers.length/2;i++){
          int temp= numbers[i];
          numbers[i]=numbers[j];
          numbers [j]=temp;
          j--;
        }
        System.out.println("reversed array is " + Arrays.toString(numbers));
    }

    public static void main(String[] args) {
        reverse(new int[] {10, 11,12,13,14});
        reverse(new int[] {70, 80, 90, 100, 110, 120});
    }
}
