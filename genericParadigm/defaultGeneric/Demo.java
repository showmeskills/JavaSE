package defaultGeneric;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo {
    private static void show01(){
        ArrayList list = new ArrayList();
        list.add("abc");
        list.add(1);
        //使用迭代器遍历
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            Object next = iterator.next();
            System.out.println(next);
        }
    }
}
