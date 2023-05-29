package Practice12;
import java.io.*;
import java.util.Scanner;

public class txtFile {
    public static void main(String[] args) throws IOException {
        modifyFile("/Users/mersedeh/IdeaProjects/untitled5/src/Practice12/text.txt", "public", "private");

        System.out.println("done");
    }

            static void modifyFile(String filePath, String oldString, String newString)
            {
                File fileToBeModified = new File(filePath);

                String oldContent = "";

                BufferedReader reader = null;

                FileWriter writer = null;

                try
                {
                    reader = new BufferedReader(new FileReader(fileToBeModified));


                    String line = reader.readLine();

                    while (line != null)
                    {
                        oldContent = oldContent + line + System.lineSeparator();

                        line = reader.readLine();
                    }


                    String newContent = oldContent.replaceAll(oldString, newString);


                    writer = new FileWriter(fileToBeModified);

                    writer.write(newContent);
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
                finally
                {
                    try
                    {

                        reader.close();

                        writer.close();
                    }
                    catch (IOException e)
                    {
                        e.printStackTrace();
                    }
                }
            }


        }




