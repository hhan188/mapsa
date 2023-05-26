package practices.practice15.exercise13;

public class Utils {
    //a--u
    //t--a
    //g--c
    //c--g
    protected static String dnaToRna(String dna) {
        int counter = 0;
        String temp1= dna.replace('A','U');
        String temp2= temp1.replace('T','A');
        String temp3= temp2.replace('G','C');
        String temp4= temp3.replace('C','G');
        return temp4;


    }
}
