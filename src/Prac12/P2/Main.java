package Prac12.P2;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter file name to replace : ");
        String fileName = sc.next();

        System.out.println("please enter the word you want to replace : ");
        String search = sc.next();

        System.out.println("please enter replace word : ");
        String replace = sc.next();

        String text = extractText(fileName);
        String newText = replaceWords(text, search, replace);
        saveFile(fileName, newText);

        System.out.println("success!");
    }

    public static String extractText(String fileName) {
        StringBuilder text = new StringBuilder();
        try(BufferedReader reader = new BufferedReader(new FileReader("src/Prac12/P2/" + fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                text.append(line).append("\n");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return text.toString();
    }

    public static String replaceWords(String text, String search, String replace) {
        return text.replaceAll(search, replace);
    }

    public static void saveFile(String fileName, String text) {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("src/Prac12/P2/" + fileName))) {
            writer.write(text);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
