import java.io.*;
import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
            Scanner sc =new Scanner(System.in);
            String user=sc.nextLine();
            String word1=sc.next();
            String word2=sc.next();
            try{ BufferedReader read=new BufferedReader(new FileReader(user));
                BufferedWriter out=new BufferedWriter(new FileWriter("res.txt"));
                String line;
                while ((line= read.readLine()) !=null){
                    String[] word=line.split(" ");
                    for(int i = 0; i<word.length; i++){
                        if(word[i].equals(word1)){
                            word[i]=word2;
                        }System.out.println(String.valueOf(word));
                    } for(int i=0;i<word.length;i++){
                        out.write(String.valueOf(word));
                    }

                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
