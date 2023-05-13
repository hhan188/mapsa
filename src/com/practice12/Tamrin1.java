package com.practice12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Tamrin1
{
    public static void main(String[] args)
    {
        try (BufferedReader reader = new BufferedReader(new FileReader("src/practice12/T1.csv")))
        {
            String numbers;
            int numbersCounter = 0;
            float sum = 0;
            while ((numbers = reader.readLine()) != null)
            {
                sum += Float.parseFloat(numbers);
                numbersCounter++;
            }
            System.out.println("Average: " + sum / numbersCounter);
        }
        catch (IOException e)
        {
            System.err.println("File Not Found");
        }
    }
}
