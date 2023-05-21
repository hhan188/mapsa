package Practice7.TowenySeven;

import java.util.Scanner;

public class Easy1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter false or true");
        boolean easy1= sc.nextBoolean();
        String yesOrNo= easy1 ?"yes":"no";
        System.out.println(yesOrNo);

    }
}
