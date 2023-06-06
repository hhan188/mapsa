package Practice11.tamrine9;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main{
    public static void main(String[] args) {


        List<Integer> list = new ArrayList<Integer>();
        File file = new File("/Users/mersedeh/IdeaProjects/untitled5/src/Practice11/tamrine9/numbers.txt");
        BufferedReader reader = null;//**

        try {
            reader = new BufferedReader(new FileReader(file));
            String  text = null;

            while ((text = reader.readLine()) != null) {
                list.add(Integer.parseInt(text));
            }
            int sum=0;
            for (Integer items:list){
                sum+=items;

            }
            System.out.println(sum);
        } catch (NumberFormatException |FileNotFoundException e) {
            System.out.println("your exception was " + e.getMessage());
        }
        catch(IOException e){
            System.out.println("error");
        }
    }
    }

