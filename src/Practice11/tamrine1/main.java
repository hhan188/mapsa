package Practice11.tamrine1;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter your input: ");
        String input = scanner.next();
        try {
        int result = Integer.parseInt(input);
        System.out.println(result);
        }catch(NumberFormatException e) {
        System.out.println("number format exception " + e.getMessage());
    }
}
}
