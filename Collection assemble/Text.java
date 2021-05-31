import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Text {


    public static void main(String[] args){
        //demoArraylist();
        //demoLinkedList();
        //demoHashSet();
        demoLinkedHashSet();
    }
    //ArrayList 接口演示
    public static void demoArraylist (){
        String [] arr = new String[]{"张三","张三","李四","张三","李四","赵六","王五","王五"};
        Collection<String> collArr = new ArrayList<String>();
        for(int i=0; i<arr.length;i++){
            collArr.add(arr[i]);
        }
        collArr.remove(arr[0]);
        boolean check =  collArr.contains("赵六");
        System.out.println(check);
        System.out.println(collArr.size());
        collArr.clear();
        boolean checkEmpty =collArr.isEmpty();
        System.out.println(checkEmpty);
    }
    public static void demoLinkedList (){
        String [] arr = new String[]{"张三","张三","李四","张三","李四","赵六","王五","王五"};
        Collection<String> collArr = new LinkedList<String>();
        for(int i=0; i<arr.length;i++){
            collArr.add(arr[i]);
        }
        System.out.println(collArr);//[张三, 张三, 李四, 张三, 李四, 赵六, 王五, 王五]
    }
    //Set 接口:无序,无索引,不能重复;
    //高级for和失代器; 如果想使用普通for循环需要使用Object[] toArray();方法遍历
    public static void demoHashSet(){
        String [] arr = new String[]{"张三","张三","李四","张三","李四","赵六","王五","王五"};
        Collection<String> collArr = new HashSet<String>();
        for(int i=0; i<arr.length;i++){
            collArr.add(arr[i]);
        }
        System.out.println(collArr);
        //转普通for循环
        Object[] newCollArr = collArr.toArray();
        for(int i=0; i<newCollArr.length;i++){
            System.out.println(newCollArr[i]);
        }
    }
    public static void demoLinkedHashSet(){
        String [] arr = new String[]{"张三","张三","李四","张三","李四","赵六","王五","王五"};
        Collection<String> collArr = new LinkedHashSet<String>();
        for(int i=0; i<arr.length;i++){
            collArr.add(arr[i]);
        }
        System.out.println(collArr);
         //转普通for循环
         Object[] newCollArr = collArr.toArray();
         for(int i=0; i<newCollArr.length;i++){
             System.out.println(newCollArr[i]);
         }
    }

}
