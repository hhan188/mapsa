import java.util.Arrays;

public class Main {


    static void downTriangleStar(int length) {
        String[][] strings = new String[length][length];


        for (int i = 0; i < length; i++) {
            Arrays.fill(strings[i], " ");
        }

        for (int i = 0; i < length; i++) {
            for (int j = length - 1; j > length - i - 2; j--) {
                strings[i][j] = "*";
            }
        }
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print(strings[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int len=7;
        downTriangleStar(len);

    }
}



