package Practice7.Eleven;

public class Eleven {
    public static void main(String[] args) {
        int [] array = new int[25];
        for (int i = 0; i < 25; i++) {
            if (i%2==0){
                array[i]=i;
            }else {
                array[i]=i*2;
            }
        }
        for (int i = 0; i < 25; i++) {
            if (array[i]==10){
                System.out.println(i);
                break;
            }
        }
    }
}
