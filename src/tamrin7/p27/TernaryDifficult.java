package tamrin7.p27;

public class TernaryDifficult {
    public static void main(String[] args) {

        System.out.println(difficult1Vowels("My sound"));
        System.out.println(difficult1Vowels("My cctv"));

        System.out.println(difficult2Max(9,18,12));
    }

    public static String difficult1Vowels(String input){
        boolean result;
        String inputToLower = input.toLowerCase();
        result = inputToLower.contains("a") || inputToLower.contains("e")
                || inputToLower.contains("o") || inputToLower.contains("i")
                || inputToLower.contains("u");
        return result ? "vowels present" : "no vowels";

    }

    public static int difficult2Max(int a, int b, int c){
        return a > (b > c ? b : c) ? a : (b > c ? b : c);
    }

}
