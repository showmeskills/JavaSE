import java.util.Map;
import java.util.HashMap;
public class DemoMap{
    public static void main(String[] args){
        showPut();
    }
    
    public static void showPut(){
        Map<String,String> map = new HashMap<String,String>();
        String[] arrKey = {"1","2","3","4","5"};
        String[] arrValue = {"张1","张2","张3","张4","张5"};
        for(int i = 0; i < arrKey.length; i++){
            map.put(arrKey[i], arrValue[i]);
        }
       String v1 = map.get( "1" );
       System.out.println(v1);
       String v2 = map.remove("2");
       System.out.println(v2);
       boolean k1 = map.containsKey("5");
       System.out.println(k1);

    }
}