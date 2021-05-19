import java.util.ArrayList;

import red.OpenMode;

import java.util.Random;
public class RandomMode implements OpenMode {
    @Override
    public ArrayList<Integer> divide (int totalMoney,int totalCount){
        ArrayList<Integer> list = new ArrayList<Integer>();
        Random random = new Random();
        int leftMoney = totalMoney;
        int leftCount = totalCount;
        for(int i = 0; i<totalCount -1;i++){
            int money = random.nextInt(totalMoney/totalCount * 2)+1;
            list.add(money);
            leftMoney -= money;
            leftCount --;
        }
        list.add(leftMoney);
        return list;
    }
}
