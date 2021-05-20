import java.util.Random;
import java.util.ArrayList;
public class Tollery {
    private Random random = new Random();
    public Tollery(){
        this.makeNum();
    }
    public void makeNum(){
        ArrayList<Integer> list = new ArrayList<Integer>();
        String arr = "";
        for(int i = 0; i <6;i++){
            int num = random.nextInt(100)+1;
            list.add(num);
            arr+= list.get(i)+" ";
        }

        System.out.println("your tollery numbers is:"+arr);
    }
}
