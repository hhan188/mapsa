package com.Practice21.Tamrin3;

public class Tamrin3
{
    private int [][] matrix ;

    public Tamrin3(int[][] matrix)
    {
        this.matrix = matrix;
        createRandomMatrix();
    }

    public int[][] getMatrix()
    {
        return matrix;
    }

    private void createRandomMatrix()
    {
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                matrix[i][j] = (int)((Math.random())*1000);
            }
        }
    }
}
