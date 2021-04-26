package JavaPractise;

import java.util.ArrayList;

public class Demo2 {
    //定义指定格式打印集合的方法(Arraylist 类型作为参数),使用{}括起集合,使用@分割每个元素
    //{元素1@元素2@元素3@元素@}
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<String>();
        list.add("zero");
        list.add("fame");
        list.add("anan1");
        list.add("anan2");
        list.add("anan3");
        list.add("anan4");

        Demo2.printArray(list);
        System.out.println(list);
    }

    public static void printArray(ArrayList<String> list){
        System.out.print("{");
        for(int i = 0; i < list.size(); i++){
            String name = list.get(i);
            if(i == list.size()-1){
                System.out.println("}");
            }else{
                System.out.print(name+"@");
            }
        }
    }
}
