import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class pr1 {
    public static void main(String[] args) {
        int sum = 0;
        int t=0;

        try {
            BufferedReader reader = new BufferedReader(new FileReader("acc1.csv"));
            String data;
            while ((data=reader.readLine()) !=null){
                sum += Integer.parseInt(data);
                t++;
               double avr=sum/t;
                System.out.println(avr);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
