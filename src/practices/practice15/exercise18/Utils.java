package practices.practice15.exercise18;

public class Utils {
    protected static Boolean palindromeDescendant(Integer number) {
        System.out.print(number+":\t ");
        String numberStr = String.valueOf(number);
        int length = numberStr.length();
        if (length % 2 == 0 && length > 3) {
            int leftLen = length / 2;
            String leftSide = numberStr.substring(0, leftLen);
            String rightSide = numberStr.substring(leftLen, length);
            int result = sumSides(leftSide) + sumSides(rightSide);
            if (result > 10) {
                return result % 11 == 0;
            } else return result % 2 == 0;
        } else return number % 11 == 0;
    }

    private static Integer sumSides(String number) {
        int sum = 0;
        for (int i = 0; i < number.length(); i++) {
            sum += Integer.parseInt(String.valueOf(number.charAt(i)));
        }
        return (sum);
    }
}
