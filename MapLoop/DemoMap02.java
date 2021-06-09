import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;

public class DemoMap02 {
    public static void main(String[] args){
        Map<String,Integer> map = new HashMap<String,Integer>();
        map.put("ABC",123);
        map.put("EFG",456);
        map.put("HIJ",789);
        Set<Map.Entry<String,Integer>> set = map.entrySet();
        Iterator<Map.Entry<String,Integer>> it = set.iterator();
        while(it.hasNext()){
            Map.Entry<String,Integer> entry = it.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + "=" + value);
        }
        System.out.println("------for ------");
        for(Map.Entry<String,Integer> entry : set){
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + "=" + value);
        }
    }
}
