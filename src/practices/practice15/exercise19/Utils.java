package practices.practice15.exercise19;

import java.util.List;

public class Utils {
    protected static int findSeat(int capacity, List<Integer> carriages) {
        int maxEachCarriage = capacity / carriages.size() /2;
        int min = 0;
        for (Integer carriage : carriages) {
            if (carriage <= maxEachCarriage) {
                if (carriage > min) {
                    min = carriage;
                }
            }
        }
        return carriages.indexOf(min);
    }
}
