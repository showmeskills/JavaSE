import java.util.Scanner;
public class Game{
    int v = 100;
    int num;
    boolean isFlag = true;
    Scanner scanner =new Scanner(System.in);
    public Game(){}
 
    public void guess(){
        while(isFlag){
            int num = scanner.nextInt();
            if(num > this.v){
                System.out.println("your number is large");
            }else if(num < this.v){
                System.out.println("your number is smaller");
            }else{
                System.out.println("your number is correct");
                this.isFlag = false;
            }
        }
    }

}