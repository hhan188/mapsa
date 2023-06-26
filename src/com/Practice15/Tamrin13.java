package com.Practice15;

public class Tamrin13
{
    public static void dnaToRna (String dna)
    {
        // A -> U
        // T -> A
        // G -> C
        // C -> G
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < dna.length(); i++)
        {
            if (dna.charAt(i) == 'A')
            {
                result.append("U");
            }
            else if (dna.charAt(i) == 'T')
            {
                result.append("A");
            }
            else if (dna.charAt(i) == 'G')
            {
                result.append("C");
            }
            else if (dna.charAt(i) == 'C')
            {
                result.append("G");
            }
            else
            {
                return;
            }
        }
        System.out.println(result);
    }
}
