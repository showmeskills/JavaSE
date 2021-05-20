import java.util.Random;


public class Month{
    private Random random = new Random();
    public Month(){};

    public void month(){
        int randomNum = random.nextInt(12)+1;
        System.out.println(randomNum+"月");
    }
}