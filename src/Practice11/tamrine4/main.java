package Practice11.tamrine4;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class main {
    public static void main(String[] args) {
        try {FileOutputStream output = new FileOutputStream("/Users/mersedeh/IdeaProjects/untitled5/src/Practice11/tamrine4/output.txt");
             output.write("lkjnjk".getBytes());
             output.close();
        } catch (FileNotFoundException e) {
            System.out.println("your exception is "+ e.getMessage());
}
        catch(IOException e){
            System.out.println("your exception is "+e.getMessage());
        }
    }
}

