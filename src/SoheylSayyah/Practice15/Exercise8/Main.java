package SoheylSayyah.Practice15.Exercise8;

import java.util.Objects;

public class Main
{
    public static void main(String[] args)
    {
        String[][] strings = new String[][]{
        {"D","E","Y","H","A","D"},
        {"C","B","Z","Y","J","K"},
        {"D","B","C","A","M","N"},
        {"F","G","G","R","S","R"},
        {"V","X","H","A","S","S"},
    };
        int counter = 0;
        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 6; j++)
            {
                if (Objects.equals(strings[i][j], "H")){
                    counter++;
                }
            }
        }
        System.out.println("The Specific Character in The Word Map Repeated " + counter + " Times");
    }
}
