package Practice11.seven;

import java.io.*;


public class Main {
    public static void main(String[] args) {
        String string;
        int sum=0;
        try (BufferedReader reader=new BufferedReader(new FileReader("seven.txt"))) {
            while ((string = reader.readLine())!=null){
                sum+=Integer.parseInt(string);
            }
            System.out.println(sum);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } ;



    }
}
