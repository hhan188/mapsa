package practices.practice11.exercise4;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//4-
//Write a program that reads data from the user and writes it to a file using a FileOutputStream.
// Handle the FileNotFoundException that might be thrown if the file cannot be created,
// and the IOException that might be thrown if there is an error writing to the file.
public class Main {
    public static void main(String[] args) {

        File file = new File("D:\\my-new-projects-intellige\\mapsa\\ershadbakhsh\\mapsa\\src\\practices\\practice11\\exercise4\\data.txt");
        try {
            FileWriter writer = new FileWriter(file);
            String temp = "";
            while (true) {
                Scanner input = new Scanner(System.in);
                System.out.print("please enter a value: ");
                temp=input.nextLine();
                writer.append(temp).append(" ");

                if (temp.contains("exit")) {
                    writer.close();
                    return;
                }


            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }


}
