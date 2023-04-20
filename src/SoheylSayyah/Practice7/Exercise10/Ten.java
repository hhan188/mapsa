package SoheylSayyah.Practice7.Exercise10;

public class Ten {
    public static void main(String[] args) {
        int[] array = {1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2};
        int n =array.length;
        n = remove(array,n);
        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }
        }
        public static int remove(int[] array,int n){
        int [] temp = new int[n];
        int j = 0;
        if (n == 0 || n == 1){
            return n;
        }else {
            for (int i = 0; i < n; i++) {
                if (array[i] != array[i+1]){
                    temp[j++] = array[i];
                }
            }
            temp[j++] = array[n-1] ;
            for (int i = 0; i < j; i++) {
                array[i] = temp[i];
            }
        }
            return j;
        }

    }
