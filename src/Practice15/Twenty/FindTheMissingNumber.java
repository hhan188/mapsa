package Practice15.Twenty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTheMissingNumber {
    public static void main(String[] args) {
        Integer[] num=new Integer[]{1,2,3,4,6,7,8,9,10};
        method(num);

    }
    public static void method(Integer[] numbers){
        List<Integer> arr=new ArrayList<>(Arrays.asList(numbers));
        for (int i = 1; i <11 ; i++) {
            if (arr.contains(i)){
                continue;
            } else {
                System.out.println(i);

            }

        }


    }
}
