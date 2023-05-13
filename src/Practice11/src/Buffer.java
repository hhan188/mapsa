import java.io.*;
import java.util.Scanner;

public class Buffer {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String user=sc.nextLine();

       try{ BufferedReader read=new BufferedReader(new FileReader(user));
           String data;
           while ((data= read.readLine()) !=null){
               System.out.println(data);
           }
       } catch (FileNotFoundException e) {
           e.printStackTrace();
       } catch (IOException e) {
           e.printStackTrace();
       }
    }
}
