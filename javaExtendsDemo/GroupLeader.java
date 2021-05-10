import java.util.ArrayList;

public class GroupLeader extends User {
    public GroupLeader(){}
    public GroupLeader(String username, int balance){
        super(username,balance);
    }
    /**
     * @Description send money functionality
     * @author Terrance 
     */
    public ArrayList<Integer> sendMoney(int sendTotalMoney, int persons){
        ArrayList<Integer> list = new ArrayList<Integer>();

        int groupLeaderCurrentBalance = super.getBalance();

        if(sendTotalMoney > groupLeaderCurrentBalance){
            System.out.println("your account is insufficient");
            return list;
        }
        //reset balance
        super.setBalance(groupLeaderCurrentBalance-sendTotalMoney);

        int avgs = sendTotalMoney / persons;
        int mod = sendTotalMoney % persons;

        for(int i = 0; i < persons-1; i++){
            list.add(avgs);
        }
        int last = avgs+mod;
        list.add(last);
        return list;
    }
}
