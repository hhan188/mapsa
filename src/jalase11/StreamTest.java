package jalase11;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class StreamTest {
    public static void main(String[] args) throws FileNotFoundException {
        File file=new File("/Users/mersedeh/Desktop/بایتون\\ ستارخان\\ الارم.mp4");
        InputStream in =new FileInputStream(file);

    }
}
