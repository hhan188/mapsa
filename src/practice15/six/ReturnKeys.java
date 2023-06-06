package practice15.six;

import java.util.Map;

public class ReturnKeys {
    public void returnKeys(Map<String,String> map){
        for (String key : map.keySet()){
            System.out.println(key);
        }
    }
}
