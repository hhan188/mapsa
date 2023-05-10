package com.practise11.Tamrin3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Tamrin3
{
    public static void main(String[] args)
    {
        String line = "";
        int sum = 0;
        int counter = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader("src/com/practise11/Tamrin3/T3")))
        {
            while ((line = reader.readLine()) != null)
            {
                sum += Integer.parseInt(line);
                counter++;
            }

        } catch (IOException | NumberFormatException e) {
            System.err.println("Invalid Value");
            System.out.println("Average is : " + sum / counter);
        }


    }
}
