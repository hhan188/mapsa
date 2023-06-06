package practice9.Generics1.tamrine3;

import java.util.List;
import java.util.Objects;

public class Contains {
    //ravesh ostad

    public static <T extends Comparable<T>> boolean contains (T[] objects,T target){
        for(int i=0;i<objects.length-1;i++){
            if(target.compareTo(objects[i])==0){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String[] strings={"sajjad","emami","test"};
        System.out.println(contains(strings,"sajjad"));
    }
//    public static <T> boolean contain(T[] array,T o){
//        for(T item:array){
//            if (item.equals(o)){
//                return true;
//            }
//        }
//        return false;
//    }

    }


