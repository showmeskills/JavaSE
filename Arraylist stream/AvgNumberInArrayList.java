import java.util.Scanner;
import java.util.ArrayList;
public class AvgNumberInArrayList{
    Scanner scanner = new Scanner(System.in);
    ArrayList<Integer> list = new ArrayList<Integer>();
    
    public AvgNumberInArrayList(){
        this.print();
    }
    public void print(){
        for(int i = 0; i <5;i++){
            System.out.println("please enter your the,"+ (i+1)+",number");
            int num = scanner.nextInt();
            list.add(num);
        }

    System.out.println("平均值:"+list.stream().mapToInt(Number::intValue).average().getAsDouble());
        
    }
}