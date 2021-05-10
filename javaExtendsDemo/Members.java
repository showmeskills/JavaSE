import java.util.ArrayList;
import java.util.Random;

public class Members extends User {
    
    public Members(){}
    public Members(String username, int balance){
        super(username,balance);
    }

    /**
     * @Description recieve money functionality
     * @author Terrance
     */
    public void recieve(ArrayList<Integer> list){
        int index = new Random().nextInt(list.size());
        int memberBalance = super.getBalance();
        int recieveMoney = list.remove(index);
        super.setBalance(recieveMoney+memberBalance);
    }
}
