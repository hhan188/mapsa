package Practice9.Generics.Four;

public class Using {
    public static void main(String[] args) {
        Option<String> presentOption = new Option<>("dabadab");
        presentOption.isPresent();
        Option<Integer> absenceOption = new Option<>(null);
        absenceOption.isPresent();
    }
}
