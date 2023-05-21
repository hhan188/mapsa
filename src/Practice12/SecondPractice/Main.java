package Practice12.SecondPractice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String path = "C:\\Users\\Ehsan\\workspace\\NewMapsaTraining\\word";
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String[] names = (reader.readLine().split(" "));
            try (FileWriter fileWriter = new FileWriter("C:\\Users\\Ehsan\\Desktop\\rep.txt")) {
                for (int i = 0; i < names.length; i++) {
                    if (names[i].equals("ehsan"))
                        names[i] = ("mohammmaaad" + " ");
                }
                fileWriter.write(Arrays.toString(names));
            }catch (Exception e) {
                System.out.println(e.getMessage());
            }
//            fileWriter.write(Arrays.toString(names));

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
