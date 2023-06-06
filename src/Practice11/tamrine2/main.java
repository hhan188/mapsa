package Practice11.tamrine2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class main {
    public static void main(String[] args) {
        try{
            FileInputStream file=new FileInputStream("/Users/mersedeh/IdeaProjects/untitled5/src/Practice11/tamrine2/input.txt");
            System.out.println("your file is found.");
        }
        catch(FileNotFoundException e){
            System.out.println("file has not been found "+e.getMessage());
        }

    }
}
