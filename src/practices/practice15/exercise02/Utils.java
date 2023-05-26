package practices.practice15.exercise02;

public class Utils {
    protected static Integer warOfNumbers(Integer[] integers) {
        Integer sumOfOdd = 0;
        Integer sumOfEven = 0;

        for (Integer integer : integers) {
            if (integer % 2 == 0) {
                sumOfEven += integer;
            } else {
                sumOfOdd += integer;
            }
        }
        return sumOfEven - sumOfOdd;
    }


}
