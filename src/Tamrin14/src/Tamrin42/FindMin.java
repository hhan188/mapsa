package Tamrin42;

import java.util.Arrays;
import java.util.Scanner;

public class FindMin {
    public static int readIntegre() {
        System.out.println("please enter size for numbers array");
        Scanner sc= new Scanner(System.in);
        int size=sc.nextInt();

        return size;
    }
    public static int[] readElement(int size) {
        Scanner sc = new Scanner(System.in);
        int[] element = new int[size];
        for (int i = 0; i < element.length; i++) {
            System.out.println("please enter value for index" +i);
            element[i]=sc.nextInt();
        }return element;
    }
    public static int findMin(int[] numbers){
        return Arrays.stream(numbers).min().orElse(0);
    }

    public static void main(String[] args) {
        int size= readIntegre();
        int [] numbers= readElement(size);
        System.out.println(findMin(numbers));
    }
}
