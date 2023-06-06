package Practice11.tamrine3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        File file = new File("/Users/mersedeh/IdeaProjects/untitled5/src/Practice11/tamrine3/input.txt");
        BufferedReader reader = null;//**

        try {
            reader = new BufferedReader(new FileReader(file));
            String text = null;

            while ((text = reader.readLine()) != null) {
                list.add(Integer.parseInt(text));
            }
            int sum=0;
            for (Integer items:list){
                sum+=items;

            }
            System.out.println(sum/list.size());
        } catch (NumberFormatException |IOException e) {
            System.out.println("your exception was "+e.getMessage());
        }
    }
}