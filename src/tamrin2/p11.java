package tamrin2;

import java.util.Scanner;

public class p11 {
    public static void main(String[] args) {
        System.out.println("* * * Count instances of a character in a string * * *");
        System.out.println("Note that this program is Case Sensitive");
        System.out.println("Type \"-1\" to exit");
        System.out.println();

        char instanceChar;
        String inputString;
        int count;
        Scanner sc = new Scanner(System.in);

        while (true){
            //getting string
            System.out.print("Enter your String (Case Sensitive, -1 to exit): ");
            inputString = sc.nextLine().trim();
            //checking user exit command
            if (inputString.equals("-1"))
                break;
            //getting character
            System.out.print("Enter the Character you want to count in your input string (Case Sensitive): ");
            instanceChar = sc.nextLine().trim().charAt(0);

            count = charCount(instanceChar,inputString);
            System.out.println("charCount('" + instanceChar + "', \"" + inputString + "\") -> " + count);
        }
    }

    private static int charCount(char instanceChar, String inputString) {

        int count = 0;
        //Counting the character in input stream
        for (int i = 0; i < inputString.length(); i++) {
            if (instanceChar == inputString.charAt(i))
                count++;
        }
        return count;
    }

}