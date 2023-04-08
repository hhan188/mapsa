package test.inheritance1.arrays1.exercise7;

public class PrintLengthOfStrings {
    protected static void strigsLength() {
        String[] strings = {"sima", "reza da", "Salam hi", "Titanic Space Ship", "", "hi", "yes"};
        for (String string : strings) {
            System.out.println("'"+string + "' length is:" + string.length());
        }
    }
}
