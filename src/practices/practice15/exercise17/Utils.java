package practices.practice15.exercise17;

import java.util.Arrays;

public class Utils {
    protected static Integer maxPossible(int num1,int num2){
        int first=String.valueOf(num1).length();
        String s= num1+String.valueOf(num2);
        String[] strings=s.split("");
        Arrays.sort(strings);
        StringBuilder builder=new StringBuilder();
        for (int i = strings.length-1; i >=0 ; i--) {
            builder.append(strings[i]);
        }
        return Integer.parseInt(builder.substring(0,first));
    }

}
