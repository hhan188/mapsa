package Practice15.TranscribeTomRna;

public class TranscribeTomRNA {
    public static void main(String[] args) {
        System.out.println(dnaToRna("CGATATA"));
    }
    public static String dnaToRna(String dna){
        char[] test=dna.toCharArray();
        for (int i = 0; i <dna.length() ; i++) {
            if (test[i]=='A'){
                test[i]='U';
            } else if (test[i]=='T') {
                test[i]='A';
            } else if (test[i]=='G') {
                test[i]='C';
            } else if (test[i]=='C') {
                test[i]='G';
            }
        }
        return String.valueOf(test);
        }
    }

