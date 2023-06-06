package Practice15.twelveth;

import java.util.Scanner;

public class Switcharoo {
    public static void main(String[] args) {
        String input="ada";
        System.out.println(method(input));;

    }
    public static String method(String str) {
        if (str.length() < 2)
            return "Incompatible";
        else if (str.charAt(0) == str.charAt(str.length() - 1)) {
            return "Two's a pair.";
        } else {
            char[] ch = str.toCharArray();
            char temp = ch[0];
            ch[0] = ch[ch.length - 1];
            ch[ch.length - 1] = temp;
            return String.valueOf(ch);
        }

    }
}
