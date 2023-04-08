package practices.practice7.exercise12;

public class Main {
    public static void main(String[] args) {
        String searchWord="hello";
        String[] array={"salam","hi","Hello","foo","jhon","hello","yaser","reza","hello"};
        System.out.println(FindString.finString(searchWord, array));
        System.out.println("*****************************");
        searchWord="NAAAAAA!";
        System.out.println(FindString.finString(searchWord, array));
    }
}
