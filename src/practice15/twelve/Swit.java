package practice15.twelve;

public class Swit {
    public static String takeString(String str) {


        char[] ch = str.toCharArray();
        if (ch.length<1){
            System.out.println("Incompatible");
        }  if(ch[ch.length-1]==ch[0])  {
            System.out.println("Two a pair");
        }
        char temp = ch[0];
        ch[0] = ch[ch.length - 1];
        ch[ch.length - 1] = temp;


        return String.valueOf(ch);
    }
}
