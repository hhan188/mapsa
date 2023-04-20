package tamrin7.p27;

public class TernaryEasy {
    public static void main(String[] args) {

        easy1(false);
        easy1(true);
        System.out.println(easy2Min(55,65));
        System.out.println(easy2Min(75,65));

    }

    public static void easy1(boolean input){
        String result = input ? "Yes" : "No";
        System.out.println(result);
    }

    public static int easy2Min(int val1, int val2){
        return val1 < val2 ? val1 : val2;

    }

}
