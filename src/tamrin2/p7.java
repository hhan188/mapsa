package tamrin2;

import java.util.Scanner;

public class p7 {

    public static void main(String[] args) {
        System.out.println("* * * * Case Insensitive Comparison * * * *");
        System.out.println("Enter two string to compare");
        System.out.println("Type \"-1\" to exit");
        System.out.println();

        String input;
        String str1;
        String str2;
        boolean result;

        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("Enter first String: ");
            input = sc.nextLine().trim();
            if (input.equals("-1"))
                break;
            str1 = input;

            System.out.println("Enter second String: ");
            input = sc.nextLine().trim();
            if (input.equals("-1"))
                break;
            str2 = input;

            result = match(str1,str2);
            System.out.println("match(" + str1 +"," + str2 +") -> " + result);
        }

    }

    private static boolean match(String str1, String str2) {
        return (str1.equalsIgnoreCase(str2));
    }
}
