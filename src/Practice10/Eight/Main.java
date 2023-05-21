package Practice10.Eight;

public class Main {
    public static void main(String[] args) {
        ComplexNumber one =new ComplexNumber(1.0,2.4);
        ComplexNumber two = new ComplexNumber(2.5 , 4.8);
        one.add(two) ;
        two.subtract(one);
        System.out.println("one real:" +one.getReal());
        System.out.println("two real:" + two.getReal());
        one.subtract(two);

    }
}
