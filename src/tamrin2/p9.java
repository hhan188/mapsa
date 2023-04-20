package tamrin2;

import java.util.Scanner;

public class p9 {

    public static void main(String[] args) {

        System.out.println("* * * Remove the First & Last Characters * * *");
        System.out.println("Enter a string to apply");
        System.out.println("Type \"-1\" to exit");
        System.out.println();

        String input;
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.print("Enter your String: ");
            input = sc.nextLine().trim();
            if (input.equals("-1"))
                break;
            System.out.println("removeFirstLast(\"" + input + "\") -> " +
                    removeFirstLast(input));
        }
    }

    private static String removeFirstLast(String input) {
        String output="";
        for(int i=1; i <input.length()-1 ; i++)
            output = output + input.charAt(i);
        return output;
    }
}
