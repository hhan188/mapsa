package Practice15.Switcharoo;

public class Switcharoo {
    public static void main(String[] args) {
        String test="hello";
        System.out.println(flipEndChar(test));
    }
    public static String flipEndChar(String test){
       char[] cha=test.toCharArray();
       char temp=cha[0];
       cha[0]=cha[cha.length-1];
        cha[cha.length-1]=temp;
        if (test.length()<2){
            return "Incompatible";
        }if (cha[0]==cha[cha.length-1]){
            return "Two's a pair";
        }
        return String.valueOf(cha);
    }
}
