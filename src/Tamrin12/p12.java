package Tamrin12;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.InputMismatchException;
import java.util.Scanner;

public class p12 {

   /* public static void main(String[] args) throws Exception {
        String path ="/home/ershadbakhsh/Desktop/hani.txt";
        file( path ,"reza","newName" );
    }*/

    public static void csv() {
        String fileName = "/home/ershadbakhsh/Desktop/hanieh.csv";
        File file = new File(fileName);
        try {
            Scanner inputStream = new Scanner(file);

            double sum = 0;
            double number = 0;
            while (inputStream.hasNext()) {
                String data = inputStream.next();
                sum += Double.valueOf(data);
                number++;
                System.out.println(sum);
            }
            inputStream.close();
            System.out.println("Average - " + (sum / number));
        } catch (InputMismatchException e) {
            throw new NumberFormatException();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void file(String p, String f, String n) throws Exception {
        try {
            Path path = Paths.get(p);
            Charset charset = StandardCharsets.UTF_8;
            String content = new String(Files.readAllBytes(path), charset);
            content = content.replaceAll(f, n);
            Files.write(path, content.getBytes(charset));
        } catch (IOException e) {
            throw new Exception(e.getCause());
        }

    }

    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/home/ershadbakhsh/Downloads/Exercise2/Text.txt"));
            String line;
            while ((line = bufferedReader.readLine()) != null) {

                if (line.equalsIgnoreCase("ali")) {
                    line = "New Name";

                }
                System.out.println(line);

            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}