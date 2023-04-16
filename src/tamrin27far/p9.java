package tamrin27far;

import java.util.Scanner;

public class p9 {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your string:");
        String str = scan.nextLine();
        if (str.length() < 3) {
            System.out.println(str);
        }
        System.out.println(removeFirstandLast(str));
    }
        public static String removeFirstandLast(String str){
        str = str.substring (1 ,str.length() -1);
        return str;
    }

    }


