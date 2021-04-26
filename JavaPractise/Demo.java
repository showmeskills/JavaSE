package JavaPractise;

import java.util.ArrayList;
import java.util.Arrays;

//生成6个 1-33随机数
public class Demo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0; i< 6; i++){
            int num = (int)(Math.random()*(33-1+1)+1);
            list.add(num);
        }
        
        System.out.print(list);
    }
}
