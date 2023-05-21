package Practice7.Ten;

import java.util.Arrays;

public class Ten {
    public static void main(String[] args) {
        Integer [] array = {1,2,2,1,2,1,2,1,2,1,2,2};
        for (int i = 0; i< args.length;i++){
            for (int j = 0; j < array.length; j++) {
                if (i!= j){
                    if (array[i]==array[j]){
                         array[j] = null;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

    }


