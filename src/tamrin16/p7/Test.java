package tamrin16.p7;

import java.util.List;

public class Test {
    public static void main(String[] args) {

        List<Integer> test = List.of(10, 20, 30, 40, 50, 60, 70, 80, 90);
        SumAggregator sa = new SumAggregator();
        int sum = sa.aggregate(test);
        System.out.println("Sum of list is: "+ sum);

    }
}

