package Practice15.fourteen;

import java.util.ArrayList;

public class StateNames {
    public static void main(String[] args) {
        String[] states={"Arizona","CA","NY","Nevada"};
        String groupingBY="abb";
        method(states,groupingBY);

    }
    public static void method(String[] names,String group){
        ArrayList<String> arr=new ArrayList<>();
        if(group.equals("abb")){
            for (String name:names){
                if(name.length()==2)
                arr.add(name);
            }
            System.out.println(arr);

        }
        else{
           for (String name:names){
               if(name.length()>2){
                   arr.add(name);
               }
           }
            System.out.println(arr);
        }


    }
}
