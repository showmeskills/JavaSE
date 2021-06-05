import java.util.List;
import java.util.ArrayList;
public class Demo01{
    public static void main(String[] args){
        List<Integer> list = new ArrayList<Integer>();
        for(int i =0 ; i <100; i++){
            list.add(i+1);
        }
        list.remove(10);
        System.out.println(list);
    }
}