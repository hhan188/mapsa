package tamrin16.p1;

public class LowerCaseOperation implements StringOperation{
    @Override
    public String performOperation(String str) {
        return str.toLowerCase();
    }
}
