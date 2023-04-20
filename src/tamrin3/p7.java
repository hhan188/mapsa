package tamrin3;

import java.util.Scanner;

public class p7 {
    public static void main(String[] args) {
        System.out.println("Concatenate First and Lase name into one String");

        String fName;
        String lName;

        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("Type \"-1\" to exit");
            System.out.print("Enter first name: ");
            fName = sc.nextLine().trim();
            if (fName.equals("-1"))
                break;
            System.out.print("Enter second name: ");
            lName = sc.nextLine().trim();
            if (lName.equals("-1"))
                break;
            System.out.println("concatName(\"" + fName +"\", \"" + lName +"\") -> \"" +
                    lName + ", " + fName + "\"");
        }
    }
}