import java.util.ArrayList;

public class Demo04 {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(6);
        list.add(1);
        int result = listTest(list,1);
        System.out.println(result);
    }

    public static int listTest(ArrayList<Integer> al,Integer s){
        for(int i=0;i<al.size();i++){
            if(al.get(i).equals(s)){
                return i;
            }
        }
        return -1;
    }
}
