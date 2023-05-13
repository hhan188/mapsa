import java.awt.*;
import java.io.*;

public class Tamrin4 {
    public static void main(String[] args) {
        try{
        FileInputStream in= new FileInputStream("pr4.txt");
        FileOutputStream out= new FileOutputStream("copy34.txt");
        int c;
        while ((c=in.read()) !=-1){
            out.write(c);

        }

        in.close();
        out.close();
            System.out.println("success");
        }catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }try {
            BufferedReader in=new BufferedReader(new FileReader("pr4.txt")) ;
            String data;
            while ((data=in.readLine()) !=null){
            System.out.println(data);}
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
