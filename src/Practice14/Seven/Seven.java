package Practice14.Seven;

public class Seven {
    public static void main(String[] args) {
      int[] ints ={1,2,34,4};
      reverse(ints);
    }
    public static void reverse(int[] ints){
        for (int i = ints.length-1; i >=0; i--) {
            System.out.println(ints[i]);
        }
    }
}
