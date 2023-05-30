package tamrin16.p7;

import java.util.List;

public class SumAggregator implements ListAggregator<Integer,Integer>{

    @Override
    public Integer aggregate(List<Integer> list) {
        int sum = 0;
        for (Integer i : list)
            sum += i;
        return sum;
    }

}
