import java.util.ArrayList;
public class TestClass {
    public static void main(String[] args){


        GroupLeader groupLeader = new GroupLeader("leader",100);
        Members membersA = new Members("MembersA",0);
        Members membersB = new Members("MembersB",0);
        Members membersC = new Members("MembersC",0);
        Members membersD = new Members("MembersD",0);
        System.out.println("---------------");
        ArrayList<Integer> list = groupLeader.sendMoney(50, 4);
        membersA.recieve(list);
        membersB.recieve(list);
        membersC.recieve(list);
        membersD.recieve(list);
        System.out.println("show current balance groupLeader and membersA");
        groupLeader.show();
        membersA.show();
        membersB.show();
        membersC.show();
        membersD.show();

    }
}
