package practices.practice15.exercise16;

import java.util.Arrays;

public class Utils {
    protected static Integer[] recorderDigit(Integer[] integers, Order order) {
        Integer[] numbers = new Integer[integers.length];
        switch (order) {
            case Asc: {
                for (int i = 0; i < integers.length; i++) {
                    numbers[i] = convertorAsc(integers[i]);
                }
                return numbers;
            }

            case Desc: {
                for (int i = 0; i < integers.length; i++) {
                    numbers[i] = convertorDesc(integers[i]);
                }
                return numbers;

            }
            default:
                return null;
        }
    }


    private static String convert(int number) {
        String temp = String.valueOf(number);
        String[] strings = temp.split("");
        Arrays.sort(strings);
        StringBuilder temp1 = new StringBuilder();

        for (String string : strings) {
            temp1.append(string);
        }
        return temp1.toString();
    }

    private static Integer convertorAsc(int number) {
        return Integer.parseInt(convert(number));
    }

    private static Integer convertorDesc(int number) {
        String number1 = convert(number);
        StringBuilder temp = new StringBuilder();
        for (int i = number1.length() - 1; i >= 0; i--) {
            temp.append(number1.charAt(i));

        }
        return Integer.parseInt(temp.toString());
    }

}
