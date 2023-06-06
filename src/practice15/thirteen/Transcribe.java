package practice15.thirteen;

public class Transcribe {
    public static String transcribeTomRNA(String str){
        char[] chars=str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i]=='A'){
                chars[i]='U';
            } else if (chars[i]=='T') {
                chars[i]='A';
            } else if (chars[i]=='G') {
                chars[i]='C';
            } else if (chars[i]=='C') {
                chars[i]='G';
            }
        }return String.valueOf(chars);
    }
}
