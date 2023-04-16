package tamrin27far;

public class p11 {
    public static void main (String args []){
        String someString = "accomplishment";
        char someChar = 'c';
        int count = 0;

        for (int i = 0; i < someString.length(); i++) {
            if (someString.charAt(i) == someChar) {
                count++;
            }
        }
        System.out.println("Occurrences of "+someChar+" are " +count);
    }
}
