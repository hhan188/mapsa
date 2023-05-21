package Practice7.Towelve;

public class Towelve {
    public static void main(String[] args) {
        String [] array= new String[30];
        array [0] = "hello";
        array [1] = "hello";
        for (int i = 2; i < 30; i++) {
            if (i%5 ==0){
                array[i] = array [0] + array [1];
            }else {
                array[i]= array[1-2] +array[i-1];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i].equalsIgnoreCase("hello")){
                System.out.println(i);
                break;
            }
        }
    }
}
