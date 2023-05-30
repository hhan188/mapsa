package tamrin16.p3;

public class EvenNumberPredicate implements NumberPredicate{
    @Override
    public boolean test(int num) {
        return num % 2 == 0;
    }
}
