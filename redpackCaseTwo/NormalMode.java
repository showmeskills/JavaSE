import red.OpenMode;
import java.util.ArrayList;
public class NormalMode implements OpenMode {
    @Override
    public ArrayList<Integer> divide(int totalMoney,int totalCount){
        ArrayList<Integer> list = new ArrayList<Integer>();
        int packs = totalMoney / totalCount;
        int left = totalMoney % totalCount;
        for(int i = 0; i <totalCount-1; i++){
            list.add(packs);
        }
        list.add(packs+left);
        return list;
    }
}
