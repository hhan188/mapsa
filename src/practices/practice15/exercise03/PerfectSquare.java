package practices.practice15.exercise03;

import java.util.Arrays;

public class PerfectSquare {
    protected static Integer[][] squarePatch(Integer num) {
        if (num > 0) {
            Integer[][] integers = new Integer[num][num];
            for (int i = 0; i < num; i++) {
                Arrays.fill(integers[i], num);
            }
            for (int i = 0; i < num; i++) {
                if (i / num == 0) {
                    System.out.println(Arrays.toString(integers[i]));
                }
            }
            return integers;
        }return null;
    }

}
