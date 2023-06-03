package SoheylSayyah.Practice14.Exercise7;

public class Main {
    public static void main(String[] args) {
        int[] ints = {1,2,3,4,5};
        reverse(ints);
    }
    public static void reverse(int[] ints){
        for (int i = ints.length - 1 ; i >= 0 ; i--) {
            System.out.println(ints[i]);
        }
    }
}
