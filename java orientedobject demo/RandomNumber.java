import java.util.Random;

public class RandomNumber {
    private int n;
    private Random random = new Random();
    public RandomNumber(int n){
        this.n = n;
        this.print();
    };
    public void print (){
        int number = random.nextInt(this.n)+1;
        System.out.println(number);
    }
}
