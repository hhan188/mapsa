package tamrin2;

import java.util.Scanner;

public class p8 {

    public static void main(String[] args) {

        System.out.println("* * * * Count Syllables * * * *");
        System.out.println("Enter a dash separated String to count it's syllables");
        System.out.println("Type \"-1\" to exit");
        System.out.println();

        String input;
        String[] separatedInputArray;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter your String: ");
            input = sc.nextLine().trim();
            if (input.equals("-1"))
                break;
            separatedInputArray = numberSyllables(input);

            /*write output with also checking result of split method*/
            System.out.print("numberSyllables(\"" );
            //print array content
            for (int i =0; i<separatedInputArray.length; i++){
                System.out.print(separatedInputArray[i]);
                if (i != separatedInputArray.length-1)
                    System.out.print("-");
            }

            System.out.print("\") -> ");
            //print number of syllables equal to length of array
            if (separatedInputArray[0].isEmpty() && separatedInputArray.length == 1)
                //print 0 syllables for empty input
                System.out.print("0");
            else
                System.out.print(separatedInputArray.length);

            System.out.println();
        }

    }

    private static String[] numberSyllables(String input) {
        String[] separatedInputArray;
        separatedInputArray = input.split("-");
        return separatedInputArray;

    }
}
