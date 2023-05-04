package Practice8_3.P2;

public class BasicCalculator implements Calculator{
    private int int1;
    private int int2;


    @Override
    public void add(int int1, int int2) {
        int int3=int1+int2;
        System.out.println(int3);
    }

    @Override
    public void subtract(int int1, int int2) {
        int int3=int1-int2;
        System.out.println(int3);

    }

    @Override
    public void multiply(int int1, int int2) {
        int int3=int1*int2;
        System.out.println(int3);

    }

    @Override
    public void divide(int int1, int int2) {
        int int3=int1/int2;
        System.out.println(int3);

    }

    @Override
    public String toString() {
        return "BasicCalculator{" +
                "int1=" + int1 +
                ", int2=" + int2 +
                '}';
    }


}
