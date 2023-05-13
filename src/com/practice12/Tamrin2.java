package com.practice12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Tamrin2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter File: ");
        String file = sc.nextLine();

        try (BufferedReader reader = new BufferedReader(new FileReader(file)))
        {
            String line;
            StringBuilder line2 = new StringBuilder();
            StringBuilder result = new StringBuilder();
            while ((line = reader.readLine()) != null)
            {
                line2.append(line);
                System.out.println(line);
            }
            String [] text = line2.toString().split(" ");
            System.out.print("Enter Word to Replace: ");
            String word = sc.next();
            System.out.print("Enter Replacement Word: ");
            String replaceWord = sc.next();
            for (int i = 0; i < text.length; i++)
            {
                if (text[i].equalsIgnoreCase(word))
                {
                    result.append(replaceWord).append(" ");
                }
                else
                {
                    result.append(text[i]).append(" ");
                }
            }

            System.out.println(result.toString());

        }
        catch (IOException e)
        {
            System.err.println("File Not Found");
        }

    }
}
