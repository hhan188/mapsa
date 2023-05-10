package com.practise11.Tamrin11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Tamrin11
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter File Path: ");
        String path = sc.nextLine();
        try (BufferedReader reader = new BufferedReader(new FileReader(path)))
        {
            String data;
            while ((data = reader.readLine()) != null)
            {
                System.out.println(data);
            }
        } catch (IOException e) {
            System.err.println("File Not Found");
        }

    }
}
