package Practice10.tamrine8;

public class Using {
    public static void main(String[] args) {
        ComplexNumber one=new ComplexNumber(1.0,1.0);
        ComplexNumber number=new ComplexNumber(2.5,-1.5);
        one.add(1,1);
        System.out.println("one.real= "+one.getReal());
        System.out.println("one.imaginary= "+one.getImaginary());

        one.Subtarct(number);
        System.out.println("one.real= "+one.getReal());
        System.out.println("one.imaginary= "+one.getImaginary());

        number.Subtarct(one);
        System.out.println("number.real="+number.getReal());
        System.out.println("number.imaginary="+number.getImaginary());


    }
}
