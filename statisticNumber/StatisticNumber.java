import java.util.Random;
import java.util.ArrayList;

public class StatisticNumber{
    public static void main(String[] args){
        ArrayList<Integer> numList = getNumber();
        printCount(numList);
    }
    public static void printCount(ArrayList<Integer> numList){
        int [] count = new int[10];
        for(int i = 0; i < numList.size(); i++){
            int c = numList.get(i);
            count[c-1]++;
        }
        for(int i = 0; i < count.length; i++){
            System.out.println("number:"+(i+1)+"--"+count[i]+"times");
        }
    }


    public static ArrayList<Integer> getNumber(){
        ArrayList<Integer> list = new ArrayList<Integer>();
        Random random = new Random();
        for(int i = 0; i < 100; i++){
            int num = random.nextInt(10)+1;
            list.add(num);
        }
        return list;
    }
}