package practices.practice15.exercise08;

public class Utils {
    protected static int letterCounter(String[][] strings, String letter) {
        int count = 0;
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings.length; j++) {
                if (letter.equals(strings[i][j])) {
                    count++;
                }

            }
        }
        return count;
    }

    protected static String[][] makeStrings() {
        int count = 1;
        String[][] strings = new String[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                strings[i][j] = count++ + "a";
            }
        }

        return strings;
    }
}
