package SoheylSayyah.Practice7.Exercise12;

public class Twelve {
    public static void main(String[] args) {
        String[] array = new String[30];
        array[0] = "h";
        array[1] = "ello";
        for (int i = 2; i < 30; i++) {
            if (i % 5 == 0) {
                array[i] = array[0] + array[1];
            } else {
                array[i] = array[i - 2] + array[i - 1];
            }
        }
        for (int i = 0; i < 30; i++) {
            if (array[i].equalsIgnoreCase("hello")){
                System.out.println(i);
                break;
            }
        }
    }
}