package Practice11.Fifth;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Fifth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        try (FileOutputStream file = new FileOutputStream(new File("C:\\Users\\Ehsan\\workspace\\NewMapsaTraining\\0"))){
        file.write(str.getBytes(StandardCharsets.UTF_8));
        } catch (FileNotFoundException e) {
            System.err.println("file not found");
            System.err.println(e.getMessage());

        } catch (IOException e) {
            System.err.println("InValidInput");
            System.err.println(e.getMessage());

        }
    }
}
