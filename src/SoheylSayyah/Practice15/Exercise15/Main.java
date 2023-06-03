package SoheylSayyah.Practice15.Exercise15;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        int[][] arrays = new int[][]{{4, 2, 4}, {3, 3, 3}, {1, 1, 2}, {2, 1, 1}};
        int result = 0;
        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                result += arrays[i][j];
            }
        }
        System.out.println(result);
    }
}
