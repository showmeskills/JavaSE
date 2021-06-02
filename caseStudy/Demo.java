import java.util.ArrayList;
import java.util.Collections;

public class Demo{
    public static void main(String[] args) {
        ArrayList<String> poker = new ArrayList<String>();
        String[] colors = {"♠️","♥️","♣️","♦️"};
        String[] numbers = {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
        poker.add("big clown");
        poker.add("small clown");
        for(String number : numbers){
            for(String color : colors){
                poker.add(number+color);
            }
        }
        Collections.shuffle(poker);


        ArrayList<String> player01 = new ArrayList<String>();
        ArrayList<String> player02 = new ArrayList<String>();
        ArrayList<String> player03 = new ArrayList<String>();
        ArrayList<String> lastPokers = new ArrayList<String>();

        for(int i = 0; i <poker.size();i++){
           String singlePoker = poker.get(i);
           if(i>=51){
                lastPokers.add(singlePoker);
           }else if(i%3==0){
                player01.add(singlePoker);
           }else if(i%3==1){
                player02.add(singlePoker);
           }else if(i%3==2){
                player03.add(singlePoker);
           }
        }


        System.out.println("player01:"+player01);
        System.out.println("player02:"+player02);
        System.out.println("player03:"+player03);
        System.out.println("lastPokers:"+lastPokers);

    }   
}