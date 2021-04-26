package JavaPractise;
import java.util.ArrayList;
import java.util.Random;
public class Demo3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Random rand = new Random();
        for(int i = 0; i <20;i++){
            int num = rand.nextInt(100)+1;
            list.add(num);
        }
        ArrayList<Integer> result = Demo3.getOdd(list);
        System.out.println(result);
    }
    public static ArrayList<Integer> getOdd(ArrayList<Integer> list){
        ArrayList<Integer> smallList = new ArrayList<Integer>();
        for(int i = 0; i < list.size();i++){
            int num = list.get(i);
            if(num%2 ==0){
                smallList.add(num);
            }
        }
     
        return smallList;
    }
}
