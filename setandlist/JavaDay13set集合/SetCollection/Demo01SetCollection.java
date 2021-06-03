package SetCollection;

import java.util.Set;
import java.util.HashSet;
/*
    java.util.Set 接口 extends Collection接口
    Set接口的特点:
    1.不允许存储重复的元素:
    2.没有索引,没有带索引的方法,也不能使用普通for循环遍历
    java.util.HashSet集合 implements Set接口
    HashSet 特点:
        1.不允许存储重复的元素
        2.没有索引,没有带索引的方法,也不能使用普通的for循环遍历
        3.是一个无序的集合,存储元素和取出元素的顺序有可能不一致
        4.底层是一个哈希表结构(查询速度非常快)
*/
import java.util.Iterator;


public class Demo01SetCollection{
    public static void main(String[] args){
        Set<Integer> set = new HashSet<Integer>();
        //使用add方法往集合中添加元素
        set.add(3);
        set.add(2);
        set.add(2);
        set.add(1);
        set.add(1);
        set.add(4);
        //使用迭代器遍历set集合
        Iterator<Integer> iterator = set.iterator();
        while(iterator.hasNext()){
            Integer num = iterator.next();
            System.out.println(num);
        }
        show();
    }

    public static void show(){
        //Set集合 不重复原理是底层一哈希表存储
        //String 哈希值一样内容不一样,也不会去重
        Set<String> set = new HashSet<String>();
        String str1 = "abc";
        String str2 = new String("abc2");
        String str3 = "abc1";
        set.add(str1);
        set.add(str2);
        set.add(str3);
        System.out.println(set);
    }
}