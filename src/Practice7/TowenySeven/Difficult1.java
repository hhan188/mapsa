package Practice7.TowenySeven;
import java.util.Scanner;
public class Difficult1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your word");
        String newString = sc.nextLine();
        String  check = newString.contains("a")||newString.contains("i")||newString.contains("e")||newString.contains("o")||newString.contains("u") ?"vowels present":"no vowels";
        System.out.println(check);
    }
}
