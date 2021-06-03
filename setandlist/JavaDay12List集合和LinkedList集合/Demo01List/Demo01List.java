package Demo01List;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
/*
    List 集合 常用方法
    java.util.List接口 extends Collection接口
    List接口的特点:
    1.有序的集合,存储元素和取出元素的顺序是一致的(存储123,取出123)
    2.有索引,包含了一些带索引的方法
    3.允许存储反复的元素

    List接口中带索引的方法(特有)
        -public void add (int index,E element): 将指定的元素,添加到该集合中的指定位置上.
        -public E get (int index): 返回集合中指定位置的元素.
        -public E remove(int index): 移除列表中指定位置的元素,返回的是被移除的元素
        -public E set(int index,E element):用指定元素替换集合中指定位置的元素,返回值的更新
    
    注意:
        操作索引的时候,一定要防止索引越界异常
        IndexOutOfBoundsException:索引越界异常，集合会报
        ArrayIndexOutOfBoundsException:数组索引越界异常
        StringIndexOutOfBoundsException:字符串索引越界异常
    .set(下标,"替换的内容");
    .add("直接添加内容");
    .add(下标,"添加内容")

*/

public class Demo01List {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");

        //add 方法
        list.add(3,"Terry");
        System.out.println("下标为3的地方添加:"+list);

        //set 替换
        list.set(list.size()-1,"E");
        System.out.println("最后一位被替换了"+list);

        //remove 移除
        list.remove(3);
        System.out.println("下标为3的元素被移除"+list);


        //get 获取
        String el = list.get(0);
        System.out.println("element:"+el);


        Collection<String> newList = new ArrayList<>();
        //增强for循环
        for(String element : list){
            newList.add(element+"-->"+element.toUpperCase());
        }

        System.out.println("newList==>"+newList);

       // System.out.println(list.get(5));//索引越界java.lang.IndexOutOfBoundsException
    }
}