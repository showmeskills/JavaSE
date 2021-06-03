package Demo01List;

import java.util.LinkedList;

/*
    LinkedList 
    1.底层是一个链表结构:查询慢,增删快
    2.里边包含了大量操作首尾元素的方法
    注意:使用LinkedList集合特有的方法,不能使用多态
    -public void addFirst(E e):将指定元素插入此列表的开头
    -public void addLast(E e):将指定元素添加到此列表的结尾
    -public void push (E e):将元素推入此列表所表示的堆栈 在第一个位置添加元素
    -public E removeFirst():移除并返回此列表的第一个元素
    -public E removeLast():移除并返回此列表的最后一个元素
    -public E pop():从此列表所表示的堆栈处弹出一个元素.此方法相当于removeFirst 移除第一个
    -public boolean isEmpty(): 如果列表不包含元素,则返回true
    -public E getFirst():返回此列表的第一个元素
    -public E getLast():返回此列表的最后一个元素
*/

public class Demo01LinkedList{
    public static void main(String[] args){
        show();

    }

    public static void show (){
        //创建LinkedList集合
        LinkedList<String> linked = new LinkedList<>();
        linked.add("a");
        linked.add("b");
        linked.add("c");
        System.out.println(linked);

        boolean isEmpty = linked.isEmpty();
        System.out.println(isEmpty);

        String first = linked.pop();//移除第一个
        System.out.println(linked+"移除第一个:"+first);

        linked.push("d");//在第一个位置添加
        System.out.println(linked);


        linked.addFirst("abc");
        System.out.println(linked);

        linked.addLast("egf");
        System.out.println(linked);

        // linked.clear();//清空
        // System.out.println(linked);

        if(!linked.isEmpty()){
            //System.out.println("是空的");
            String first01 = linked.getFirst();
            String last01 = linked.getLast();
            System.out.println("first:"+first01+"last:"+last01);
        }
    }
}