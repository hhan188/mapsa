package tamrin7.p8;
//Problem 8
public class Main {
    public static void main(String[] args) {

        int[] firstIntArray = new int[5];
        firstIntArray[0] = 252;
        firstIntArray[1] = 623;
        firstIntArray[2] = 12;
        firstIntArray[3] = 22;
        firstIntArray[4] = 52;

        int[] secondIntArray = {16,15,13,600,555};

        System.out.println("Print sum of corresponding elements");

        for (int i = 0; i <5 ; i++){
            System.out.println("Sum[" + i + "]: " + (firstIntArray[i] + secondIntArray[i]));
        }
    }
}
