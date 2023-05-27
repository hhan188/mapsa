package practices.practice15.exercise20;

import java.util.Arrays;
import java.util.List;

public class Utils {

    //This Method Used Sorted Array
    protected static int missingNumWithSort(Integer[] integers) {
        if (integers.length == 9) {
            Arrays.sort(integers);
            for (int i = 0; i < integers.length; i++) {
                if (i + 1 != integers[i]) {
                    return i + 1;
                }
            }
        }
        return 10;
    }

    //This Method Didn't Use Sorted Array
    protected static int missingNum(List<Integer> integers) {
        int sum = 0;
        int perfect=0;
        for (int i =1 ; i <=10 ; i++) {
            perfect+=i;
        }
        for (Integer integer : integers) {
            sum += integer;
        }
        return perfect- sum;
    }
}
