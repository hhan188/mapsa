package Practice11.Third;

import java.io.FileInputStream;
import java.io.IOException;

public class Third {
    public static void main(String[] args) {
        String line;
        try {
            FileInputStream fileInputStream = new FileInputStream("0.Text");
            while ((line=String.valueOf(fileInputStream.read()))!=null);{
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("not good");
        }

    }
}
