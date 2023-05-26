package practices.practice15.exercise05;

public class Sum {
    protected static int sumOfArraysElements(Integer[] integers) {
        int sum = 0;
        for (Integer integer : integers) {
            sum += integer;
        }
        return sum;
    }
}
