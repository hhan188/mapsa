package practices.practice15.exercise13;

import static practices.practice15.exercise13.Utils.dnaToRna;

public class Main {
    public static void main(String[] args) {

        System.out.println("DNA: "+"ATTAGCGCGATATACGCGTAC  \tRNA: "+dnaToRna("ATTAGCGCGATATACGCGTAC"));
        System.out.println("DNA: "+"CGATATA  \tRNA: "+dnaToRna("CGATATA"));
        System.out.println("DNA: "+"GTCATACGACGTA  \tRNA: "+dnaToRna("GTCATACGACGTA"));
    }
}
