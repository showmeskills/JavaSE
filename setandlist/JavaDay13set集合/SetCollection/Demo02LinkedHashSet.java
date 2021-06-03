package SetCollection;

/*
java.util.LinkedHashSet集合 extends HashSet集合;
LinkedHashSet集合特点:
底层是一个哈希表(数组+链表/红黑树)+链表:多了一条链表(记录元素的存储顺序),保证元素有序
*/
import java.util.HashSet;
import java.util.LinkedHashSet;
public class Demo02LinkedHashSet {
    public static void main(String[] args){
        show01();
    }
    public static void show02(){
        //无序,不允许重复
        HashSet<String> set = new HashSet<String>();
        set.add("www");
        set.add("abc");
        set.add("abc");
        set.add("sixstar");
        System.out.println(set);
    }
    public static void show01 (){
        //有序（因为用到了双向链表） 不允许重复
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("www");
        set.add("abc");
        set.add("abc");
        set.add("sixstar");
        System.out.println(set);
    }
}
