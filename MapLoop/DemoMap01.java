import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;

public class DemoMap01{
    public static void main(String[] args){
        Map<String,Integer> map = new HashMap<String,Integer>();
        map.put("ABC",123);
        map.put("EFG",456);
        map.put("HIJ",789);
        Set<String> set = map.keySet();
        Iterator<String> it = set.iterator();
        while(it.hasNext()){
            String key = it.next();
            Integer value = map.get(key);
            System.out.println(key + "=" + value);
        }
        System.out.println("------for---------");
        for(String key : set){
            Integer value = map.get(key);
            System.out.println(key + "=" + value);
        }
    }
}