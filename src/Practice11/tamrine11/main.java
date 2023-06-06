package Practice11.tamrine11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class main {

        public static void main(String[] args) {
            BufferedReader reader;

            try {
                reader = new BufferedReader(new FileReader("/Users/mersedeh/IdeaProjects/untitled5/src/Practice11/tamrine11/input.txt"));
                String line = reader.readLine();

                while (line != null) {
                    System.out.println(line);
                    line = reader.readLine();
                }

                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

