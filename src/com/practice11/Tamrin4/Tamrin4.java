package com.practice11.Tamrin4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Tamrin4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Message: ");
        String text = sc.nextLine();

        try (FileOutputStream fos = new FileOutputStream(new File("src/com/practise11/Tamrin4/T4")))
        {
            fos.write(text.getBytes());
        }
        catch (FileNotFoundException e)
        {
            System.err.println("File Can not Save");
        }
        catch (IOException e)
        {
            System.err.println(e.getMessage());
        }


    }
}
