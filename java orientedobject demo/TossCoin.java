

public class TossCoin {
    private int randomNum = (int)(Math.random()*10 - 1);
    public TossCoin(){
        this.print();
    }
    public void print(){
        if(randomNum % 2 == 0){
            System.out.println("upper side");
        }else{
            System.out.println("down side");
        }
    }
}