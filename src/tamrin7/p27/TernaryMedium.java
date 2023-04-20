package tamrin7.p27;

public class TernaryMedium {
    public static void main(String[] args) {
        System.out.println(medium1Max(5, 8 , 11));
        System.out.println(medium1Max(11, 5 , 8));

        System.out.println(medium2Grade(59));
        System.out.println(medium2Grade(61));
    }

    public static int medium1Max(int a, int b, int c){
        int result;
         result = b > c ? b : c ;
         result = a > result ? a : result;
         return result;
    }

    public static String medium2Grade(int garde){
        return garde >= 60 ? "pass" : "fail";
    }
}
