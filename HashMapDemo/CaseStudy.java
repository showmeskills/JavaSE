import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class CaseStudy{
    public static void main(String[] args){
        HashMap<Integer,String> poker = new HashMap<Integer,String>();
        ArrayList<Integer> pokerIndex = new ArrayList<Integer>();
        List<String> colors = List.of("♠️","♥️","♣️","♦️");
        List<String> numbers = List.of("2","A","K","Q","J","10","9","8","7","6","5","4","3");

        int index = 0;
        poker.put(index,"big");
        pokerIndex.add(index);
        index++;
        poker.put(index,"small");
        pokerIndex.add(index);
        index++;

        for(String number : numbers){
            for(String color : colors){
                poker.put(index,color+number);
                pokerIndex.add(index);
                index++;
            }
        }

        Collections.shuffle(pokerIndex);

        ArrayList<Integer> player01 = new ArrayList<Integer>();
        ArrayList<Integer> player02 = new ArrayList<Integer>();
        ArrayList<Integer> player03 = new ArrayList<Integer>();
        ArrayList<Integer> lastPokers = new ArrayList<Integer>();

        for(int i = 0; i < pokerIndex.size();i++){
            int eleIndex = pokerIndex.get(i);
            if(i >=51){
                lastPokers.add(eleIndex);
            }else if(i%3 == 0){
                player01.add(eleIndex);
            }else if(i%3 == 1){
                player02.add(eleIndex);
            }else if(i%3 == 2){
                player03.add(eleIndex);
            }
        }

        Collections.sort(player01);
        Collections.sort(player02);
        Collections.sort(player03);
        Collections.sort(lastPokers);

        lookPoker("Terry",poker,player01);
        lookPoker("Eirck",poker,player02);
        lookPoker("Loogner",poker,player03);
        lookPoker("last pokers",poker,lastPokers);

    }

    public static void lookPoker (String name,HashMap<Integer,String> poker, ArrayList<Integer> pokerIndex){
        System.out.print(name+":");

        for(Integer key :pokerIndex){
            String value = poker.get(key);
            System.out.print(value+" ");
        }
        System.out.println();

    }
}