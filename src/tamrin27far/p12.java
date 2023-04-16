package tamrin27far;

import java.util.Scanner;
import java.util.StringTokenizer;

public class p12 {


    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your string :");
        String str = scan.nextLine();
        int numberOfTimes = 3;
        if (isInt(str)) {
            System.out.println("Seriously? That was a number.");
        } else {
            System.out.println("Not a number - thanks!");
            String result = repeatString(str, numberOfTimes);
            System.out.println("The String Repeated " + numberOfTimes + " times is : ");
            System.out.println(result);

        }



    }
    public static String repeatString(String str, int n)
    {
        if(str == null || str == "" )
            return str;
        String result = "";
        for ( int i=0;i<n;i++)
        {
            result = result + str;
        }

        return result;
    }
    public static boolean isInt(String s) {
        boolean res;

        try {
            Integer.parseInt(s);
            res = true;
        } catch (NumberFormatException e) {
            res = false;
        }

        return res;
    }
}

