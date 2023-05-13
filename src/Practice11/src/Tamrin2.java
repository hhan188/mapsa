import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Tamrin2 {
    public static void main(String[] args) {
        try (Scanner sc=new Scanner(new File("pr2.txt"))) {
            while (sc.hasNextLine()){
                String line=sc.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("file not found");
        }
    }
}
