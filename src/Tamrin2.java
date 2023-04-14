import java.util.Arrays;
import java.util.Locale;
import java.io.*;
import java.util.Scanner;


public class Tamrin2 {
    public static void main(String[] args) {
        re( 2);
        //makePair(12, 11);
        //int a = even(100);
      //  System.out.println("even= " + a);
    }

    public static void re( int count) {
        String d ="sss";
        
        Scanner n = new Scanner(System.in);
        Object j = n.next();
        //p12
        if (j instanceof Integer) {
            System.out.println("not string!!!!");
        } else {
            //  String str = "abc";
            //  String repeated = String.repeat(3);

        
        }
    }

    public static void k() {

    }

    public static void makePair(int a, int b) {
        int[] array = {a, b};
        System.out.println("array:" + Arrays.toString(array));
        int[] ar = new int[2];
        ar[0] = a;
        ar[1] = b;
        for (int i = 0; i < ar.length; i++) {
            System.out.println("ar: " + i + " " + ar[i]);
        }

    }

    public static void stringInt(String a) {
        int i = Integer.parseInt(a);
    }

    public static int even(int a) {
        int counter = 0;
        for (int i = 0; ; i = 2 + i) {
            counter++;
            if (a == counter) {
                return i;
            }
        }
    }

    public static void string(String s, String r) {

        System.out.println("s = " + s.length());
        System.out.println(s.equalsIgnoreCase(r));
        String[] a = s.split("-");
        char[] b = s.toCharArray();
        System.out.println(s.substring(1, s.length() - 1));
        //p10
        String[] smaller = new String[2];
        smaller[0] = s;
        smaller[1] = r;
        Arrays.sort(smaller);
        System.out.println("smaller:" + smaller[0]);
        //p11


    }
}
