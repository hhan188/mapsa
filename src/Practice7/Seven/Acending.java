package Practice7.Seven;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Acending {
    public static void main(String[] args) {
        int[] accending=new int[15];
        for (int i = 0; i < accending.length; i++) {
            accending[i]=(int)(Math.random()*2);
        }
        Arrays.sort(accending);
        System.out.println(Arrays.toString(accending));
    }

}
