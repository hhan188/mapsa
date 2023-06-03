package SoheylSayyah.Practice15.Exercise13;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println(dnaToRna("CGATATA"));
    }
    public static String dnaToRna (String dna){
        char[] chars = dna.toCharArray();
        for (int i = 0; i < dna.length(); i++)
        {
            if (chars[i] == 'A'){
                chars[i] = 'U';
            } else if (chars[i] == 'T'){
                chars[i] = 'A';
            } else if (chars[i] == 'G'){
                chars[i] = 'C';
            }else if (chars[i] == 'C'){
                chars[i] = 'G';
            }
        }
        return String.valueOf(chars);
    }
}
