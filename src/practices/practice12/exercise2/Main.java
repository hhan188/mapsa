package practices.practice12.exercise2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
// Write a program that reads a text file and replaces all occurrences of a specified word with another word.
// The program should prompt the user to enter the name of the input file, the word to replace, and the replacement word.

    public static void main(String[] args) {
        String oldName = "Yaser";
        String newName = "New Name";
        System.out.println(replace(oldName, newName));

    }


    public static List<String> replace(String oldName, String newName) {
        String path = "E:\\mapsa\\ershadkhah\\mapsa\\src\\practices\\practice12\\exercise2\\test.txt";
        File file = new File(path);
        try (Reader reader = new FileReader(file)) {
            BufferedReader bf = new BufferedReader(reader);
            List<String> strings = new ArrayList<>();
            String name ;
            while (bf.ready()) {
                name = bf.readLine();
                if (name.equalsIgnoreCase(oldName)) {
                    name = newName;
                    strings.add(name);
                } else strings.add(name);
            }
            return strings;

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

}
