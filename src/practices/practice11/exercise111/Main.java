package practices.practice11.exercise111;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        writeAndReadFromConsoleToFile();
    }


    //Write a program that reads a file path from the user and attempts to open the file using a try-with-resources block.
    // Use a BufferedReader to read the contents of the file and print them to the console.
    protected static void writeAndReadFromConsoleToFile() {
        System.out.print("Please Enter Your File Name: ");
        Scanner sc = new Scanner(System.in);
        String path1 = sc.next();
        String path = "E:\\mapsa\\ershadkhah\\mapsa\\src\\practices\\practice11\\exercise111\\" + path1 + ".csv";
        File file = new File(path);
        List<String> list = new ArrayList<>();

        try (Writer writer = new FileWriter(file, true)) {
            Scanner scanner = new Scanner(System.in);
            String anything;
            while (true) {
                System.out.print("Please Enter Anything: ");
                anything = scanner.next();
                if (anything.contains("exit")){
                    break;
                }
                writer.write(anything+"\n");
            }


        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        try (Reader reader = new FileReader(path)) {
            BufferedReader bf = new BufferedReader(reader);
            String s;
            while (bf.ready()) {
                s = bf.readLine();
                list.add(s);

            }
            System.out.println(list);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
