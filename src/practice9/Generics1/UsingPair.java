package practice9.Generics1;

public class UsingPair {
    public static void main(String[] args) {
        Pair<String,Integer> inBox=new Pair<>("Zahra",23);
        System.out.println(inBox.getName());
        System.out.println(inBox.getThings());
    }
}
