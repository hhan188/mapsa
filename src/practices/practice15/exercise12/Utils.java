package practices.practice15.exercise12;

public class Utils {
    protected static String flipEndChars(String letter) {
        if (letter.length() < 2) {
            return "Incompatible";
        } else if (letter.charAt(0) == letter.charAt(letter.length() - 1)) {
            return "Two's A Pair";
        } else {
            char tempFirst = letter.charAt(0);
            char tempLast = letter.charAt(letter.length() - 1);
            String temp = letter.replace(letter.charAt(0), letter.charAt(letter.length()-1));
            System.out.println(temp);
            return temp.replace(temp.charAt(temp.length()-1),tempFirst);

        }


    }
}
