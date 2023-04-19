package Practice7.threeToTwelve;

import java.util.Arrays;

public class threeToTwelve {
    //        ********3********
    public static void three() {
        double[] a = {1, 1, 1, 1, 1};
    }

    //        ********4********
    public static void four() {
        int[] hundred = new int[100];
        for (int i = 0; i < 100; i++) {
            hundred[i] = (int) (Math.random() * 1000 + 1);
        }
    }

    public static void five() {
        double[] av = {3.2, 6.5, 8.7, 5.4, 9.8, 0.1};
        for (int i = 1; i < 6; i++) {
            av[0] += av[i];
        }
        System.out.println(av[0] / av.length);
    }

    public static void six() {
        double[] doubles = {3.2, 6.5, 8.7, 5.4, 9.8, 0.1, 8.2, 100.334, 43, 9};
        double min = 0;
        for (int i = 0; i < 10; i++)
            if (min < doubles[i])
                min = doubles[i];
    }

    public static void seven() {
        int[] numbers = {4, 3, 6, 7, 8, 4, 6, 7, 5, 6, 7, 8, 2, 3, 4};
        int temp;
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 15; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    temp = numbers[j + 1];
                    numbers[j + 1] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
    }

    public static void eight() {
        int[] numbers = {3, 4, 5, 6, 7};
        int[] numbers2 = {6, 7, 8, 9, 0};
        for (int i = 0; i < 5; i++)
            numbers[i] += numbers2[i];
    }

    public static void nine() {
        int[] numbers = {3, 4, 5, 6, 7};
        int[] numbers2 = {6, 7, 8, 9, 0};
        for (int i = 0; i < 5; i++)
            numbers[i] *= numbers2[i];
    }

    public static void ten() {
        Integer[] numbers6 = {1, 2, 3, 8, 7, 6, 5, 4, 3, 2, 1, 5, 6, 7, 8, 9, 5, 0, 9, 7};
        for (int i = 0; i < 20; i++)
            for (int j = 0; j < 20; j++) {
                if (i!=j)
                    if (numbers6[i] == numbers6[j])
                        numbers6[j] = null;
            }
        System.out.println(Arrays.toString(numbers6));
    }

    public static int eleven() {
        int[] firstTen = {1, 2, 3, 8, 7, 6, 5, 4, 3, 2, 1, 5, 6, 7, 8, 9, 5, 0, 9, 7, 10, 34, 45, 56, 67};
        for (int i = 0; i < 25; i++)
            if (firstTen[i] == 10)
                return firstTen[i];
        return -1;
    }

    public static void twelve() {
        String[] firstHello = {"meow", "meow", "hello", "meow", "meow", "meow", "meow", "hello", "meow", "meow", "meow", "meow", "meow", "meow", "meow", "meow", "meow", "meow", "meow", "meow", "meow", "meow", "meow", "meow", "meow", "meow", "meow", "meow", "meow", "meow"};
        for (int i = 0; i < 30; i++)
            if (firstHello[i].equals("hello")) {
                System.out.println("index of first hello is: " + i);
                return;
            }
    }

    public static void main(String[] args) {
        ten();

    }
}
