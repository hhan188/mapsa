package com.practice11.Tamrin12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Tamrin12
{
    public static void main(String[] args)
    {

        double avg = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader("src/com/practise11/Tamrin12/T12")))
        {
            double number = 0;
            double sum = 0;
            int counter = 0;

            Scanner sc = new Scanner(reader);
            while ((sc.hasNextDouble()))
            {
                number = sc.nextDouble();
                sum += number;
                counter++;

            }

            System.out.println("The Average is: " + sum / counter);
        } catch (IOException | NoSuchElementException e) {
            System.err.println("File Not Found");
            System.err.println(e.getMessage());
        }
    }
}
