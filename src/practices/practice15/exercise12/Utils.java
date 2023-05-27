package practices.practice15.exercise12;

public class Utils {
    protected static String flipEndChars(String letter) {
        int last = letter.length() - 1;
        if (letter.length() < 2) {
            return "Incompatible";
        } else if (letter.charAt(0) == letter.charAt(letter.length() - 1)) {
            return "Two's A Pair";
        } else {
            char tempFirst = letter.charAt(0);
            char tempLast = letter.charAt(last);
            return tempLast + letter.substring(1, last) + tempFirst;
        }
    }
}
