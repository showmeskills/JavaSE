import java.util.Collection;
import java.util.ArrayList;
import java.util.HashSet;
/*
    java.util.Collection 接口
        所有单列集合的最顶层的接口,里边定义了所有单列集合共性的方法
        任意的单列集合都可以使用Collection 接口中的方法
    共性的方法:
        public boolean add(E e): 把给定的对象添加到当前集合中
        public void clear(): 清空集合中所有的元素
        public boolean remove(E e): 把给定的对象在当前集合中删除
        public boolean contains(E e): 判断当前集合中是否包含给定的对象
        public boolean isEmpty(): 判断当前集合是否为空
        public int size(): 返回集合中元素的个数
        public Object[] toArray(): 把集合中的元素,存储到数组中
*/

public class CollectionDome {
    public static void main(String[] args){
      
        demoHashSet();
        // System.out.println(coll);//[] 重写了toString的写法
        // System.out.println(coll1);//[]
 



        //创建集合对象,可以使用多态,向上转型
        // Collection<String> coll = new ArrayList<String>(); 
        // boolean c = coll.add("张三");

        // System.out.println(c);
        // System.out.println(coll);//[]
    }

    public static void demoHashSet(){
        Collection<String> coll1 = new HashSet<String>();
        //public boolean add(E e): 把给定的对象添加到当前集合中
        //无顺,无索引,不能重复; 
        //遍历方法 高级for，适代器
        boolean c1 =coll1.add("张三");
        coll1.add("李四");
        coll1.add("李四");
        coll1.add("李四");
        coll1.add("赵六");
        coll1.add("田七");
        System.out.println(c1);
        System.out.println(coll1);//[李四, 张三, 赵六, 田七]
        //public boolean remove(E e): 把给定的对象在当前集合中删除
        boolean c2 = coll1.remove("李四");
        System.out.println(c2);//true
        System.out.println(coll1);//[张三, 赵六, 田七]
        // public boolean contains(E e): 判断当前集合中是否包含给定的对象
        boolean c3 = coll1.contains("李四");
        System.out.println(c3);//false
        //public boolean isEmpty(): 判断当前集合是否为空
        boolean c4 = coll1.isEmpty();
        System.out.println(c4);//false
        //public int size(): 返回集合中元素的个数
        int c5 = coll1.size();
        System.out.println(c5);
        //public Object[] toArray(): 把集合中的元素,存储到数组中
        Object[] c6 = coll1.toArray();
        for(int i = 0;i < c6.length;i++){
            System.out.println(c6[i]);//张三赵六田七
        }
        // public void clear(): 清空集合中所有的元素
        coll1.clear();
        //public boolean isEmpty(): 判断当前集合是否为空
        System.out.println(coll1.isEmpty());
    }
}