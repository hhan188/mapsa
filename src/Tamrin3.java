import java.util.Arrays;

public class Tamrin3 {
    public static void main(String[] args) {
        string("");
        string(" ");

    }

    public static void string(String s) {
        //p8
        int a = s.length();
        boolean b = s.isEmpty();
    }

    public static Boolean checkEquality(Object a, Object b) {
        //p11
        if (a.getClass() != b.getClass()) {
            return false;
        } else {
            if (a == b) {
                return true;
            }
            return false;
        }
    }

    public static void rotateMaxnumber(String a) {
        //p12
        char[] ar = a.toCharArray();
        String b;
        Arrays.sort(ar);
        for (int i = ar.length-1; i >= 0; i--) {

        }
    }

}
