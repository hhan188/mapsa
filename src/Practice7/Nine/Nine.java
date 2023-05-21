package Practice7.Nine;

public class Nine {
    public static void main(String[] args) {
        double [] array1 = {1,2,3,4,5};
        double [] array2 = {6,7,8,9,10};
        double [] multy = new double[5];
        for (int i = 0; i < array1.length; i++) {
            multy[i]=array1[i]*array2[i];
        }
        for (int i = 0; i < 5 ; i++) {
            System.out.println(multy[i]);
        }

    }

}
