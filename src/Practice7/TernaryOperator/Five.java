package Practice7.TernaryOperator;

public class Five {
    public static void main(String[] args) {
        String word = "DntHvvwls";
        String haveOrNot =
                   word.indexOf('a') != -1
                || word.indexOf("e") != -1
                || word.indexOf("i") != -1
                || word.indexOf("o") != -1
                || word.indexOf("u") != -1
                ? "vowels present" : "no vowels";
        System.out.println(haveOrNot);
    }
}
//
//
//? "vowels present" : "no vowels";