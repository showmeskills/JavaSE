import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class Demo03 {
    public static void main(String[] args){
        method();
    }
    public static void method(){
        HashSet<Integer> list = new HashSet<Integer>();
     
        int num;
        for(int i = 0; i <10;i++){
            num = (int)(Math.random()*(200-100+1)+100);
            list.add(num);
        }
        System.out.println(list.toString());
        //将hashset 转为 arraylist 
        ArrayList<Integer> arrayList = new ArrayList<Integer>(list);
        Collections.sort(arrayList,new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2){
                return o1- o2;
            }
        });
        for(Integer ele : arrayList){
            System.out.print(ele+",");
        }
    }
}
