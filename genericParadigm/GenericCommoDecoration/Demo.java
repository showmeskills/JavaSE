package GenericCommoDecoration;


import java.util.Iterator;
import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Integer> list01 = new ArrayList<>();
        list01.add(1);
        list01.add(2);
        print(list01);
        ArrayList<String> list02 = new ArrayList<>();
        list02.add("a");
        list02.add("b");
        print(list02);
    }

    public static void print(ArrayList<?> list){
        Iterator<?> iterator = list.iterator();
        while(iterator.hasNext()){
            Object obj = iterator.next();
            System.out.println(obj);
        }
    }
}
