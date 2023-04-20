package SoheylSayyah.Practice7.Exercise4;

public class Four {
    public static void main(String[] args) {
        int [] array = new int[100];
        for (int i = 0 ; i < array.length; i++) {
            array[i] = (int) (Math.random() * 1000) + 1;
            System.out.println(array[i]);
        }
    }
}