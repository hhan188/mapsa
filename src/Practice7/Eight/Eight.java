package Practice7.Eight;

public class Eight {
    public static void main(String[] args) {
        int [] array1 = {1,2,3,4,5};
        int [] array2 = {6,7,8,9,10};
        int [] sum = new int[5];
        for (int i=0 ;i<array1.length;i++){
            sum[i]=array1[i]+array2[i];
        }
        for (int i = 0; i <5 ; i++) {
            System.out.println(sum[i]);
        }
    }
}
