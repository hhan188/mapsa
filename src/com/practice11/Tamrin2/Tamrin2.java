package com.practice11.Tamrin2;

import java.io.FileInputStream;
import java.io.IOException;

public class Tamrin2
{
    public static void main(String[] args)
    {
        String line;
        try (FileInputStream fis = new FileInputStream("data.txt"))
        {
            while ((line = String.valueOf(fis.read())) != null)
            {
                System.out.println(line);
            }
        }
        catch (IOException e)
        {
            System.err.println("File Not Found Exception");
        }
    }
}
