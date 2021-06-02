package GenericCommoDecoration;
import java.util.ArrayList;
import java.util.Collection;

public class Demo06Generic {
    public static void main(String[] args){
        /*
            类与类之间的继承关系
            Integer extends Number extends Object;
            String extends Object
        */
        Collection<Integer> list1 = new ArrayList<>();
        Collection<String> list2 = new ArrayList<>();
        Collection<Number> list3 = new ArrayList<>();
        Collection<Object> list4 = new ArrayList<>();
        getElement1(list1);
        //getElement1(list2); string 不是number的子类所以报错
        getElement1(list3);
        //getElement1(list4); object 是最大父类,所以报错

        // getElement2(list1);//Integer 不是number的父类所以报错
        // getElement2(list2);//String也是number的父类所以报错
        getElement2(list3);
        getElement2(list4);
    }

    //泛型的上限: 此时的泛型 ?. 必须是Number 类型或者Number类型的子类
    public static void getElement1(Collection<? extends Number> coll){}
    //泛型的下限: 此时的泛型?. 必须是Number类型或者Number类型的父类
    public static void getElement2(Collection<? super Number> coll){}

}