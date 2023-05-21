package practices.practice11.exercise3;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public  class Main {





    public static void a() {

    }

    public  static void main(String[] args) {

        Console c=System.console();
        System.out.println("Enter your name: ");
        String n=c.readLine();
        System.out.println("Welcome "+n);
    }

    //Write a program that reads a list of numbers from a file and calculates their average.
    // Handle the NumberFormatException that might be thrown if the file contains non-numeric data,
    // and the IOException that might be thrown if there is an error reading the file.
}
