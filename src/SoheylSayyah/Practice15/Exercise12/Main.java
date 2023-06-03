package SoheylSayyah.Practice15.Exercise12;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Your Text :");
        String line = scanner.nextLine();
        flipEndChars(line);
    }

    public static void flipEndChars(String string)
    {
        char first = string.charAt(0);
        char last = string.charAt(string.length()-1);
        String begin = String.valueOf(first);
        String end = String.valueOf(last);
        if (string.length() < 2)
        {
            System.out.println("Incompatible");
        } else if (first == last)
        {
            System.out.println("Two's a Pair");
        } else
        {
            String middle = string.substring(1,string.length() - 1);
            String newString = end.concat(middle).concat(begin);
            System.out.println(newString);
        }
    }
}
