package Prac11.P1;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(getNumFromUser());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public static int getNumFromUser() throws IOException {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt())
            throw new IOException("invalid input");

        return sc.nextInt();
    }
}

